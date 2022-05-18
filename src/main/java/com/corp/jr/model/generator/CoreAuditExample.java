package com.corp.jr.model.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoreAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CoreAuditExample() {
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

        public Criteria andFunctionCodeIsNull() {
            addCriterion("FUNCTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("FUNCTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("FUNCTION_CODE =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("FUNCTION_CODE <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("FUNCTION_CODE >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CODE >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("FUNCTION_CODE <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_CODE <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("FUNCTION_CODE like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("FUNCTION_CODE not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("FUNCTION_CODE in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("FUNCTION_CODE not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("FUNCTION_CODE between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_CODE not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("FUNCTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("FUNCTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("FUNCTION_NAME =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("FUNCTION_NAME <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("FUNCTION_NAME >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_NAME >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("FUNCTION_NAME <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_NAME <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("FUNCTION_NAME like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("FUNCTION_NAME not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("FUNCTION_NAME in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("FUNCTION_NAME not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("FUNCTION_NAME between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_NAME not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(Byte value) {
            addCriterion("SUCCESS =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(Byte value) {
            addCriterion("SUCCESS <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(Byte value) {
            addCriterion("SUCCESS >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(Byte value) {
            addCriterion("SUCCESS >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(Byte value) {
            addCriterion("SUCCESS <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(Byte value) {
            addCriterion("SUCCESS <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<Byte> values) {
            addCriterion("SUCCESS in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<Byte> values) {
            addCriterion("SUCCESS not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(Byte value1, Byte value2) {
            addCriterion("SUCCESS between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(Byte value1, Byte value2) {
            addCriterion("SUCCESS not between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
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