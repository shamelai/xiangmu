/**
 * @Title: AssertServiceImpl.java
 * @Package com.hj.oa.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月19日
 * @version v1.0
 */
package com.hj.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hj.commons.ApprovalType;
import com.hj.commons.Result;
import com.hj.oa.bean.ApprovalList;
import com.hj.oa.bean.AssetApplyDetail;
import com.hj.oa.bean.AssetApplyDetailExample;
import com.hj.oa.bean.AssetApplyRecord;
import com.hj.oa.bean.AssetType;
import com.hj.oa.bean.Role;
import com.hj.oa.dao.AssetApplyDetailMapper;
import com.hj.oa.dao.AssetApplyRecordMapper;
import com.hj.oa.dao.IAssetTypeDao;
import com.hj.oa.service.ApprovalService;
import com.hj.oa.service.IAssetService;

/**
 * @ClassName: AssertServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mlsong
 * @date 2019年3月19日
 *
 */
@Service("assetService")
public class AssetServiceImpl implements IAssetService {
    @Autowired
    @Qualifier("approvalService")
    private ApprovalService approvalService;

    @Autowired
    @Qualifier("assetTypeDao")
    private IAssetTypeDao assetTypeDao;
    
    @Autowired
    private AssetApplyRecordMapper assetApplyRecordMapper;
    
    @Autowired
    private AssetApplyDetailMapper assetApplyDetailMapper;
    
    /* (非 Javadoc)
     *
     * @return
     * @see com.hj.oa.service.IAssetService#getAllAssetType()
     */
    @Override
    public Result<List<AssetType>> getAllAssetType() {
       
        Result<List<AssetType>> result = new Result<List<AssetType>>();
        
        // 查询assetType表中所有的数据
        List<AssetType> types = assetTypeDao.selectAll();
        
        // 将查询结果,封装到结果集
        result.setData(types);
        
        return result;
    }

    @Override
    public int insertRecord(AssetApplyRecord record) {
        // TODO Auto-generated method stub
        assetApplyRecordMapper.insert(record);
        return record.getId();
    }

    @Override
    public void insertDetails(List<AssetApplyDetail> details) {
        for (AssetApplyDetail detail : details) { 
            assetApplyDetailMapper.insert(detail);
        }
        
    }

    @Override
    public List<AssetApplyRecord> findlRecordsByRoles(List<Role> roles) {
        return assetApplyRecordMapper.selectRecordsByRoles(roles);
    }

    @Override
    public AssetApplyRecord findRecordById(int recordId) {
        return assetApplyRecordMapper.selectByPrimaryKey(recordId);
    }

    @Override
    public List<AssetApplyDetail> findDetailsByRecordId(int recordId) {
        AssetApplyDetailExample example = new AssetApplyDetailExample();
        
        example.createCriteria().andRecordIdEqualTo(recordId);
        
        return assetApplyDetailMapper.selectByExample(example );
    }

    @Override
    public void handleApply(int recordId, int sp, String yj) {
        // 判断审批通过或者不同故
        if (sp == 1) {
            AssetApplyRecord record = assetApplyRecordMapper.selectByPrimaryKey(recordId);
            
            int roleId = record.getApprovalRoleId();
            // 审批通过
            ApprovalList approvalList = approvalService.getApprovalListByType(ApprovalType.ASSET_APPLY);
            // 取出roleList字段
            String rolesStr = approvalList.getRoleList();
            String[] rolesArr = rolesStr.split(",");
            
            int i = 0;
            for (; i < rolesArr.length; i++) {
                if (rolesArr[i].equals(new Integer(roleId).toString())) {
                    break;
                }
            }
            
            i++;
            if (i == rolesArr.length) {
                // 已经是最后一个人审批了, state 设置为 1
            } else {
                // 不是最后一个人审批, 下一级审批人的id
                int id = Integer.parseInt(rolesArr[i]);
                // TODO 将该id更新到record记录表中
            }
            
        } else if (sp == 0) {
            AssetApplyRecord record = new AssetApplyRecord();
            record.setId(recordId);
            record.setState((byte)-1);
            // 审批不通过, 修改记录表中的state字段, 设置为-1: 表示不通过
            assetApplyRecordMapper.updateByPrimaryKeySelective(record );
            
        }
        
    }

}
