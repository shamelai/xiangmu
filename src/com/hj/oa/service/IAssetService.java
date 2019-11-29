/**
 * @Title: IAssertService.java
 * @Package com.hj.oa.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author mlsong
 * @date 2019年3月19日
 * @version v1.0
 */
package com.hj.oa.service;

import java.util.List;

import com.hj.commons.Result;
import com.hj.oa.bean.AssetApplyDetail;
import com.hj.oa.bean.AssetApplyRecord;
import com.hj.oa.bean.AssetType;
import com.hj.oa.bean.Role;

/**
 * @ClassName: IAssertService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mlsong
 * @date 2019年3月19日
 *
 */
public interface IAssetService {

    /**
     * @Title: getAllAssetType
     * @Description: 查询所有资产类别信息
     * @param @return 参数
     * @return Result 返回类型
     * @throws
     */
    Result<List<AssetType>> getAllAssetType();

    /**
     * @Title: insertRecord
     * @Description: 插入用户申请记录
     * @param @param record 参数
     * @return int 返回类型
     *      插入数据的主键id
     * @throws
     */
    int insertRecord(AssetApplyRecord record);

    
    /**
     * @Title: insertDetails
     * @Description: 保存申请记录的详细信息
     * @param @param details 参数
     * @return void 返回类型
     * @throws
     */
    void insertDetails(List<AssetApplyDetail> details);

    /**
     * @Title: findlRecordsByRoles
     * @Description: 根据角色查找待审批申请记录
     * @param @param roles
     * @param @return 参数
     * @return List<AssetApplyRecord> 返回类型
     * @throws
     */
    List<AssetApplyRecord> findlRecordsByRoles(List<Role> roles);

    AssetApplyRecord findRecordById(int recordId);

    List<AssetApplyDetail> findDetailsByRecordId(int recordId);

    void handleApply(int recordId, int sp, String yj);

}
