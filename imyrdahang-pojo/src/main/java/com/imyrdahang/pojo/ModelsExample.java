package com.imyrdahang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMFIdIsNull() {
            addCriterion("m_f_id is null");
            return (Criteria) this;
        }

        public Criteria andMFIdIsNotNull() {
            addCriterion("m_f_id is not null");
            return (Criteria) this;
        }

        public Criteria andMFIdEqualTo(Integer value) {
            addCriterion("m_f_id =", value, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdNotEqualTo(Integer value) {
            addCriterion("m_f_id <>", value, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdGreaterThan(Integer value) {
            addCriterion("m_f_id >", value, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_f_id >=", value, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdLessThan(Integer value) {
            addCriterion("m_f_id <", value, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_f_id <=", value, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdIn(List<Integer> values) {
            addCriterion("m_f_id in", values, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdNotIn(List<Integer> values) {
            addCriterion("m_f_id not in", values, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdBetween(Integer value1, Integer value2) {
            addCriterion("m_f_id between", value1, value2, "mFId");
            return (Criteria) this;
        }

        public Criteria andMFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_f_id not between", value1, value2, "mFId");
            return (Criteria) this;
        }

        public Criteria andMDepictIsNull() {
            addCriterion("m_depict is null");
            return (Criteria) this;
        }

        public Criteria andMDepictIsNotNull() {
            addCriterion("m_depict is not null");
            return (Criteria) this;
        }

        public Criteria andMDepictEqualTo(String value) {
            addCriterion("m_depict =", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictNotEqualTo(String value) {
            addCriterion("m_depict <>", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictGreaterThan(String value) {
            addCriterion("m_depict >", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictGreaterThanOrEqualTo(String value) {
            addCriterion("m_depict >=", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictLessThan(String value) {
            addCriterion("m_depict <", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictLessThanOrEqualTo(String value) {
            addCriterion("m_depict <=", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictLike(String value) {
            addCriterion("m_depict like", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictNotLike(String value) {
            addCriterion("m_depict not like", value, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictIn(List<String> values) {
            addCriterion("m_depict in", values, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictNotIn(List<String> values) {
            addCriterion("m_depict not in", values, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictBetween(String value1, String value2) {
            addCriterion("m_depict between", value1, value2, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMDepictNotBetween(String value1, String value2) {
            addCriterion("m_depict not between", value1, value2, "mDepict");
            return (Criteria) this;
        }

        public Criteria andMKeywordIsNull() {
            addCriterion("m_keyword is null");
            return (Criteria) this;
        }

        public Criteria andMKeywordIsNotNull() {
            addCriterion("m_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andMKeywordEqualTo(String value) {
            addCriterion("m_keyword =", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordNotEqualTo(String value) {
            addCriterion("m_keyword <>", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordGreaterThan(String value) {
            addCriterion("m_keyword >", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("m_keyword >=", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordLessThan(String value) {
            addCriterion("m_keyword <", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordLessThanOrEqualTo(String value) {
            addCriterion("m_keyword <=", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordLike(String value) {
            addCriterion("m_keyword like", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordNotLike(String value) {
            addCriterion("m_keyword not like", value, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordIn(List<String> values) {
            addCriterion("m_keyword in", values, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordNotIn(List<String> values) {
            addCriterion("m_keyword not in", values, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordBetween(String value1, String value2) {
            addCriterion("m_keyword between", value1, value2, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMKeywordNotBetween(String value1, String value2) {
            addCriterion("m_keyword not between", value1, value2, "mKeyword");
            return (Criteria) this;
        }

        public Criteria andMASumIsNull() {
            addCriterion("m_a_sum is null");
            return (Criteria) this;
        }

        public Criteria andMASumIsNotNull() {
            addCriterion("m_a_sum is not null");
            return (Criteria) this;
        }

        public Criteria andMASumEqualTo(Integer value) {
            addCriterion("m_a_sum =", value, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumNotEqualTo(Integer value) {
            addCriterion("m_a_sum <>", value, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumGreaterThan(Integer value) {
            addCriterion("m_a_sum >", value, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_a_sum >=", value, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumLessThan(Integer value) {
            addCriterion("m_a_sum <", value, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumLessThanOrEqualTo(Integer value) {
            addCriterion("m_a_sum <=", value, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumIn(List<Integer> values) {
            addCriterion("m_a_sum in", values, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumNotIn(List<Integer> values) {
            addCriterion("m_a_sum not in", values, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumBetween(Integer value1, Integer value2) {
            addCriterion("m_a_sum between", value1, value2, "mASum");
            return (Criteria) this;
        }

        public Criteria andMASumNotBetween(Integer value1, Integer value2) {
            addCriterion("m_a_sum not between", value1, value2, "mASum");
            return (Criteria) this;
        }

        public Criteria andMCreateDateIsNull() {
            addCriterion("m_create_date is null");
            return (Criteria) this;
        }

        public Criteria andMCreateDateIsNotNull() {
            addCriterion("m_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andMCreateDateEqualTo(Date value) {
            addCriterion("m_create_date =", value, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateNotEqualTo(Date value) {
            addCriterion("m_create_date <>", value, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateGreaterThan(Date value) {
            addCriterion("m_create_date >", value, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("m_create_date >=", value, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateLessThan(Date value) {
            addCriterion("m_create_date <", value, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("m_create_date <=", value, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateIn(List<Date> values) {
            addCriterion("m_create_date in", values, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateNotIn(List<Date> values) {
            addCriterion("m_create_date not in", values, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateBetween(Date value1, Date value2) {
            addCriterion("m_create_date between", value1, value2, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("m_create_date not between", value1, value2, "mCreateDate");
            return (Criteria) this;
        }

        public Criteria andMUIdIsNull() {
            addCriterion("m_u_id is null");
            return (Criteria) this;
        }

        public Criteria andMUIdIsNotNull() {
            addCriterion("m_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andMUIdEqualTo(Integer value) {
            addCriterion("m_u_id =", value, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdNotEqualTo(Integer value) {
            addCriterion("m_u_id <>", value, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdGreaterThan(Integer value) {
            addCriterion("m_u_id >", value, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_u_id >=", value, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdLessThan(Integer value) {
            addCriterion("m_u_id <", value, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_u_id <=", value, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdIn(List<Integer> values) {
            addCriterion("m_u_id in", values, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdNotIn(List<Integer> values) {
            addCriterion("m_u_id not in", values, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdBetween(Integer value1, Integer value2) {
            addCriterion("m_u_id between", value1, value2, "mUId");
            return (Criteria) this;
        }

        public Criteria andMUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_u_id not between", value1, value2, "mUId");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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