package com.wcp.equipment.dao;

import com.wcp.equipment.pojo.AlipayRecord;
import com.wcp.equipment.pojo.AlipayRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int countByExample(AlipayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int deleteByExample(AlipayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int insert(AlipayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int insertSelective(AlipayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    List<AlipayRecord> selectByExample(AlipayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    AlipayRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") AlipayRecord record, @Param("example") AlipayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByExample(@Param("record") AlipayRecord record, @Param("example") AlipayRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByPrimaryKeySelective(AlipayRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alipayrecord
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByPrimaryKey(AlipayRecord record);

    List<AlipayRecord> selectByJS(@Param("start")int start,@Param("length")int length);
}