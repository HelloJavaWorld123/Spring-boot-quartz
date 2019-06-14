package com.jzy.quartz.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAptIdIsNull() {
            addCriterion("apt_id is null");
            return (Criteria) this;
        }

        public Criteria andAptIdIsNotNull() {
            addCriterion("apt_id is not null");
            return (Criteria) this;
        }

        public Criteria andAptIdEqualTo(Long value) {
            addCriterion("apt_id =", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotEqualTo(Long value) {
            addCriterion("apt_id <>", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdGreaterThan(Long value) {
            addCriterion("apt_id >", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apt_id >=", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdLessThan(Long value) {
            addCriterion("apt_id <", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdLessThanOrEqualTo(Long value) {
            addCriterion("apt_id <=", value, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdIn(List<Long> values) {
            addCriterion("apt_id in", values, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotIn(List<Long> values) {
            addCriterion("apt_id not in", values, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdBetween(Long value1, Long value2) {
            addCriterion("apt_id between", value1, value2, "aptId");
            return (Criteria) this;
        }

        public Criteria andAptIdNotBetween(Long value1, Long value2) {
            addCriterion("apt_id not between", value1, value2, "aptId");
            return (Criteria) this;
        }

        public Criteria andSupNoIsNull() {
            addCriterion("sup_no is null");
            return (Criteria) this;
        }

        public Criteria andSupNoIsNotNull() {
            addCriterion("sup_no is not null");
            return (Criteria) this;
        }

        public Criteria andSupNoEqualTo(String value) {
            addCriterion("sup_no =", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoNotEqualTo(String value) {
            addCriterion("sup_no <>", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoGreaterThan(String value) {
            addCriterion("sup_no >", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoGreaterThanOrEqualTo(String value) {
            addCriterion("sup_no >=", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoLessThan(String value) {
            addCriterion("sup_no <", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoLessThanOrEqualTo(String value) {
            addCriterion("sup_no <=", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoLike(String value) {
            addCriterion("sup_no like", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoNotLike(String value) {
            addCriterion("sup_no not like", value, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoIn(List<String> values) {
            addCriterion("sup_no in", values, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoNotIn(List<String> values) {
            addCriterion("sup_no not in", values, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoBetween(String value1, String value2) {
            addCriterion("sup_no between", value1, value2, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupNoNotBetween(String value1, String value2) {
            addCriterion("sup_no not between", value1, value2, "supNo");
            return (Criteria) this;
        }

        public Criteria andSupPriceIsNull() {
            addCriterion("sup_price is null");
            return (Criteria) this;
        }

        public Criteria andSupPriceIsNotNull() {
            addCriterion("sup_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupPriceEqualTo(BigDecimal value) {
            addCriterion("sup_price =", value, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceNotEqualTo(BigDecimal value) {
            addCriterion("sup_price <>", value, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceGreaterThan(BigDecimal value) {
            addCriterion("sup_price >", value, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sup_price >=", value, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceLessThan(BigDecimal value) {
            addCriterion("sup_price <", value, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sup_price <=", value, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceIn(List<BigDecimal> values) {
            addCriterion("sup_price in", values, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceNotIn(List<BigDecimal> values) {
            addCriterion("sup_price not in", values, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sup_price between", value1, value2, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sup_price not between", value1, value2, "supPrice");
            return (Criteria) this;
        }

        public Criteria andSupStatusIsNull() {
            addCriterion("sup_status is null");
            return (Criteria) this;
        }

        public Criteria andSupStatusIsNotNull() {
            addCriterion("sup_status is not null");
            return (Criteria) this;
        }

        public Criteria andSupStatusEqualTo(Integer value) {
            addCriterion("sup_status =", value, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusNotEqualTo(Integer value) {
            addCriterion("sup_status <>", value, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusGreaterThan(Integer value) {
            addCriterion("sup_status >", value, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_status >=", value, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusLessThan(Integer value) {
            addCriterion("sup_status <", value, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sup_status <=", value, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusIn(List<Integer> values) {
            addCriterion("sup_status in", values, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusNotIn(List<Integer> values) {
            addCriterion("sup_status not in", values, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusBetween(Integer value1, Integer value2) {
            addCriterion("sup_status between", value1, value2, "supStatus");
            return (Criteria) this;
        }

        public Criteria andSupStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_status not between", value1, value2, "supStatus");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(BigDecimal value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(BigDecimal value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<BigDecimal> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameIsNull() {
            addCriterion("price_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameIsNotNull() {
            addCriterion("price_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameEqualTo(String value) {
            addCriterion("price_type_name =", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameNotEqualTo(String value) {
            addCriterion("price_type_name <>", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameGreaterThan(String value) {
            addCriterion("price_type_name >", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("price_type_name >=", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameLessThan(String value) {
            addCriterion("price_type_name <", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("price_type_name <=", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameLike(String value) {
            addCriterion("price_type_name like", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameNotLike(String value) {
            addCriterion("price_type_name not like", value, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameIn(List<String> values) {
            addCriterion("price_type_name in", values, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameNotIn(List<String> values) {
            addCriterion("price_type_name not in", values, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameBetween(String value1, String value2) {
            addCriterion("price_type_name between", value1, value2, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNameNotBetween(String value1, String value2) {
            addCriterion("price_type_name not between", value1, value2, "priceTypeName");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitIsNull() {
            addCriterion("price_type_unit is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitIsNotNull() {
            addCriterion("price_type_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitEqualTo(String value) {
            addCriterion("price_type_unit =", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitNotEqualTo(String value) {
            addCriterion("price_type_unit <>", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitGreaterThan(String value) {
            addCriterion("price_type_unit >", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("price_type_unit >=", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitLessThan(String value) {
            addCriterion("price_type_unit <", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitLessThanOrEqualTo(String value) {
            addCriterion("price_type_unit <=", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitLike(String value) {
            addCriterion("price_type_unit like", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitNotLike(String value) {
            addCriterion("price_type_unit not like", value, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitIn(List<String> values) {
            addCriterion("price_type_unit in", values, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitNotIn(List<String> values) {
            addCriterion("price_type_unit not in", values, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitBetween(String value1, String value2) {
            addCriterion("price_type_unit between", value1, value2, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andPriceTypeUnitNotBetween(String value1, String value2) {
            addCriterion("price_type_unit not between", value1, value2, "priceTypeUnit");
            return (Criteria) this;
        }

        public Criteria andAccTypeIsNull() {
            addCriterion("acct_type is null");
            return (Criteria) this;
        }

        public Criteria andAccTypeIsNotNull() {
            addCriterion("acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccTypeEqualTo(String value) {
            addCriterion("acct_type =", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotEqualTo(String value) {
            addCriterion("acct_type <>", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeGreaterThan(String value) {
            addCriterion("acct_type >", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeGreaterThanOrEqualTo(String value) {
            addCriterion("acct_type >=", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeLessThan(String value) {
            addCriterion("acct_type <", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeLessThanOrEqualTo(String value) {
            addCriterion("acct_type <=", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeLike(String value) {
            addCriterion("acct_type like", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotLike(String value) {
            addCriterion("acct_type not like", value, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeIn(List<String> values) {
            addCriterion("acct_type in", values, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotIn(List<String> values) {
            addCriterion("acct_type not in", values, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeBetween(String value1, String value2) {
            addCriterion("acct_type between", value1, value2, "accType");
            return (Criteria) this;
        }

        public Criteria andAccTypeNotBetween(String value1, String value2) {
            addCriterion("acct_type not between", value1, value2, "accType");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andGameAccountIsNull() {
            addCriterion("game_account is null");
            return (Criteria) this;
        }

        public Criteria andGameAccountIsNotNull() {
            addCriterion("game_account is not null");
            return (Criteria) this;
        }

        public Criteria andGameAccountEqualTo(String value) {
            addCriterion("game_account =", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountNotEqualTo(String value) {
            addCriterion("game_account <>", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountGreaterThan(String value) {
            addCriterion("game_account >", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountGreaterThanOrEqualTo(String value) {
            addCriterion("game_account >=", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountLessThan(String value) {
            addCriterion("game_account <", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountLessThanOrEqualTo(String value) {
            addCriterion("game_account <=", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountLike(String value) {
            addCriterion("game_account like", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountNotLike(String value) {
            addCriterion("game_account not like", value, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountIn(List<String> values) {
            addCriterion("game_account in", values, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountNotIn(List<String> values) {
            addCriterion("game_account not in", values, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountBetween(String value1, String value2) {
            addCriterion("game_account between", value1, value2, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAccountNotBetween(String value1, String value2) {
            addCriterion("game_account not between", value1, value2, "gameAccount");
            return (Criteria) this;
        }

        public Criteria andGameAreaIsNull() {
            addCriterion("game_area is null");
            return (Criteria) this;
        }

        public Criteria andGameAreaIsNotNull() {
            addCriterion("game_area is not null");
            return (Criteria) this;
        }

        public Criteria andGameAreaEqualTo(String value) {
            addCriterion("game_area =", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaNotEqualTo(String value) {
            addCriterion("game_area <>", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaGreaterThan(String value) {
            addCriterion("game_area >", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaGreaterThanOrEqualTo(String value) {
            addCriterion("game_area >=", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaLessThan(String value) {
            addCriterion("game_area <", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaLessThanOrEqualTo(String value) {
            addCriterion("game_area <=", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaLike(String value) {
            addCriterion("game_area like", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaNotLike(String value) {
            addCriterion("game_area not like", value, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaIn(List<String> values) {
            addCriterion("game_area in", values, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaNotIn(List<String> values) {
            addCriterion("game_area not in", values, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaBetween(String value1, String value2) {
            addCriterion("game_area between", value1, value2, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameAreaNotBetween(String value1, String value2) {
            addCriterion("game_area not between", value1, value2, "gameArea");
            return (Criteria) this;
        }

        public Criteria andGameSeryIsNull() {
            addCriterion("game_serv is null");
            return (Criteria) this;
        }

        public Criteria andGameSeryIsNotNull() {
            addCriterion("game_serv is not null");
            return (Criteria) this;
        }

        public Criteria andGameSeryEqualTo(String value) {
            addCriterion("game_serv =", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryNotEqualTo(String value) {
            addCriterion("game_serv <>", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryGreaterThan(String value) {
            addCriterion("game_serv >", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryGreaterThanOrEqualTo(String value) {
            addCriterion("game_serv >=", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryLessThan(String value) {
            addCriterion("game_serv <", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryLessThanOrEqualTo(String value) {
            addCriterion("game_serv <=", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryLike(String value) {
            addCriterion("game_serv like", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryNotLike(String value) {
            addCriterion("game_serv not like", value, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryIn(List<String> values) {
            addCriterion("game_serv in", values, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryNotIn(List<String> values) {
            addCriterion("game_serv not in", values, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryBetween(String value1, String value2) {
            addCriterion("game_serv between", value1, value2, "gameSery");
            return (Criteria) this;
        }

        public Criteria andGameSeryNotBetween(String value1, String value2) {
            addCriterion("game_serv not between", value1, value2, "gameSery");
            return (Criteria) this;
        }

        public Criteria andTradeMethodIsNull() {
            addCriterion("trade_method is null");
            return (Criteria) this;
        }

        public Criteria andTradeMethodIsNotNull() {
            addCriterion("trade_method is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMethodEqualTo(Integer value) {
            addCriterion("trade_method =", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodNotEqualTo(Integer value) {
            addCriterion("trade_method <>", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodGreaterThan(Integer value) {
            addCriterion("trade_method >", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_method >=", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodLessThan(Integer value) {
            addCriterion("trade_method <", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodLessThanOrEqualTo(Integer value) {
            addCriterion("trade_method <=", value, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodIn(List<Integer> values) {
            addCriterion("trade_method in", values, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodNotIn(List<Integer> values) {
            addCriterion("trade_method not in", values, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodBetween(Integer value1, Integer value2) {
            addCriterion("trade_method between", value1, value2, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_method not between", value1, value2, "tradeMethod");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIsNull() {
            addCriterion("trade_code is null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIsNotNull() {
            addCriterion("trade_code is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCodeEqualTo(String value) {
            addCriterion("trade_code =", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotEqualTo(String value) {
            addCriterion("trade_code <>", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThan(String value) {
            addCriterion("trade_code >", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_code >=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThan(String value) {
            addCriterion("trade_code <", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("trade_code <=", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeLike(String value) {
            addCriterion("trade_code like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotLike(String value) {
            addCriterion("trade_code not like", value, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeIn(List<String> values) {
            addCriterion("trade_code in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotIn(List<String> values) {
            addCriterion("trade_code not in", values, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeBetween(String value1, String value2) {
            addCriterion("trade_code between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeCodeNotBetween(String value1, String value2) {
            addCriterion("trade_code not between", value1, value2, "tradeCode");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIsNull() {
            addCriterion("trade_fee is null");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIsNotNull() {
            addCriterion("trade_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTradeFeeEqualTo(BigDecimal value) {
            addCriterion("trade_fee =", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotEqualTo(BigDecimal value) {
            addCriterion("trade_fee <>", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeGreaterThan(BigDecimal value) {
            addCriterion("trade_fee >", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_fee >=", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeLessThan(BigDecimal value) {
            addCriterion("trade_fee <", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trade_fee <=", value, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeIn(List<BigDecimal> values) {
            addCriterion("trade_fee in", values, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotIn(List<BigDecimal> values) {
            addCriterion("trade_fee not in", values, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_fee between", value1, value2, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trade_fee not between", value1, value2, "tradeFee");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(String value) {
            addCriterion("trade_status =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(String value) {
            addCriterion("trade_status <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(String value) {
            addCriterion("trade_status >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("trade_status >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(String value) {
            addCriterion("trade_status <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(String value) {
            addCriterion("trade_status <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLike(String value) {
            addCriterion("trade_status like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotLike(String value) {
            addCriterion("trade_status not like", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<String> values) {
            addCriterion("trade_status in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<String> values) {
            addCriterion("trade_status not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(String value1, String value2) {
            addCriterion("trade_status between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(String value1, String value2) {
            addCriterion("trade_status not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(Integer value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(Integer value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(Integer value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(Integer value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<Integer> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<Integer> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(Integer value1, Integer value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Long value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Long value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Long value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Long value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Long value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Long> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Long> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Long value1, Long value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Long value1, Long value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNull() {
            addCriterion("modifier_id is null");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNotNull() {
            addCriterion("modifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifierIdEqualTo(Long value) {
            addCriterion("modifier_id =", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotEqualTo(Long value) {
            addCriterion("modifier_id <>", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThan(Long value) {
            addCriterion("modifier_id >", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modifier_id >=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThan(Long value) {
            addCriterion("modifier_id <", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThanOrEqualTo(Long value) {
            addCriterion("modifier_id <=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIn(List<Long> values) {
            addCriterion("modifier_id in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotIn(List<Long> values) {
            addCriterion("modifier_id not in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdBetween(Long value1, Long value2) {
            addCriterion("modifier_id between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotBetween(Long value1, Long value2) {
            addCriterion("modifier_id not between", value1, value2, "modifierId");
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

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(LocalDateTime value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(LocalDateTime value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(LocalDateTime value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(LocalDateTime value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<LocalDateTime> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<LocalDateTime> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andRechargeModeIsNull() {
            addCriterion("recharge_mode is null");
            return (Criteria) this;
        }

        public Criteria andRechargeModeIsNotNull() {
            addCriterion("recharge_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeModeEqualTo(Integer value) {
            addCriterion("recharge_mode =", value, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeNotEqualTo(Integer value) {
            addCriterion("recharge_mode <>", value, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeGreaterThan(Integer value) {
            addCriterion("recharge_mode >", value, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_mode >=", value, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeLessThan(Integer value) {
            addCriterion("recharge_mode <", value, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_mode <=", value, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeIn(List<Integer> values) {
            addCriterion("recharge_mode in", values, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeNotIn(List<Integer> values) {
            addCriterion("recharge_mode not in", values, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeBetween(Integer value1, Integer value2) {
            addCriterion("recharge_mode between", value1, value2, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andRechargeModeNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_mode not between", value1, value2, "rechargeMode");
            return (Criteria) this;
        }

        public Criteria andDealerPriceIsNull() {
            addCriterion("dealer_price is null");
            return (Criteria) this;
        }

        public Criteria andDealerPriceIsNotNull() {
            addCriterion("dealer_price is not null");
            return (Criteria) this;
        }

        public Criteria andDealerPriceEqualTo(BigDecimal value) {
            addCriterion("dealer_price =", value, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceNotEqualTo(BigDecimal value) {
            addCriterion("dealer_price <>", value, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceGreaterThan(BigDecimal value) {
            addCriterion("dealer_price >", value, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dealer_price >=", value, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceLessThan(BigDecimal value) {
            addCriterion("dealer_price <", value, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dealer_price <=", value, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceIn(List<BigDecimal> values) {
            addCriterion("dealer_price in", values, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceNotIn(List<BigDecimal> values) {
            addCriterion("dealer_price not in", values, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dealer_price between", value1, value2, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andDealerPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dealer_price not between", value1, value2, "dealerPrice");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(LocalDateTime value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(LocalDateTime value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(LocalDateTime value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(LocalDateTime value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<LocalDateTime> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<LocalDateTime> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(LocalDateTime value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(LocalDateTime value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(LocalDateTime value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(LocalDateTime value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<LocalDateTime> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<LocalDateTime> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
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