package com.hanshan.myblog.domain.generator.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommIdIsNull() {
            addCriterion("comm_id is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("comm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Long value) {
            addCriterion("comm_id =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Long value) {
            addCriterion("comm_id <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Long value) {
            addCriterion("comm_id >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comm_id >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Long value) {
            addCriterion("comm_id <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Long value) {
            addCriterion("comm_id <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Long> values) {
            addCriterion("comm_id in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Long> values) {
            addCriterion("comm_id not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Long value1, Long value2) {
            addCriterion("comm_id between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Long value1, Long value2) {
            addCriterion("comm_id not between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateIsNull() {
            addCriterion("comm_createdate is null");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateIsNotNull() {
            addCriterion("comm_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateEqualTo(Date value) {
            addCriterion("comm_createdate =", value, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateNotEqualTo(Date value) {
            addCriterion("comm_createdate <>", value, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateGreaterThan(Date value) {
            addCriterion("comm_createdate >", value, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("comm_createdate >=", value, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateLessThan(Date value) {
            addCriterion("comm_createdate <", value, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("comm_createdate <=", value, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateIn(List<Date> values) {
            addCriterion("comm_createdate in", values, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateNotIn(List<Date> values) {
            addCriterion("comm_createdate not in", values, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateBetween(Date value1, Date value2) {
            addCriterion("comm_createdate between", value1, value2, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andCommCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("comm_createdate not between", value1, value2, "commCreatedate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andCommPraiseIsNull() {
            addCriterion("comm_praise is null");
            return (Criteria) this;
        }

        public Criteria andCommPraiseIsNotNull() {
            addCriterion("comm_praise is not null");
            return (Criteria) this;
        }

        public Criteria andCommPraiseEqualTo(Integer value) {
            addCriterion("comm_praise =", value, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseNotEqualTo(Integer value) {
            addCriterion("comm_praise <>", value, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseGreaterThan(Integer value) {
            addCriterion("comm_praise >", value, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm_praise >=", value, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseLessThan(Integer value) {
            addCriterion("comm_praise <", value, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("comm_praise <=", value, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseIn(List<Integer> values) {
            addCriterion("comm_praise in", values, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseNotIn(List<Integer> values) {
            addCriterion("comm_praise not in", values, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseBetween(Integer value1, Integer value2) {
            addCriterion("comm_praise between", value1, value2, "commPraise");
            return (Criteria) this;
        }

        public Criteria andCommPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("comm_praise not between", value1, value2, "commPraise");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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