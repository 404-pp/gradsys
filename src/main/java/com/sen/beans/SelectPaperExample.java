package com.sen.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SelectPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectPaperExample() {
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

        public Criteria andSelectIdIsNull() {
            addCriterion("select_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectIdIsNotNull() {
            addCriterion("select_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectIdEqualTo(Integer value) {
            addCriterion("select_id =", value, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdNotEqualTo(Integer value) {
            addCriterion("select_id <>", value, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdGreaterThan(Integer value) {
            addCriterion("select_id >", value, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("select_id >=", value, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdLessThan(Integer value) {
            addCriterion("select_id <", value, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdLessThanOrEqualTo(Integer value) {
            addCriterion("select_id <=", value, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdIn(List<Integer> values) {
            addCriterion("select_id in", values, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdNotIn(List<Integer> values) {
            addCriterion("select_id not in", values, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdBetween(Integer value1, Integer value2) {
            addCriterion("select_id between", value1, value2, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("select_id not between", value1, value2, "selectId");
            return (Criteria) this;
        }

        public Criteria andSelectTitleIsNull() {
            addCriterion("select_title is null");
            return (Criteria) this;
        }

        public Criteria andSelectTitleIsNotNull() {
            addCriterion("select_title is not null");
            return (Criteria) this;
        }

        public Criteria andSelectTitleEqualTo(String value) {
            addCriterion("select_title =", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleNotEqualTo(String value) {
            addCriterion("select_title <>", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleGreaterThan(String value) {
            addCriterion("select_title >", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleGreaterThanOrEqualTo(String value) {
            addCriterion("select_title >=", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleLessThan(String value) {
            addCriterion("select_title <", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleLessThanOrEqualTo(String value) {
            addCriterion("select_title <=", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleLike(String value) {
            addCriterion("select_title like", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleNotLike(String value) {
            addCriterion("select_title not like", value, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleIn(List<String> values) {
            addCriterion("select_title in", values, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleNotIn(List<String> values) {
            addCriterion("select_title not in", values, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleBetween(String value1, String value2) {
            addCriterion("select_title between", value1, value2, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectTitleNotBetween(String value1, String value2) {
            addCriterion("select_title not between", value1, value2, "selectTitle");
            return (Criteria) this;
        }

        public Criteria andSelectMsgIsNull() {
            addCriterion("select_msg is null");
            return (Criteria) this;
        }

        public Criteria andSelectMsgIsNotNull() {
            addCriterion("select_msg is not null");
            return (Criteria) this;
        }

        public Criteria andSelectMsgEqualTo(String value) {
            addCriterion("select_msg =", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgNotEqualTo(String value) {
            addCriterion("select_msg <>", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgGreaterThan(String value) {
            addCriterion("select_msg >", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgGreaterThanOrEqualTo(String value) {
            addCriterion("select_msg >=", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgLessThan(String value) {
            addCriterion("select_msg <", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgLessThanOrEqualTo(String value) {
            addCriterion("select_msg <=", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgLike(String value) {
            addCriterion("select_msg like", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgNotLike(String value) {
            addCriterion("select_msg not like", value, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgIn(List<String> values) {
            addCriterion("select_msg in", values, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgNotIn(List<String> values) {
            addCriterion("select_msg not in", values, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgBetween(String value1, String value2) {
            addCriterion("select_msg between", value1, value2, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andSelectMsgNotBetween(String value1, String value2) {
            addCriterion("select_msg not between", value1, value2, "selectMsg");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("add_date is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("add_date is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("add_date =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("add_date <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("add_date >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("add_date >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("add_date <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("add_date <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("add_date in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("add_date not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("add_date between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("add_date not between", value1, value2, "addDate");
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