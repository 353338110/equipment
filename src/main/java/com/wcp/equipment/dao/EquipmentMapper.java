package com.wcp.equipment.dao;

import com.wcp.equipment.pojo.Equipment;
import com.wcp.equipment.pojo.EquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int countByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int deleteByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int insert(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int insertSelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    List<Equipment> selectByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    Equipment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByPrimaryKeySelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table equipment
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    int updateByPrimaryKey(Equipment record);
}