package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderforSellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderforSellerExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusIsNull() {
            addCriterion("deliveryStatus is null");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusIsNotNull() {
            addCriterion("deliveryStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusEqualTo(Integer value) {
            addCriterion("deliveryStatus =", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusNotEqualTo(Integer value) {
            addCriterion("deliveryStatus <>", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusGreaterThan(Integer value) {
            addCriterion("deliveryStatus >", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliveryStatus >=", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusLessThan(Integer value) {
            addCriterion("deliveryStatus <", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusLessThanOrEqualTo(Integer value) {
            addCriterion("deliveryStatus <=", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusIn(List<Integer> values) {
            addCriterion("deliveryStatus in", values, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusNotIn(List<Integer> values) {
            addCriterion("deliveryStatus not in", values, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusBetween(Integer value1, Integer value2) {
            addCriterion("deliveryStatus between", value1, value2, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("deliveryStatus not between", value1, value2, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIsNull() {
            addCriterion("logisticsId is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIsNotNull() {
            addCriterion("logisticsId is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsidEqualTo(Integer value) {
            addCriterion("logisticsId =", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotEqualTo(Integer value) {
            addCriterion("logisticsId <>", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidGreaterThan(Integer value) {
            addCriterion("logisticsId >", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticsId >=", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLessThan(Integer value) {
            addCriterion("logisticsId <", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidLessThanOrEqualTo(Integer value) {
            addCriterion("logisticsId <=", value, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidIn(List<Integer> values) {
            addCriterion("logisticsId in", values, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotIn(List<Integer> values) {
            addCriterion("logisticsId not in", values, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidBetween(Integer value1, Integer value2) {
            addCriterion("logisticsId between", value1, value2, "logisticsid");
            return (Criteria) this;
        }

        public Criteria andLogisticsidNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticsId not between", value1, value2, "logisticsid");
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