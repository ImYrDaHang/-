package com.imyrdahang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnshrinesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnshrinesExample() {
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

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Integer value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Integer value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Integer value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Integer> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andEUrlIsNull() {
            addCriterion("e_url is null");
            return (Criteria) this;
        }

        public Criteria andEUrlIsNotNull() {
            addCriterion("e_url is not null");
            return (Criteria) this;
        }

        public Criteria andEUrlEqualTo(String value) {
            addCriterion("e_url =", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlNotEqualTo(String value) {
            addCriterion("e_url <>", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlGreaterThan(String value) {
            addCriterion("e_url >", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlGreaterThanOrEqualTo(String value) {
            addCriterion("e_url >=", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlLessThan(String value) {
            addCriterion("e_url <", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlLessThanOrEqualTo(String value) {
            addCriterion("e_url <=", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlLike(String value) {
            addCriterion("e_url like", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlNotLike(String value) {
            addCriterion("e_url not like", value, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlIn(List<String> values) {
            addCriterion("e_url in", values, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlNotIn(List<String> values) {
            addCriterion("e_url not in", values, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlBetween(String value1, String value2) {
            addCriterion("e_url between", value1, value2, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEUrlNotBetween(String value1, String value2) {
            addCriterion("e_url not between", value1, value2, "eUrl");
            return (Criteria) this;
        }

        public Criteria andEDepictIsNull() {
            addCriterion("e_depict is null");
            return (Criteria) this;
        }

        public Criteria andEDepictIsNotNull() {
            addCriterion("e_depict is not null");
            return (Criteria) this;
        }

        public Criteria andEDepictEqualTo(String value) {
            addCriterion("e_depict =", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictNotEqualTo(String value) {
            addCriterion("e_depict <>", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictGreaterThan(String value) {
            addCriterion("e_depict >", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictGreaterThanOrEqualTo(String value) {
            addCriterion("e_depict >=", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictLessThan(String value) {
            addCriterion("e_depict <", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictLessThanOrEqualTo(String value) {
            addCriterion("e_depict <=", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictLike(String value) {
            addCriterion("e_depict like", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictNotLike(String value) {
            addCriterion("e_depict not like", value, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictIn(List<String> values) {
            addCriterion("e_depict in", values, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictNotIn(List<String> values) {
            addCriterion("e_depict not in", values, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictBetween(String value1, String value2) {
            addCriterion("e_depict between", value1, value2, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEDepictNotBetween(String value1, String value2) {
            addCriterion("e_depict not between", value1, value2, "eDepict");
            return (Criteria) this;
        }

        public Criteria andEStateIsNull() {
            addCriterion("e_state is null");
            return (Criteria) this;
        }

        public Criteria andEStateIsNotNull() {
            addCriterion("e_state is not null");
            return (Criteria) this;
        }

        public Criteria andEStateEqualTo(Integer value) {
            addCriterion("e_state =", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotEqualTo(Integer value) {
            addCriterion("e_state <>", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateGreaterThan(Integer value) {
            addCriterion("e_state >", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_state >=", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateLessThan(Integer value) {
            addCriterion("e_state <", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateLessThanOrEqualTo(Integer value) {
            addCriterion("e_state <=", value, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateIn(List<Integer> values) {
            addCriterion("e_state in", values, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotIn(List<Integer> values) {
            addCriterion("e_state not in", values, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateBetween(Integer value1, Integer value2) {
            addCriterion("e_state between", value1, value2, "eState");
            return (Criteria) this;
        }

        public Criteria andEStateNotBetween(Integer value1, Integer value2) {
            addCriterion("e_state not between", value1, value2, "eState");
            return (Criteria) this;
        }

        public Criteria andEUIdIsNull() {
            addCriterion("e_u_id is null");
            return (Criteria) this;
        }

        public Criteria andEUIdIsNotNull() {
            addCriterion("e_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andEUIdEqualTo(Integer value) {
            addCriterion("e_u_id =", value, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdNotEqualTo(Integer value) {
            addCriterion("e_u_id <>", value, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdGreaterThan(Integer value) {
            addCriterion("e_u_id >", value, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_u_id >=", value, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdLessThan(Integer value) {
            addCriterion("e_u_id <", value, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_u_id <=", value, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdIn(List<Integer> values) {
            addCriterion("e_u_id in", values, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdNotIn(List<Integer> values) {
            addCriterion("e_u_id not in", values, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdBetween(Integer value1, Integer value2) {
            addCriterion("e_u_id between", value1, value2, "eUId");
            return (Criteria) this;
        }

        public Criteria andEUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_u_id not between", value1, value2, "eUId");
            return (Criteria) this;
        }

        public Criteria andECreateDateIsNull() {
            addCriterion("e_create_date is null");
            return (Criteria) this;
        }

        public Criteria andECreateDateIsNotNull() {
            addCriterion("e_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andECreateDateEqualTo(Date value) {
            addCriterion("e_create_date =", value, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateNotEqualTo(Date value) {
            addCriterion("e_create_date <>", value, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateGreaterThan(Date value) {
            addCriterion("e_create_date >", value, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("e_create_date >=", value, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateLessThan(Date value) {
            addCriterion("e_create_date <", value, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateLessThanOrEqualTo(Date value) {
            addCriterion("e_create_date <=", value, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateIn(List<Date> values) {
            addCriterion("e_create_date in", values, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateNotIn(List<Date> values) {
            addCriterion("e_create_date not in", values, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateBetween(Date value1, Date value2) {
            addCriterion("e_create_date between", value1, value2, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andECreateDateNotBetween(Date value1, Date value2) {
            addCriterion("e_create_date not between", value1, value2, "eCreateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateIsNull() {
            addCriterion("e_update_date is null");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateIsNotNull() {
            addCriterion("e_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateEqualTo(Date value) {
            addCriterion("e_update_date =", value, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateNotEqualTo(Date value) {
            addCriterion("e_update_date <>", value, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateGreaterThan(Date value) {
            addCriterion("e_update_date >", value, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("e_update_date >=", value, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateLessThan(Date value) {
            addCriterion("e_update_date <", value, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("e_update_date <=", value, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateIn(List<Date> values) {
            addCriterion("e_update_date in", values, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateNotIn(List<Date> values) {
            addCriterion("e_update_date not in", values, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateBetween(Date value1, Date value2) {
            addCriterion("e_update_date between", value1, value2, "eUpdateDate");
            return (Criteria) this;
        }

        public Criteria andEUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("e_update_date not between", value1, value2, "eUpdateDate");
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