package com.corp.jr.model.generator;

import java.util.ArrayList;
import java.util.List;

public class CoreRoleFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CoreRoleFunctionExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNull() {
            addCriterion("FUNCTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("FUNCTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Integer value) {
            addCriterion("FUNCTION_ID =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Integer value) {
            addCriterion("FUNCTION_ID <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Integer value) {
            addCriterion("FUNCTION_ID >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNCTION_ID >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Integer value) {
            addCriterion("FUNCTION_ID <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("FUNCTION_ID <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Integer> values) {
            addCriterion("FUNCTION_ID in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Integer> values) {
            addCriterion("FUNCTION_ID not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("FUNCTION_ID between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNCTION_ID not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeIsNull() {
            addCriterion("DATA_ACCESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeIsNotNull() {
            addCriterion("DATA_ACCESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeEqualTo(Byte value) {
            addCriterion("DATA_ACCESS_TYPE =", value, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeNotEqualTo(Byte value) {
            addCriterion("DATA_ACCESS_TYPE <>", value, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeGreaterThan(Byte value) {
            addCriterion("DATA_ACCESS_TYPE >", value, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("DATA_ACCESS_TYPE >=", value, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeLessThan(Byte value) {
            addCriterion("DATA_ACCESS_TYPE <", value, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeLessThanOrEqualTo(Byte value) {
            addCriterion("DATA_ACCESS_TYPE <=", value, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeIn(List<Byte> values) {
            addCriterion("DATA_ACCESS_TYPE in", values, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeNotIn(List<Byte> values) {
            addCriterion("DATA_ACCESS_TYPE not in", values, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeBetween(Byte value1, Byte value2) {
            addCriterion("DATA_ACCESS_TYPE between", value1, value2, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("DATA_ACCESS_TYPE not between", value1, value2, "dataAccessType");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyIsNull() {
            addCriterion("DATA_ACCESS_POLICY is null");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyIsNotNull() {
            addCriterion("DATA_ACCESS_POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyEqualTo(String value) {
            addCriterion("DATA_ACCESS_POLICY =", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyNotEqualTo(String value) {
            addCriterion("DATA_ACCESS_POLICY <>", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyGreaterThan(String value) {
            addCriterion("DATA_ACCESS_POLICY >", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_ACCESS_POLICY >=", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyLessThan(String value) {
            addCriterion("DATA_ACCESS_POLICY <", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyLessThanOrEqualTo(String value) {
            addCriterion("DATA_ACCESS_POLICY <=", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyLike(String value) {
            addCriterion("DATA_ACCESS_POLICY like", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyNotLike(String value) {
            addCriterion("DATA_ACCESS_POLICY not like", value, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyIn(List<String> values) {
            addCriterion("DATA_ACCESS_POLICY in", values, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyNotIn(List<String> values) {
            addCriterion("DATA_ACCESS_POLICY not in", values, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyBetween(String value1, String value2) {
            addCriterion("DATA_ACCESS_POLICY between", value1, value2, "dataAccessPolicy");
            return (Criteria) this;
        }

        public Criteria andDataAccessPolicyNotBetween(String value1, String value2) {
            addCriterion("DATA_ACCESS_POLICY not between", value1, value2, "dataAccessPolicy");
            return (Criteria) this;
        }
    }

    /**
     */
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