package com.wcp.equipment.pojo;

import java.util.Date;

public class MerchantInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.app_id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.sign
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String sign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.notify_url
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String notifyUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.app_auth_token
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String appAuthToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.store_id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.merchantPrivateKey
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String merchantprivatekey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.alipayPublicKey
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String alipaypublickey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.productName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String productname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.subProductName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private String subproductname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.maxAmount
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Integer maxamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.successAmount
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Integer successamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchantinfo.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.id
     *
     * @return the value of merchantinfo.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.id
     *
     * @param id the value for merchantinfo.id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.app_id
     *
     * @return the value of merchantinfo.app_id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.app_id
     *
     * @param appId the value for merchantinfo.app_id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.sign
     *
     * @return the value of merchantinfo.sign
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.sign
     *
     * @param sign the value for merchantinfo.sign
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.notify_url
     *
     * @return the value of merchantinfo.notify_url
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.notify_url
     *
     * @param notifyUrl the value for merchantinfo.notify_url
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.app_auth_token
     *
     * @return the value of merchantinfo.app_auth_token
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getAppAuthToken() {
        return appAuthToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.app_auth_token
     *
     * @param appAuthToken the value for merchantinfo.app_auth_token
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken == null ? null : appAuthToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.store_id
     *
     * @return the value of merchantinfo.store_id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.store_id
     *
     * @param storeId the value for merchantinfo.store_id
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.merchantPrivateKey
     *
     * @return the value of merchantinfo.merchantPrivateKey
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getMerchantprivatekey() {
        return merchantprivatekey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.merchantPrivateKey
     *
     * @param merchantprivatekey the value for merchantinfo.merchantPrivateKey
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setMerchantprivatekey(String merchantprivatekey) {
        this.merchantprivatekey = merchantprivatekey == null ? null : merchantprivatekey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.alipayPublicKey
     *
     * @return the value of merchantinfo.alipayPublicKey
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getAlipaypublickey() {
        return alipaypublickey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.alipayPublicKey
     *
     * @param alipaypublickey the value for merchantinfo.alipayPublicKey
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setAlipaypublickey(String alipaypublickey) {
        this.alipaypublickey = alipaypublickey == null ? null : alipaypublickey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.productName
     *
     * @return the value of merchantinfo.productName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.productName
     *
     * @param productname the value for merchantinfo.productName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.subProductName
     *
     * @return the value of merchantinfo.subProductName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public String getSubproductname() {
        return subproductname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.subProductName
     *
     * @param subproductname the value for merchantinfo.subProductName
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setSubproductname(String subproductname) {
        this.subproductname = subproductname == null ? null : subproductname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.maxAmount
     *
     * @return the value of merchantinfo.maxAmount
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Integer getMaxamount() {
        return maxamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.maxAmount
     *
     * @param maxamount the value for merchantinfo.maxAmount
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setMaxamount(Integer maxamount) {
        this.maxamount = maxamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.successAmount
     *
     * @return the value of merchantinfo.successAmount
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Integer getSuccessamount() {
        return successamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.successAmount
     *
     * @param successamount the value for merchantinfo.successAmount
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setSuccessamount(Integer successamount) {
        this.successamount = successamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.createTime
     *
     * @return the value of merchantinfo.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.createTime
     *
     * @param createtime the value for merchantinfo.createTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchantinfo.updateTime
     *
     * @return the value of merchantinfo.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchantinfo.updateTime
     *
     * @param updatetime the value for merchantinfo.updateTime
     *
     * @mbggenerated Wed Jan 16 23:56:19 CST 2019
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}