package com.hj.oa.dao;

import com.hj.oa.bean.ApprovalRecord;
import com.hj.oa.bean.ApprovalRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int countByExample(ApprovalRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int deleteByExample(ApprovalRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int insert(ApprovalRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int insertSelective(ApprovalRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    List<ApprovalRecord> selectByExample(ApprovalRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    ApprovalRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ApprovalRecord record, @Param("example") ApprovalRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ApprovalRecord record, @Param("example") ApprovalRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ApprovalRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_approval_record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ApprovalRecord record);
}