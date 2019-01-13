package com.wcp.equipment.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public MerchantExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenIsNull() {
            addCriterion("app_auth_token is null");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenIsNotNull() {
            addCriterion("app_auth_token is not null");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenEqualTo(String value) {
            addCriterion("app_auth_token =", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenNotEqualTo(String value) {
            addCriterion("app_auth_token <>", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenGreaterThan(String value) {
            addCriterion("app_auth_token >", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenGreaterThanOrEqualTo(String value) {
            addCriterion("app_auth_token >=", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenLessThan(String value) {
            addCriterion("app_auth_token <", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenLessThanOrEqualTo(String value) {
            addCriterion("app_auth_token <=", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenLike(String value) {
            addCriterion("app_auth_token like", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenNotLike(String value) {
            addCriterion("app_auth_token not like", value, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenIn(List<String> values) {
            addCriterion("app_auth_token in", values, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenNotIn(List<String> values) {
            addCriterion("app_auth_token not in", values, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenBetween(String value1, String value2) {
            addCriterion("app_auth_token between", value1, value2, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andAppAuthTokenNotBetween(String value1, String value2) {
            addCriterion("app_auth_token not between", value1, value2, "appAuthToken");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyIsNull() {
            addCriterion("merchantPrivateKey is null");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyIsNotNull() {
            addCriterion("merchantPrivateKey is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyEqualTo(String value) {
            addCriterion("merchantPrivateKey =", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyNotEqualTo(String value) {
            addCriterion("merchantPrivateKey <>", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyGreaterThan(String value) {
            addCriterion("merchantPrivateKey >", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyGreaterThanOrEqualTo(String value) {
            addCriterion("merchantPrivateKey >=", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyLessThan(String value) {
            addCriterion("merchantPrivateKey <", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyLessThanOrEqualTo(String value) {
            addCriterion("merchantPrivateKey <=", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyLike(String value) {
            addCriterion("merchantPrivateKey like", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyNotLike(String value) {
            addCriterion("merchantPrivateKey not like", value, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyIn(List<String> values) {
            addCriterion("merchantPrivateKey in", values, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyNotIn(List<String> values) {
            addCriterion("merchantPrivateKey not in", values, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyBetween(String value1, String value2) {
            addCriterion("merchantPrivateKey between", value1, value2, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andMerchantprivatekeyNotBetween(String value1, String value2) {
            addCriterion("merchantPrivateKey not between", value1, value2, "merchantprivatekey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyIsNull() {
            addCriterion("alipayPublicKey is null");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyIsNotNull() {
            addCriterion("alipayPublicKey is not null");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyEqualTo(String value) {
            addCriterion("alipayPublicKey =", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyNotEqualTo(String value) {
            addCriterion("alipayPublicKey <>", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyGreaterThan(String value) {
            addCriterion("alipayPublicKey >", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyGreaterThanOrEqualTo(String value) {
            addCriterion("alipayPublicKey >=", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyLessThan(String value) {
            addCriterion("alipayPublicKey <", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyLessThanOrEqualTo(String value) {
            addCriterion("alipayPublicKey <=", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyLike(String value) {
            addCriterion("alipayPublicKey like", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyNotLike(String value) {
            addCriterion("alipayPublicKey not like", value, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyIn(List<String> values) {
            addCriterion("alipayPublicKey in", values, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyNotIn(List<String> values) {
            addCriterion("alipayPublicKey not in", values, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyBetween(String value1, String value2) {
            addCriterion("alipayPublicKey between", value1, value2, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andAlipaypublickeyNotBetween(String value1, String value2) {
            addCriterion("alipayPublicKey not between", value1, value2, "alipaypublickey");
            return (Criteria) this;
        }

        public Criteria andEquimentidIsNull() {
            addCriterion("equimentId is null");
            return (Criteria) this;
        }

        public Criteria andEquimentidIsNotNull() {
            addCriterion("equimentId is not null");
            return (Criteria) this;
        }

        public Criteria andEquimentidEqualTo(String value) {
            addCriterion("equimentId =", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotEqualTo(String value) {
            addCriterion("equimentId <>", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidGreaterThan(String value) {
            addCriterion("equimentId >", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidGreaterThanOrEqualTo(String value) {
            addCriterion("equimentId >=", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidLessThan(String value) {
            addCriterion("equimentId <", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidLessThanOrEqualTo(String value) {
            addCriterion("equimentId <=", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidLike(String value) {
            addCriterion("equimentId like", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotLike(String value) {
            addCriterion("equimentId not like", value, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidIn(List<String> values) {
            addCriterion("equimentId in", values, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotIn(List<String> values) {
            addCriterion("equimentId not in", values, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidBetween(String value1, String value2) {
            addCriterion("equimentId between", value1, value2, "equimentid");
            return (Criteria) this;
        }

        public Criteria andEquimentidNotBetween(String value1, String value2) {
            addCriterion("equimentId not between", value1, value2, "equimentid");
            return (Criteria) this;
        }

        public Criteria andMosttimesIsNull() {
            addCriterion("mostTimes is null");
            return (Criteria) this;
        }

        public Criteria andMosttimesIsNotNull() {
            addCriterion("mostTimes is not null");
            return (Criteria) this;
        }

        public Criteria andMosttimesEqualTo(Integer value) {
            addCriterion("mostTimes =", value, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesNotEqualTo(Integer value) {
            addCriterion("mostTimes <>", value, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesGreaterThan(Integer value) {
            addCriterion("mostTimes >", value, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("mostTimes >=", value, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesLessThan(Integer value) {
            addCriterion("mostTimes <", value, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesLessThanOrEqualTo(Integer value) {
            addCriterion("mostTimes <=", value, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesIn(List<Integer> values) {
            addCriterion("mostTimes in", values, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesNotIn(List<Integer> values) {
            addCriterion("mostTimes not in", values, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesBetween(Integer value1, Integer value2) {
            addCriterion("mostTimes between", value1, value2, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andMosttimesNotBetween(Integer value1, Integer value2) {
            addCriterion("mostTimes not between", value1, value2, "mosttimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesIsNull() {
            addCriterion("successTimes is null");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesIsNotNull() {
            addCriterion("successTimes is not null");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesEqualTo(Integer value) {
            addCriterion("successTimes =", value, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesNotEqualTo(Integer value) {
            addCriterion("successTimes <>", value, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesGreaterThan(Integer value) {
            addCriterion("successTimes >", value, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("successTimes >=", value, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesLessThan(Integer value) {
            addCriterion("successTimes <", value, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesLessThanOrEqualTo(Integer value) {
            addCriterion("successTimes <=", value, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesIn(List<Integer> values) {
            addCriterion("successTimes in", values, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesNotIn(List<Integer> values) {
            addCriterion("successTimes not in", values, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesBetween(Integer value1, Integer value2) {
            addCriterion("successTimes between", value1, value2, "successtimes");
            return (Criteria) this;
        }

        public Criteria andSuccesstimesNotBetween(Integer value1, Integer value2) {
            addCriterion("successTimes not between", value1, value2, "successtimes");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table merchant
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 01 17:02:13 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table merchant
     *
     * @mbggenerated Tue Jan 01 17:02:13 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}