/**
 * @Title: AssetController.java
 * @Package com.hj.oa.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月19日
 * @version v1.0
 */
package com.hj.oa.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONArray;
import com.hj.commons.Result;
import com.hj.commons.ResultCode;
import com.hj.oa.bean.AssetApplyDetail;
import com.hj.oa.bean.AssetApplyRecord;
import com.hj.oa.bean.AssetType;
import com.hj.oa.bean.Dept;
import com.hj.oa.bean.Role;
import com.hj.oa.bean.User;
import com.hj.oa.service.IAssetService;

/**
 * @ClassName: AssetController
 * @Description: 资产管理模块控制器
 * @author mlsong
 * @date 2019年3月19日
 */
@Controller
@RequestMapping("asset")
public class AssetController {
    
    /**
     * 资产模块业务处理器
     */
    @Autowired
    @Qualifier("assetService")
    private IAssetService assetService;

    /**
     * @Title: applyPage
     * @Description: 转发资产申请页面
     * @param @return 参数
     * @return String 返回类型
     * @throws
     */
    @RequestMapping(value = "apply", method = RequestMethod.GET)
    public String applyPage(Model model) {
        // 查询所有的资产类别, 绑定待jsp页面
        Result<List<AssetType>> result = assetService.getAllAssetType();
        if (result.getState() == ResultCode.SUCCESS.getCode()) {
            // 查询成功绑定数据
            model.addAttribute("types", result.getData());
        }
        
        return "oa/asset/apply";
    }
    
    @RequestMapping(value ="apply", method = RequestMethod.POST)
    public String apply(Model model, HttpSession session) {
        try {
            User loginUser = (User)session.getAttribute("loginUser");
            Dept loginDept = (Dept)session.getAttribute("loginUserDept");
            
            // 插入资产申请记录信息
            AssetApplyRecord record = new AssetApplyRecord();
            record.setApplyer(loginUser.getName());
            record.setApplyerId(loginUser.getId());
            record.setApplyTime(new Date());
            
            // 查询资产申请审批人角色
            // TODO ...已经查完了
            String roleIdList = "57,12,1";
            String[] roleIds = roleIdList.split(","); 
            
            // 设置下一个审批人的角色
            record.setApprovalRoleId(Integer.parseInt(roleIds[0]));
            record.setDeptId(loginDept.getId());
            record.setReason("就像买买买");
            record.setState((byte)0);
            
            int recordId = assetService.insertRecord(record);
            System.out.println(recordId);
            
            
            // 获取数据, 读取data.json
            
            FileInputStream fis = new FileInputStream("C:/Users/Administrator/Desktop/oa/javaoa/src/data.json");
            
            byte[] bts = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int length = -1;
            while ((length = fis.read(bts)) != -1) {
                sb.append(new String(bts, 0, length));
            }
            
            // 将数据转换成实体类对象
            List<AssetApplyDetail> details = JSONArray.parseArray(sb.toString(), AssetApplyDetail.class);
            
            for (AssetApplyDetail detail : details) {
                detail.setRecordId(recordId);
            }
            
            // 将记录插入到数据库表中
            assetService.insertDetails(details);
            
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        
        return "redirect:/web/asset/apply";
    }
    
    
    /**
     * @Title: approvalPage
     * @Description: 资产采购审批页面
     * @param @return 参数
     * @return String 返回类型
     * @throws
     */
    @RequestMapping(value = "approval", method = RequestMethod.GET)
    public String approvalPage(HttpSession session, Model model) {
        
        List<Role> roles = (List<Role>)session.getAttribute("loginUserRoles");
        
        // 根据当前登录用户, 查找需要当前登录用户审批的记录
        List<AssetApplyRecord> records = assetService.findlRecordsByRoles(roles);
        
        model.addAttribute("records", records);
        
        return "oa/asset/approval";
    }
    
    @RequestMapping(value = "approval", method = RequestMethod.POST)
    public String approval(int recordId, int sp, String yj, Model model) {
        System.out.println(recordId);
        System.out.println(sp);
        System.out.println(yj);
        
        // 处理申请
        assetService.handleApply(recordId, sp, yj);
        
        
        // 重定向到审批列表页, 继续进行审批
        return "redirect:/web/asset/approval";
    }
    
    
    @RequestMapping("approval/detail/{recordId}")
    public String approvalDetailPage(@PathVariable int recordId, Model model) {
        // TODO 查询申请记录
        AssetApplyRecord record = assetService.findRecordById(recordId);
        // TODO 查询该申请的详细产品
        List<AssetApplyDetail> details = assetService.findDetailsByRecordId(recordId);
        
        // 数据绑定
        model.addAttribute("record", record);
        model.addAttribute("details", details);
        
        
        // 转发到详情页面
        return "oa/asset/detail";
    }
    
    
    public static void main(String[] args) {
        try {
            // TODO 获取数据, 读取data.json
            FileInputStream fis = new FileInputStream("src/data.json");
            
            byte[] bts = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int length = -1;
            while ((length = fis.read(bts)) != -1) {
                sb.append(new String(bts, 0, length));
            }
            // 将数据转换成实体类对象
            List<AssetApplyDetail> details = JSONArray.parseArray(sb.toString(), AssetApplyDetail.class);
            
            for (AssetApplyDetail detail : details) {
//                detail.setRecordId(recordId);
            }
            
            System.out.println(details.get(0).getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
