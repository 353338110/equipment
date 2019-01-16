package com.wcp.equipment.pojo;

import java.util.Date;

public class Record {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.trade_no
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String tradeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.euipmentId
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String euipmentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.userId
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.status
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.id
     *
     * @return the value of record.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.id
     *
     * @param id the value for record.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.trade_no
     *
     * @return the value of record.trade_no
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.trade_no
     *
     * @param tradeNo the value for record.trade_no
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.euipmentId
     *
     * @return the value of record.euipmentId
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getEuipmentid() {
        return euipmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.euipmentId
     *
     * @param euipmentid the value for record.euipmentId
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setEuipmentid(String euipmentid) {
        this.euipmentid = euipmentid == null ? null : euipmentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.userId
     *
     * @return the value of record.userId
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.userId
     *
     * @param userid the value for record.userId
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.status
     *
     * @return the value of record.status
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.status
     *
     * @param status the value for record.status
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.createTime
     *
     * @return the value of record.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.createTime
     *
     * @param createtime the value for record.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.updateTime
     *
     * @return the value of record.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.updateTime
     *
     * @param updatetime the value for record.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}