package com.junc.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CopyExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreateUuidIsNull() {
            addCriterion("create_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUuidIsNotNull() {
            addCriterion("create_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUuidEqualTo(String value) {
            addCriterion("create_uuid =", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidNotEqualTo(String value) {
            addCriterion("create_uuid <>", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidGreaterThan(String value) {
            addCriterion("create_uuid >", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidGreaterThanOrEqualTo(String value) {
            addCriterion("create_uuid >=", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidLessThan(String value) {
            addCriterion("create_uuid <", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidLessThanOrEqualTo(String value) {
            addCriterion("create_uuid <=", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidLike(String value) {
            addCriterion("create_uuid like", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidNotLike(String value) {
            addCriterion("create_uuid not like", value, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidIn(List<String> values) {
            addCriterion("create_uuid in", values, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidNotIn(List<String> values) {
            addCriterion("create_uuid not in", values, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidBetween(String value1, String value2) {
            addCriterion("create_uuid between", value1, value2, "createUuid");
            return (Criteria) this;
        }

        public Criteria andCreateUuidNotBetween(String value1, String value2) {
            addCriterion("create_uuid not between", value1, value2, "createUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidIsNull() {
            addCriterion("last_update_uuid is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidIsNotNull() {
            addCriterion("last_update_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidEqualTo(String value) {
            addCriterion("last_update_uuid =", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidNotEqualTo(String value) {
            addCriterion("last_update_uuid <>", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidGreaterThan(String value) {
            addCriterion("last_update_uuid >", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_uuid >=", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidLessThan(String value) {
            addCriterion("last_update_uuid <", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidLessThanOrEqualTo(String value) {
            addCriterion("last_update_uuid <=", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidLike(String value) {
            addCriterion("last_update_uuid like", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidNotLike(String value) {
            addCriterion("last_update_uuid not like", value, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidIn(List<String> values) {
            addCriterion("last_update_uuid in", values, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidNotIn(List<String> values) {
            addCriterion("last_update_uuid not in", values, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidBetween(String value1, String value2) {
            addCriterion("last_update_uuid between", value1, value2, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidNotBetween(String value1, String value2) {
            addCriterion("last_update_uuid not between", value1, value2, "lastUpdateUuid");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andCreateUuidLikeInsensitive(String value) {
            addCriterion("upper(create_uuid) like", value.toUpperCase(), "createUuid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUuidLikeInsensitive(String value) {
            addCriterion("upper(last_update_uuid) like", value.toUpperCase(), "lastUpdateUuid");
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