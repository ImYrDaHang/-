package com.imyrdahang.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConfigsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigsExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCCode1IsNull() {
            addCriterion("c_code_1 is null");
            return (Criteria) this;
        }

        public Criteria andCCode1IsNotNull() {
            addCriterion("c_code_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCCode1EqualTo(String value) {
            addCriterion("c_code_1 =", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1NotEqualTo(String value) {
            addCriterion("c_code_1 <>", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1GreaterThan(String value) {
            addCriterion("c_code_1 >", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1GreaterThanOrEqualTo(String value) {
            addCriterion("c_code_1 >=", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1LessThan(String value) {
            addCriterion("c_code_1 <", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1LessThanOrEqualTo(String value) {
            addCriterion("c_code_1 <=", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1Like(String value) {
            addCriterion("c_code_1 like", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1NotLike(String value) {
            addCriterion("c_code_1 not like", value, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1In(List<String> values) {
            addCriterion("c_code_1 in", values, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1NotIn(List<String> values) {
            addCriterion("c_code_1 not in", values, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1Between(String value1, String value2) {
            addCriterion("c_code_1 between", value1, value2, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode1NotBetween(String value1, String value2) {
            addCriterion("c_code_1 not between", value1, value2, "cCode1");
            return (Criteria) this;
        }

        public Criteria andCCode2IsNull() {
            addCriterion("c_code_2 is null");
            return (Criteria) this;
        }

        public Criteria andCCode2IsNotNull() {
            addCriterion("c_code_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCCode2EqualTo(String value) {
            addCriterion("c_code_2 =", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2NotEqualTo(String value) {
            addCriterion("c_code_2 <>", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2GreaterThan(String value) {
            addCriterion("c_code_2 >", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2GreaterThanOrEqualTo(String value) {
            addCriterion("c_code_2 >=", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2LessThan(String value) {
            addCriterion("c_code_2 <", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2LessThanOrEqualTo(String value) {
            addCriterion("c_code_2 <=", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2Like(String value) {
            addCriterion("c_code_2 like", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2NotLike(String value) {
            addCriterion("c_code_2 not like", value, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2In(List<String> values) {
            addCriterion("c_code_2 in", values, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2NotIn(List<String> values) {
            addCriterion("c_code_2 not in", values, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2Between(String value1, String value2) {
            addCriterion("c_code_2 between", value1, value2, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCCode2NotBetween(String value1, String value2) {
            addCriterion("c_code_2 not between", value1, value2, "cCode2");
            return (Criteria) this;
        }

        public Criteria andCData1IsNull() {
            addCriterion("c_data_1 is null");
            return (Criteria) this;
        }

        public Criteria andCData1IsNotNull() {
            addCriterion("c_data_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCData1EqualTo(String value) {
            addCriterion("c_data_1 =", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1NotEqualTo(String value) {
            addCriterion("c_data_1 <>", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1GreaterThan(String value) {
            addCriterion("c_data_1 >", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1GreaterThanOrEqualTo(String value) {
            addCriterion("c_data_1 >=", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1LessThan(String value) {
            addCriterion("c_data_1 <", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1LessThanOrEqualTo(String value) {
            addCriterion("c_data_1 <=", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1Like(String value) {
            addCriterion("c_data_1 like", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1NotLike(String value) {
            addCriterion("c_data_1 not like", value, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1In(List<String> values) {
            addCriterion("c_data_1 in", values, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1NotIn(List<String> values) {
            addCriterion("c_data_1 not in", values, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1Between(String value1, String value2) {
            addCriterion("c_data_1 between", value1, value2, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData1NotBetween(String value1, String value2) {
            addCriterion("c_data_1 not between", value1, value2, "cData1");
            return (Criteria) this;
        }

        public Criteria andCData2IsNull() {
            addCriterion("c_data_2 is null");
            return (Criteria) this;
        }

        public Criteria andCData2IsNotNull() {
            addCriterion("c_data_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCData2EqualTo(String value) {
            addCriterion("c_data_2 =", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2NotEqualTo(String value) {
            addCriterion("c_data_2 <>", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2GreaterThan(String value) {
            addCriterion("c_data_2 >", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2GreaterThanOrEqualTo(String value) {
            addCriterion("c_data_2 >=", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2LessThan(String value) {
            addCriterion("c_data_2 <", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2LessThanOrEqualTo(String value) {
            addCriterion("c_data_2 <=", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2Like(String value) {
            addCriterion("c_data_2 like", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2NotLike(String value) {
            addCriterion("c_data_2 not like", value, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2In(List<String> values) {
            addCriterion("c_data_2 in", values, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2NotIn(List<String> values) {
            addCriterion("c_data_2 not in", values, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2Between(String value1, String value2) {
            addCriterion("c_data_2 between", value1, value2, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData2NotBetween(String value1, String value2) {
            addCriterion("c_data_2 not between", value1, value2, "cData2");
            return (Criteria) this;
        }

        public Criteria andCData3IsNull() {
            addCriterion("c_data_3 is null");
            return (Criteria) this;
        }

        public Criteria andCData3IsNotNull() {
            addCriterion("c_data_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCData3EqualTo(String value) {
            addCriterion("c_data_3 =", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3NotEqualTo(String value) {
            addCriterion("c_data_3 <>", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3GreaterThan(String value) {
            addCriterion("c_data_3 >", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3GreaterThanOrEqualTo(String value) {
            addCriterion("c_data_3 >=", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3LessThan(String value) {
            addCriterion("c_data_3 <", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3LessThanOrEqualTo(String value) {
            addCriterion("c_data_3 <=", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3Like(String value) {
            addCriterion("c_data_3 like", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3NotLike(String value) {
            addCriterion("c_data_3 not like", value, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3In(List<String> values) {
            addCriterion("c_data_3 in", values, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3NotIn(List<String> values) {
            addCriterion("c_data_3 not in", values, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3Between(String value1, String value2) {
            addCriterion("c_data_3 between", value1, value2, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData3NotBetween(String value1, String value2) {
            addCriterion("c_data_3 not between", value1, value2, "cData3");
            return (Criteria) this;
        }

        public Criteria andCData4IsNull() {
            addCriterion("c_data_4 is null");
            return (Criteria) this;
        }

        public Criteria andCData4IsNotNull() {
            addCriterion("c_data_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCData4EqualTo(String value) {
            addCriterion("c_data_4 =", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4NotEqualTo(String value) {
            addCriterion("c_data_4 <>", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4GreaterThan(String value) {
            addCriterion("c_data_4 >", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4GreaterThanOrEqualTo(String value) {
            addCriterion("c_data_4 >=", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4LessThan(String value) {
            addCriterion("c_data_4 <", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4LessThanOrEqualTo(String value) {
            addCriterion("c_data_4 <=", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4Like(String value) {
            addCriterion("c_data_4 like", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4NotLike(String value) {
            addCriterion("c_data_4 not like", value, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4In(List<String> values) {
            addCriterion("c_data_4 in", values, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4NotIn(List<String> values) {
            addCriterion("c_data_4 not in", values, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4Between(String value1, String value2) {
            addCriterion("c_data_4 between", value1, value2, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData4NotBetween(String value1, String value2) {
            addCriterion("c_data_4 not between", value1, value2, "cData4");
            return (Criteria) this;
        }

        public Criteria andCData5IsNull() {
            addCriterion("c_data_5 is null");
            return (Criteria) this;
        }

        public Criteria andCData5IsNotNull() {
            addCriterion("c_data_5 is not null");
            return (Criteria) this;
        }

        public Criteria andCData5EqualTo(String value) {
            addCriterion("c_data_5 =", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5NotEqualTo(String value) {
            addCriterion("c_data_5 <>", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5GreaterThan(String value) {
            addCriterion("c_data_5 >", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5GreaterThanOrEqualTo(String value) {
            addCriterion("c_data_5 >=", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5LessThan(String value) {
            addCriterion("c_data_5 <", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5LessThanOrEqualTo(String value) {
            addCriterion("c_data_5 <=", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5Like(String value) {
            addCriterion("c_data_5 like", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5NotLike(String value) {
            addCriterion("c_data_5 not like", value, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5In(List<String> values) {
            addCriterion("c_data_5 in", values, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5NotIn(List<String> values) {
            addCriterion("c_data_5 not in", values, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5Between(String value1, String value2) {
            addCriterion("c_data_5 between", value1, value2, "cData5");
            return (Criteria) this;
        }

        public Criteria andCData5NotBetween(String value1, String value2) {
            addCriterion("c_data_5 not between", value1, value2, "cData5");
            return (Criteria) this;
        }

        public Criteria andCDepictIsNull() {
            addCriterion("c_depict is null");
            return (Criteria) this;
        }

        public Criteria andCDepictIsNotNull() {
            addCriterion("c_depict is not null");
            return (Criteria) this;
        }

        public Criteria andCDepictEqualTo(String value) {
            addCriterion("c_depict =", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictNotEqualTo(String value) {
            addCriterion("c_depict <>", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictGreaterThan(String value) {
            addCriterion("c_depict >", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictGreaterThanOrEqualTo(String value) {
            addCriterion("c_depict >=", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictLessThan(String value) {
            addCriterion("c_depict <", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictLessThanOrEqualTo(String value) {
            addCriterion("c_depict <=", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictLike(String value) {
            addCriterion("c_depict like", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictNotLike(String value) {
            addCriterion("c_depict not like", value, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictIn(List<String> values) {
            addCriterion("c_depict in", values, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictNotIn(List<String> values) {
            addCriterion("c_depict not in", values, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictBetween(String value1, String value2) {
            addCriterion("c_depict between", value1, value2, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCDepictNotBetween(String value1, String value2) {
            addCriterion("c_depict not between", value1, value2, "cDepict");
            return (Criteria) this;
        }

        public Criteria andCUIdIsNull() {
            addCriterion("c_u_id is null");
            return (Criteria) this;
        }

        public Criteria andCUIdIsNotNull() {
            addCriterion("c_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUIdEqualTo(Integer value) {
            addCriterion("c_u_id =", value, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdNotEqualTo(Integer value) {
            addCriterion("c_u_id <>", value, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdGreaterThan(Integer value) {
            addCriterion("c_u_id >", value, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_u_id >=", value, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdLessThan(Integer value) {
            addCriterion("c_u_id <", value, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_u_id <=", value, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdIn(List<Integer> values) {
            addCriterion("c_u_id in", values, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdNotIn(List<Integer> values) {
            addCriterion("c_u_id not in", values, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdBetween(Integer value1, Integer value2) {
            addCriterion("c_u_id between", value1, value2, "cUId");
            return (Criteria) this;
        }

        public Criteria andCUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_u_id not between", value1, value2, "cUId");
            return (Criteria) this;
        }

        public Criteria andCStateIsNull() {
            addCriterion("c_state is null");
            return (Criteria) this;
        }

        public Criteria andCStateIsNotNull() {
            addCriterion("c_state is not null");
            return (Criteria) this;
        }

        public Criteria andCStateEqualTo(Integer value) {
            addCriterion("c_state =", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotEqualTo(Integer value) {
            addCriterion("c_state <>", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThan(Integer value) {
            addCriterion("c_state >", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_state >=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThan(Integer value) {
            addCriterion("c_state <", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThanOrEqualTo(Integer value) {
            addCriterion("c_state <=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateIn(List<Integer> values) {
            addCriterion("c_state in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotIn(List<Integer> values) {
            addCriterion("c_state not in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateBetween(Integer value1, Integer value2) {
            addCriterion("c_state between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotBetween(Integer value1, Integer value2) {
            addCriterion("c_state not between", value1, value2, "cState");
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