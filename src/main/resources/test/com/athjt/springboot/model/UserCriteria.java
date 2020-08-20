/* https://github.com/orange1438 */
package com.athjt.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 本文件由 https://github.com/orange1438/mybatis-generator-core-chinese-annotation1.3.5-chinese-annotation 自动生成
 * @author orange1438 code generator
 * date:2020/08/17 20:05
 */
public class UserCriteria {
    /** 
     * 排序字段
    */
    protected String orderByClause;

    /** 
     * 过滤重复数据
    */
    protected boolean distinct;

    /** 
     * 查询条件
    */
    protected List<Criteria> oredCriteria;

    /** 
     * 构造查询条件
     */
    public UserCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /** 
     * 设置排序字段
     * @param orderByClause 排序字段
     */
    public final void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** 
     * 获取排序字段
     */
    public final String getOrderByClause() {
        return orderByClause;
    }

    /** 
     * 设置过滤重复数据
     * @param distinct 是否过滤重复数据
     */
    public final void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /** 
     * 是否过滤重复数据
     */
    public final boolean isDistinct() {
        return distinct;
    }

    /** 
     * 获取当前的查询条件实例
     */
    public final List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /** 
     * 增加或者的查询条件,用于构建或者查询
     * @param criteria 过滤条件实例
     */
    public final void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /** 
     * 创建一个新的或者查询条件
     */
    public final Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /** 
     * 创建一个查询条件
     */
    public final Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /** 
     * 内部构建查询条件对象
     */
    protected final Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /** 
     * 清除查询条件
     */
    public final void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * user
     */
    protected abstract static class BaseCriteria {
        protected List<Criterion> criteria;

        protected BaseCriteria() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("head is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("head is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("head =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("head <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("head >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("head >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("head <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("head <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("head like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("head not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("head in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("head not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("head between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("head not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeIsNull() {
            addCriterion("left_eye_degree is null");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeIsNotNull() {
            addCriterion("left_eye_degree is not null");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeEqualTo(Integer value) {
            addCriterion("left_eye_degree =", value, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeNotEqualTo(Integer value) {
            addCriterion("left_eye_degree <>", value, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeGreaterThan(Integer value) {
            addCriterion("left_eye_degree >", value, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_eye_degree >=", value, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeLessThan(Integer value) {
            addCriterion("left_eye_degree <", value, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("left_eye_degree <=", value, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeIn(List<Integer> values) {
            addCriterion("left_eye_degree in", values, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeNotIn(List<Integer> values) {
            addCriterion("left_eye_degree not in", values, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeBetween(Integer value1, Integer value2) {
            addCriterion("left_eye_degree between", value1, value2, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andLeftEyeDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("left_eye_degree not between", value1, value2, "leftEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeIsNull() {
            addCriterion("right_eye_degree is null");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeIsNotNull() {
            addCriterion("right_eye_degree is not null");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeEqualTo(Integer value) {
            addCriterion("right_eye_degree =", value, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeNotEqualTo(Integer value) {
            addCriterion("right_eye_degree <>", value, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeGreaterThan(Integer value) {
            addCriterion("right_eye_degree >", value, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_eye_degree >=", value, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeLessThan(Integer value) {
            addCriterion("right_eye_degree <", value, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("right_eye_degree <=", value, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeIn(List<Integer> values) {
            addCriterion("right_eye_degree in", values, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeNotIn(List<Integer> values) {
            addCriterion("right_eye_degree not in", values, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeBetween(Integer value1, Integer value2) {
            addCriterion("right_eye_degree between", value1, value2, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andRightEyeDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("right_eye_degree not between", value1, value2, "rightEyeDegree");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateIsNull() {
            addCriterion("video_dynamic_rate is null");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateIsNotNull() {
            addCriterion("video_dynamic_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateEqualTo(Double value) {
            addCriterion("video_dynamic_rate =", value, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateNotEqualTo(Double value) {
            addCriterion("video_dynamic_rate <>", value, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateGreaterThan(Double value) {
            addCriterion("video_dynamic_rate >", value, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateGreaterThanOrEqualTo(Double value) {
            addCriterion("video_dynamic_rate >=", value, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateLessThan(Double value) {
            addCriterion("video_dynamic_rate <", value, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateLessThanOrEqualTo(Double value) {
            addCriterion("video_dynamic_rate <=", value, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateIn(List<Double> values) {
            addCriterion("video_dynamic_rate in", values, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateNotIn(List<Double> values) {
            addCriterion("video_dynamic_rate not in", values, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateBetween(Double value1, Double value2) {
            addCriterion("video_dynamic_rate between", value1, value2, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andVideoDynamicRateNotBetween(Double value1, Double value2) {
            addCriterion("video_dynamic_rate not between", value1, value2, "videoDynamicRate");
            return (Criteria) this;
        }

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(Integer value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(Integer value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(Integer value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(Integer value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(Integer value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<Integer> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<Integer> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(Integer value1, Integer value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Byte value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Byte> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Byte> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDiamondIsNull() {
            addCriterion("diamond is null");
            return (Criteria) this;
        }

        public Criteria andDiamondIsNotNull() {
            addCriterion("diamond is not null");
            return (Criteria) this;
        }

        public Criteria andDiamondEqualTo(Integer value) {
            addCriterion("diamond =", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotEqualTo(Integer value) {
            addCriterion("diamond <>", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondGreaterThan(Integer value) {
            addCriterion("diamond >", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondGreaterThanOrEqualTo(Integer value) {
            addCriterion("diamond >=", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondLessThan(Integer value) {
            addCriterion("diamond <", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondLessThanOrEqualTo(Integer value) {
            addCriterion("diamond <=", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondIn(List<Integer> values) {
            addCriterion("diamond in", values, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotIn(List<Integer> values) {
            addCriterion("diamond not in", values, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondBetween(Integer value1, Integer value2) {
            addCriterion("diamond between", value1, value2, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotBetween(Integer value1, Integer value2) {
            addCriterion("diamond not between", value1, value2, "diamond");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("pay_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("pay_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("pay_pwd =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("pay_pwd <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("pay_pwd >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_pwd >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("pay_pwd <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("pay_pwd <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("pay_pwd like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("pay_pwd not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("pay_pwd in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("pay_pwd not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("pay_pwd between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("pay_pwd not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("union_id like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("union_id not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }
    }

    /**
     * user的映射实体
     */
    public static class Criteria extends BaseCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * user的动态SQL对象.
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