package com.imyrdahang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlesExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAMIdIsNull() {
            addCriterion("a_m_id is null");
            return (Criteria) this;
        }

        public Criteria andAMIdIsNotNull() {
            addCriterion("a_m_id is not null");
            return (Criteria) this;
        }

        public Criteria andAMIdEqualTo(Integer value) {
            addCriterion("a_m_id =", value, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdNotEqualTo(Integer value) {
            addCriterion("a_m_id <>", value, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdGreaterThan(Integer value) {
            addCriterion("a_m_id >", value, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_m_id >=", value, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdLessThan(Integer value) {
            addCriterion("a_m_id <", value, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_m_id <=", value, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdIn(List<Integer> values) {
            addCriterion("a_m_id in", values, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdNotIn(List<Integer> values) {
            addCriterion("a_m_id not in", values, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdBetween(Integer value1, Integer value2) {
            addCriterion("a_m_id between", value1, value2, "aMId");
            return (Criteria) this;
        }

        public Criteria andAMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_m_id not between", value1, value2, "aMId");
            return (Criteria) this;
        }

        public Criteria andATitleIsNull() {
            addCriterion("a_title is null");
            return (Criteria) this;
        }

        public Criteria andATitleIsNotNull() {
            addCriterion("a_title is not null");
            return (Criteria) this;
        }

        public Criteria andATitleEqualTo(String value) {
            addCriterion("a_title =", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotEqualTo(String value) {
            addCriterion("a_title <>", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThan(String value) {
            addCriterion("a_title >", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThanOrEqualTo(String value) {
            addCriterion("a_title >=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThan(String value) {
            addCriterion("a_title <", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThanOrEqualTo(String value) {
            addCriterion("a_title <=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLike(String value) {
            addCriterion("a_title like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotLike(String value) {
            addCriterion("a_title not like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleIn(List<String> values) {
            addCriterion("a_title in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotIn(List<String> values) {
            addCriterion("a_title not in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleBetween(String value1, String value2) {
            addCriterion("a_title between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotBetween(String value1, String value2) {
            addCriterion("a_title not between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andAAbstractIsNull() {
            addCriterion("a_abstract is null");
            return (Criteria) this;
        }

        public Criteria andAAbstractIsNotNull() {
            addCriterion("a_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andAAbstractEqualTo(String value) {
            addCriterion("a_abstract =", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractNotEqualTo(String value) {
            addCriterion("a_abstract <>", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractGreaterThan(String value) {
            addCriterion("a_abstract >", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("a_abstract >=", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractLessThan(String value) {
            addCriterion("a_abstract <", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractLessThanOrEqualTo(String value) {
            addCriterion("a_abstract <=", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractLike(String value) {
            addCriterion("a_abstract like", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractNotLike(String value) {
            addCriterion("a_abstract not like", value, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractIn(List<String> values) {
            addCriterion("a_abstract in", values, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractNotIn(List<String> values) {
            addCriterion("a_abstract not in", values, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractBetween(String value1, String value2) {
            addCriterion("a_abstract between", value1, value2, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAAbstractNotBetween(String value1, String value2) {
            addCriterion("a_abstract not between", value1, value2, "aAbstract");
            return (Criteria) this;
        }

        public Criteria andAUIdIsNull() {
            addCriterion("a_u_id is null");
            return (Criteria) this;
        }

        public Criteria andAUIdIsNotNull() {
            addCriterion("a_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andAUIdEqualTo(Integer value) {
            addCriterion("a_u_id =", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdNotEqualTo(Integer value) {
            addCriterion("a_u_id <>", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdGreaterThan(Integer value) {
            addCriterion("a_u_id >", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_u_id >=", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdLessThan(Integer value) {
            addCriterion("a_u_id <", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_u_id <=", value, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdIn(List<Integer> values) {
            addCriterion("a_u_id in", values, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdNotIn(List<Integer> values) {
            addCriterion("a_u_id not in", values, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdBetween(Integer value1, Integer value2) {
            addCriterion("a_u_id between", value1, value2, "aUId");
            return (Criteria) this;
        }

        public Criteria andAUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_u_id not between", value1, value2, "aUId");
            return (Criteria) this;
        }

        public Criteria andAHitsIsNull() {
            addCriterion("a_hits is null");
            return (Criteria) this;
        }

        public Criteria andAHitsIsNotNull() {
            addCriterion("a_hits is not null");
            return (Criteria) this;
        }

        public Criteria andAHitsEqualTo(Integer value) {
            addCriterion("a_hits =", value, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsNotEqualTo(Integer value) {
            addCriterion("a_hits <>", value, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsGreaterThan(Integer value) {
            addCriterion("a_hits >", value, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_hits >=", value, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsLessThan(Integer value) {
            addCriterion("a_hits <", value, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsLessThanOrEqualTo(Integer value) {
            addCriterion("a_hits <=", value, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsIn(List<Integer> values) {
            addCriterion("a_hits in", values, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsNotIn(List<Integer> values) {
            addCriterion("a_hits not in", values, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsBetween(Integer value1, Integer value2) {
            addCriterion("a_hits between", value1, value2, "aHits");
            return (Criteria) this;
        }

        public Criteria andAHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("a_hits not between", value1, value2, "aHits");
            return (Criteria) this;
        }

        public Criteria andAChartIsNull() {
            addCriterion("a_chart is null");
            return (Criteria) this;
        }

        public Criteria andAChartIsNotNull() {
            addCriterion("a_chart is not null");
            return (Criteria) this;
        }

        public Criteria andAChartEqualTo(String value) {
            addCriterion("a_chart =", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartNotEqualTo(String value) {
            addCriterion("a_chart <>", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartGreaterThan(String value) {
            addCriterion("a_chart >", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartGreaterThanOrEqualTo(String value) {
            addCriterion("a_chart >=", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartLessThan(String value) {
            addCriterion("a_chart <", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartLessThanOrEqualTo(String value) {
            addCriterion("a_chart <=", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartLike(String value) {
            addCriterion("a_chart like", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartNotLike(String value) {
            addCriterion("a_chart not like", value, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartIn(List<String> values) {
            addCriterion("a_chart in", values, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartNotIn(List<String> values) {
            addCriterion("a_chart not in", values, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartBetween(String value1, String value2) {
            addCriterion("a_chart between", value1, value2, "aChart");
            return (Criteria) this;
        }

        public Criteria andAChartNotBetween(String value1, String value2) {
            addCriterion("a_chart not between", value1, value2, "aChart");
            return (Criteria) this;
        }

        public Criteria andACreateDateIsNull() {
            addCriterion("a_create_date is null");
            return (Criteria) this;
        }

        public Criteria andACreateDateIsNotNull() {
            addCriterion("a_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andACreateDateEqualTo(Date value) {
            addCriterion("a_create_date =", value, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateNotEqualTo(Date value) {
            addCriterion("a_create_date <>", value, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateGreaterThan(Date value) {
            addCriterion("a_create_date >", value, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("a_create_date >=", value, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateLessThan(Date value) {
            addCriterion("a_create_date <", value, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateLessThanOrEqualTo(Date value) {
            addCriterion("a_create_date <=", value, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateIn(List<Date> values) {
            addCriterion("a_create_date in", values, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateNotIn(List<Date> values) {
            addCriterion("a_create_date not in", values, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateBetween(Date value1, Date value2) {
            addCriterion("a_create_date between", value1, value2, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andACreateDateNotBetween(Date value1, Date value2) {
            addCriterion("a_create_date not between", value1, value2, "aCreateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateIsNull() {
            addCriterion("a_update_date is null");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateIsNotNull() {
            addCriterion("a_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateEqualTo(Date value) {
            addCriterion("a_update_date =", value, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateNotEqualTo(Date value) {
            addCriterion("a_update_date <>", value, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateGreaterThan(Date value) {
            addCriterion("a_update_date >", value, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("a_update_date >=", value, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateLessThan(Date value) {
            addCriterion("a_update_date <", value, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("a_update_date <=", value, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateIn(List<Date> values) {
            addCriterion("a_update_date in", values, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateNotIn(List<Date> values) {
            addCriterion("a_update_date not in", values, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateBetween(Date value1, Date value2) {
            addCriterion("a_update_date between", value1, value2, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("a_update_date not between", value1, value2, "aUpdateDate");
            return (Criteria) this;
        }

        public Criteria andAStateIsNull() {
            addCriterion("a_state is null");
            return (Criteria) this;
        }

        public Criteria andAStateIsNotNull() {
            addCriterion("a_state is not null");
            return (Criteria) this;
        }

        public Criteria andAStateEqualTo(Integer value) {
            addCriterion("a_state =", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotEqualTo(Integer value) {
            addCriterion("a_state <>", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThan(Integer value) {
            addCriterion("a_state >", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_state >=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThan(Integer value) {
            addCriterion("a_state <", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateLessThanOrEqualTo(Integer value) {
            addCriterion("a_state <=", value, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateIn(List<Integer> values) {
            addCriterion("a_state in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotIn(List<Integer> values) {
            addCriterion("a_state not in", values, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateBetween(Integer value1, Integer value2) {
            addCriterion("a_state between", value1, value2, "aState");
            return (Criteria) this;
        }

        public Criteria andAStateNotBetween(Integer value1, Integer value2) {
            addCriterion("a_state not between", value1, value2, "aState");
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