/**
 * @Title: AssetServiceTest.java
 * @Package javaoa.test.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月22日
 * @version v1.0
 */
package javaoa.test.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hj.oa.bean.AssetApplyRecord;
import com.hj.oa.bean.Dept;
import com.hj.oa.bean.User;
import com.hj.oa.service.IAssetService;

/**
 * @ClassName: AssetServiceTest
 * @Description: IAssetService接口测试类
 * @author mlsong
 * @date 2019年3月22日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml", "classpath:dispatcher-servlet.xml"})
public class AssetServiceTest {
    
    @Autowired
    @Qualifier("assetService")
    private IAssetService assetService;

    @Test
    public void test1() {
        
        // 插入资产申请记录信息
        AssetApplyRecord record = new AssetApplyRecord();
        record.setApplyer("mlsong");
        record.setApplyerId(123);
        record.setApplyTime(new Date());
        
        // 查询资产申请审批人角色
        // TODO ...已经查完了
        String roleIdList = "57,12,1";
        String[] roleIds = roleIdList.split(","); 
        
        // 设置下一个审批人的角色
        record.setApprovalRoleId(Integer.parseInt(roleIds[0]));
        record.setDeptId(111);
        record.setReason("就像买买买");
        record.setState((byte)0);
        
        int count = assetService.insertRecord(record);
        System.out.println(count);
    }
    
    @Test
    public void findDetailsByRecordIdTest() {
        System.out.println(assetService.findDetailsByRecordId(16));
    }
}
