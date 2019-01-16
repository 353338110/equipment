package com.wcp.equipment.pojo;

import java.util.Date;

public class Equipment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.equipmentName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String equipmentname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.equipmentDesc
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String equipmentdesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.pic
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.count
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column equipment.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.id
     *
     * @return the value of equipment.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.id
     *
     * @param id the value for equipment.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.equipmentName
     *
     * @return the value of equipment.equipmentName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getEquipmentname() {
        return equipmentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.equipmentName
     *
     * @param equipmentname the value for equipment.equipmentName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname == null ? null : equipmentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.equipmentDesc
     *
     * @return the value of equipment.equipmentDesc
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getEquipmentdesc() {
        return equipmentdesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.equipmentDesc
     *
     * @param equipmentdesc the value for equipment.equipmentDesc
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setEquipmentdesc(String equipmentdesc) {
        this.equipmentdesc = equipmentdesc == null ? null : equipmentdesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.pic
     *
     * @return the value of equipment.pic
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.pic
     *
     * @param pic the value for equipment.pic
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.count
     *
     * @return the value of equipment.count
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.count
     *
     * @param count the value for equipment.count
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.createTime
     *
     * @return the value of equipment.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.createTime
     *
     * @param createtime the value for equipment.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column equipment.updateTime
     *
     * @return the value of equipment.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column equipment.updateTime
     *
     * @param updatetime the value for equipment.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}