package com.imyrdahang.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleContentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleContentsExample() {
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

        public Criteria andACIdIsNull() {
            addCriterion("a_c_id is null");
            return (Criteria) this;
        }

        public Criteria andACIdIsNotNull() {
            addCriterion("a_c_id is not null");
            return (Criteria) this;
        }

        public Criteria andACIdEqualTo(Integer value) {
            addCriterion("a_c_id =", value, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdNotEqualTo(Integer value) {
            addCriterion("a_c_id <>", value, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdGreaterThan(Integer value) {
            addCriterion("a_c_id >", value, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_c_id >=", value, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdLessThan(Integer value) {
            addCriterion("a_c_id <", value, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_c_id <=", value, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdIn(List<Integer> values) {
            addCriterion("a_c_id in", values, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdNotIn(List<Integer> values) {
            addCriterion("a_c_id not in", values, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdBetween(Integer value1, Integer value2) {
            addCriterion("a_c_id between", value1, value2, "aCId");
            return (Criteria) this;
        }

        public Criteria andACIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_c_id not between", value1, value2, "aCId");
            return (Criteria) this;
        }

        public Criteria andACKeywordIsNull() {
            addCriterion("a_c_keyword is null");
            return (Criteria) this;
        }

        public Criteria andACKeywordIsNotNull() {
            addCriterion("a_c_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andACKeywordEqualTo(String value) {
            addCriterion("a_c_keyword =", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordNotEqualTo(String value) {
            addCriterion("a_c_keyword <>", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordGreaterThan(String value) {
            addCriterion("a_c_keyword >", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("a_c_keyword >=", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordLessThan(String value) {
            addCriterion("a_c_keyword <", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordLessThanOrEqualTo(String value) {
            addCriterion("a_c_keyword <=", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordLike(String value) {
            addCriterion("a_c_keyword like", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordNotLike(String value) {
            addCriterion("a_c_keyword not like", value, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordIn(List<String> values) {
            addCriterion("a_c_keyword in", values, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordNotIn(List<String> values) {
            addCriterion("a_c_keyword not in", values, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordBetween(String value1, String value2) {
            addCriterion("a_c_keyword between", value1, value2, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACKeywordNotBetween(String value1, String value2) {
            addCriterion("a_c_keyword not between", value1, value2, "aCKeyword");
            return (Criteria) this;
        }

        public Criteria andACDepictIsNull() {
            addCriterion("a_c_depict is null");
            return (Criteria) this;
        }

        public Criteria andACDepictIsNotNull() {
            addCriterion("a_c_depict is not null");
            return (Criteria) this;
        }

        public Criteria andACDepictEqualTo(String value) {
            addCriterion("a_c_depict =", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictNotEqualTo(String value) {
            addCriterion("a_c_depict <>", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictGreaterThan(String value) {
            addCriterion("a_c_depict >", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictGreaterThanOrEqualTo(String value) {
            addCriterion("a_c_depict >=", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictLessThan(String value) {
            addCriterion("a_c_depict <", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictLessThanOrEqualTo(String value) {
            addCriterion("a_c_depict <=", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictLike(String value) {
            addCriterion("a_c_depict like", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictNotLike(String value) {
            addCriterion("a_c_depict not like", value, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictIn(List<String> values) {
            addCriterion("a_c_depict in", values, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictNotIn(List<String> values) {
            addCriterion("a_c_depict not in", values, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictBetween(String value1, String value2) {
            addCriterion("a_c_depict between", value1, value2, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACDepictNotBetween(String value1, String value2) {
            addCriterion("a_c_depict not between", value1, value2, "aCDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlIsNull() {
            addCriterion("a_c_url is null");
            return (Criteria) this;
        }

        public Criteria andACUrlIsNotNull() {
            addCriterion("a_c_url is not null");
            return (Criteria) this;
        }

        public Criteria andACUrlEqualTo(String value) {
            addCriterion("a_c_url =", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlNotEqualTo(String value) {
            addCriterion("a_c_url <>", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlGreaterThan(String value) {
            addCriterion("a_c_url >", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlGreaterThanOrEqualTo(String value) {
            addCriterion("a_c_url >=", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlLessThan(String value) {
            addCriterion("a_c_url <", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlLessThanOrEqualTo(String value) {
            addCriterion("a_c_url <=", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlLike(String value) {
            addCriterion("a_c_url like", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlNotLike(String value) {
            addCriterion("a_c_url not like", value, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlIn(List<String> values) {
            addCriterion("a_c_url in", values, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlNotIn(List<String> values) {
            addCriterion("a_c_url not in", values, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlBetween(String value1, String value2) {
            addCriterion("a_c_url between", value1, value2, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlNotBetween(String value1, String value2) {
            addCriterion("a_c_url not between", value1, value2, "aCUrl");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictIsNull() {
            addCriterion("a_c_url_depict is null");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictIsNotNull() {
            addCriterion("a_c_url_depict is not null");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictEqualTo(String value) {
            addCriterion("a_c_url_depict =", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictNotEqualTo(String value) {
            addCriterion("a_c_url_depict <>", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictGreaterThan(String value) {
            addCriterion("a_c_url_depict >", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictGreaterThanOrEqualTo(String value) {
            addCriterion("a_c_url_depict >=", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictLessThan(String value) {
            addCriterion("a_c_url_depict <", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictLessThanOrEqualTo(String value) {
            addCriterion("a_c_url_depict <=", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictLike(String value) {
            addCriterion("a_c_url_depict like", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictNotLike(String value) {
            addCriterion("a_c_url_depict not like", value, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictIn(List<String> values) {
            addCriterion("a_c_url_depict in", values, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictNotIn(List<String> values) {
            addCriterion("a_c_url_depict not in", values, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictBetween(String value1, String value2) {
            addCriterion("a_c_url_depict between", value1, value2, "aCUrlDepict");
            return (Criteria) this;
        }

        public Criteria andACUrlDepictNotBetween(String value1, String value2) {
            addCriterion("a_c_url_depict not between", value1, value2, "aCUrlDepict");
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