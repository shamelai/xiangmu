package com.hj.oa.dao;

import com.hj.oa.bean.AssetApplyRecord;
import com.hj.oa.bean.AssetApplyRecordExample;
import com.hj.oa.bean.Role;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: AssetApplyRecordMapper
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mlsong
 * @date 2019年3月22日
 *
 */
public interface AssetApplyRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int countByExample(AssetApplyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int deleteByExample(AssetApplyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int insert(AssetApplyRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int insertSelective(AssetApplyRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    List<AssetApplyRecord> selectByExample(AssetApplyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    AssetApplyRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AssetApplyRecord record, @Param("example") AssetApplyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AssetApplyRecord record, @Param("example") AssetApplyRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AssetApplyRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_asset_apply_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AssetApplyRecord record);
    
    
    
    /**
     * @Title: selectByRecord
     * @Description: 根据跳进进行记录查询
     * @param @param record
     * @param @return 参数
     * @return List<AssetApplyRecord> 返回类型
     * @throws
     */
    List<AssetApplyRecord> selectByRecord(AssetApplyRecord record);

    /**
     * @Title: selectRecordsByRoles
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param roles
     * @param @return 参数
     * @return List<AssetApplyRecord> 返回类型
     * @throws
     */
    List<AssetApplyRecord> selectRecordsByRoles(List<Role> roles);
}