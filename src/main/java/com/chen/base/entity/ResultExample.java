package com.chen.base.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResultExample {
    /**
     * orderByClause
     */
    protected String orderByClause;

    /**
     * distinct
     */
    protected boolean distinct;

    /**
     * oredCriteria
     */
    protected List<Criteria> oredCriteria;

    /**
     * ResultExample
     */
    public ResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @author  Generator
     * @date 2019/06/19
     */
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

        public Criteria andFlightIdIsNull() {
            addCriterion("flight_id is null");
            return (Criteria) this;
        }

        public Criteria andFlightIdIsNotNull() {
            addCriterion("flight_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlightIdEqualTo(String value) {
            addCriterion("flight_id =", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotEqualTo(String value) {
            addCriterion("flight_id <>", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdGreaterThan(String value) {
            addCriterion("flight_id >", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdGreaterThanOrEqualTo(String value) {
            addCriterion("flight_id >=", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLessThan(String value) {
            addCriterion("flight_id <", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLessThanOrEqualTo(String value) {
            addCriterion("flight_id <=", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdLike(String value) {
            addCriterion("flight_id like", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotLike(String value) {
            addCriterion("flight_id not like", value, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdIn(List<String> values) {
            addCriterion("flight_id in", values, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotIn(List<String> values) {
            addCriterion("flight_id not in", values, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdBetween(String value1, String value2) {
            addCriterion("flight_id between", value1, value2, "flightId");
            return (Criteria) this;
        }

        public Criteria andFlightIdNotBetween(String value1, String value2) {
            addCriterion("flight_id not between", value1, value2, "flightId");
            return (Criteria) this;
        }

        public Criteria andCallsignIsNull() {
            addCriterion("callsign is null");
            return (Criteria) this;
        }

        public Criteria andCallsignIsNotNull() {
            addCriterion("callsign is not null");
            return (Criteria) this;
        }

        public Criteria andCallsignEqualTo(String value) {
            addCriterion("callsign =", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotEqualTo(String value) {
            addCriterion("callsign <>", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignGreaterThan(String value) {
            addCriterion("callsign >", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignGreaterThanOrEqualTo(String value) {
            addCriterion("callsign >=", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLessThan(String value) {
            addCriterion("callsign <", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLessThanOrEqualTo(String value) {
            addCriterion("callsign <=", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignLike(String value) {
            addCriterion("callsign like", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotLike(String value) {
            addCriterion("callsign not like", value, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignIn(List<String> values) {
            addCriterion("callsign in", values, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotIn(List<String> values) {
            addCriterion("callsign not in", values, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignBetween(String value1, String value2) {
            addCriterion("callsign between", value1, value2, "callsign");
            return (Criteria) this;
        }

        public Criteria andCallsignNotBetween(String value1, String value2) {
            addCriterion("callsign not between", value1, value2, "callsign");
            return (Criteria) this;
        }

        public Criteria andAcfTypeIsNull() {
            addCriterion("acf_type is null");
            return (Criteria) this;
        }

        public Criteria andAcfTypeIsNotNull() {
            addCriterion("acf_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcfTypeEqualTo(String value) {
            addCriterion("acf_type =", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeNotEqualTo(String value) {
            addCriterion("acf_type <>", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeGreaterThan(String value) {
            addCriterion("acf_type >", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("acf_type >=", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeLessThan(String value) {
            addCriterion("acf_type <", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeLessThanOrEqualTo(String value) {
            addCriterion("acf_type <=", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeLike(String value) {
            addCriterion("acf_type like", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeNotLike(String value) {
            addCriterion("acf_type not like", value, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeIn(List<String> values) {
            addCriterion("acf_type in", values, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeNotIn(List<String> values) {
            addCriterion("acf_type not in", values, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeBetween(String value1, String value2) {
            addCriterion("acf_type between", value1, value2, "acfType");
            return (Criteria) this;
        }

        public Criteria andAcfTypeNotBetween(String value1, String value2) {
            addCriterion("acf_type not between", value1, value2, "acfType");
            return (Criteria) this;
        }

        public Criteria andRegIsNull() {
            addCriterion("reg is null");
            return (Criteria) this;
        }

        public Criteria andRegIsNotNull() {
            addCriterion("reg is not null");
            return (Criteria) this;
        }

        public Criteria andRegEqualTo(String value) {
            addCriterion("reg =", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotEqualTo(String value) {
            addCriterion("reg <>", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegGreaterThan(String value) {
            addCriterion("reg >", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegGreaterThanOrEqualTo(String value) {
            addCriterion("reg >=", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLessThan(String value) {
            addCriterion("reg <", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLessThanOrEqualTo(String value) {
            addCriterion("reg <=", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegLike(String value) {
            addCriterion("reg like", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotLike(String value) {
            addCriterion("reg not like", value, "reg");
            return (Criteria) this;
        }

        public Criteria andRegIn(List<String> values) {
            addCriterion("reg in", values, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotIn(List<String> values) {
            addCriterion("reg not in", values, "reg");
            return (Criteria) this;
        }

        public Criteria andRegBetween(String value1, String value2) {
            addCriterion("reg between", value1, value2, "reg");
            return (Criteria) this;
        }

        public Criteria andRegNotBetween(String value1, String value2) {
            addCriterion("reg not between", value1, value2, "reg");
            return (Criteria) this;
        }

        public Criteria andDepAddrIsNull() {
            addCriterion("dep_addr is null");
            return (Criteria) this;
        }

        public Criteria andDepAddrIsNotNull() {
            addCriterion("dep_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDepAddrEqualTo(String value) {
            addCriterion("dep_addr =", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrNotEqualTo(String value) {
            addCriterion("dep_addr <>", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrGreaterThan(String value) {
            addCriterion("dep_addr >", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrGreaterThanOrEqualTo(String value) {
            addCriterion("dep_addr >=", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrLessThan(String value) {
            addCriterion("dep_addr <", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrLessThanOrEqualTo(String value) {
            addCriterion("dep_addr <=", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrLike(String value) {
            addCriterion("dep_addr like", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrNotLike(String value) {
            addCriterion("dep_addr not like", value, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrIn(List<String> values) {
            addCriterion("dep_addr in", values, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrNotIn(List<String> values) {
            addCriterion("dep_addr not in", values, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrBetween(String value1, String value2) {
            addCriterion("dep_addr between", value1, value2, "depAddr");
            return (Criteria) this;
        }

        public Criteria andDepAddrNotBetween(String value1, String value2) {
            addCriterion("dep_addr not between", value1, value2, "depAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrIsNull() {
            addCriterion("arr_addr is null");
            return (Criteria) this;
        }

        public Criteria andArrAddrIsNotNull() {
            addCriterion("arr_addr is not null");
            return (Criteria) this;
        }

        public Criteria andArrAddrEqualTo(String value) {
            addCriterion("arr_addr =", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrNotEqualTo(String value) {
            addCriterion("arr_addr <>", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrGreaterThan(String value) {
            addCriterion("arr_addr >", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrGreaterThanOrEqualTo(String value) {
            addCriterion("arr_addr >=", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrLessThan(String value) {
            addCriterion("arr_addr <", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrLessThanOrEqualTo(String value) {
            addCriterion("arr_addr <=", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrLike(String value) {
            addCriterion("arr_addr like", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrNotLike(String value) {
            addCriterion("arr_addr not like", value, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrIn(List<String> values) {
            addCriterion("arr_addr in", values, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrNotIn(List<String> values) {
            addCriterion("arr_addr not in", values, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrBetween(String value1, String value2) {
            addCriterion("arr_addr between", value1, value2, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andArrAddrNotBetween(String value1, String value2) {
            addCriterion("arr_addr not between", value1, value2, "arrAddr");
            return (Criteria) this;
        }

        public Criteria andEtdIsNull() {
            addCriterion("etd is null");
            return (Criteria) this;
        }

        public Criteria andEtdIsNotNull() {
            addCriterion("etd is not null");
            return (Criteria) this;
        }

        public Criteria andEtdEqualTo(Date value) {
            addCriterion("etd =", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotEqualTo(Date value) {
            addCriterion("etd <>", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdGreaterThan(Date value) {
            addCriterion("etd >", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdGreaterThanOrEqualTo(Date value) {
            addCriterion("etd >=", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdLessThan(Date value) {
            addCriterion("etd <", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdLessThanOrEqualTo(Date value) {
            addCriterion("etd <=", value, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdIn(List<Date> values) {
            addCriterion("etd in", values, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotIn(List<Date> values) {
            addCriterion("etd not in", values, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdBetween(Date value1, Date value2) {
            addCriterion("etd between", value1, value2, "etd");
            return (Criteria) this;
        }

        public Criteria andEtdNotBetween(Date value1, Date value2) {
            addCriterion("etd not between", value1, value2, "etd");
            return (Criteria) this;
        }

        public Criteria andEtaIsNull() {
            addCriterion("eta is null");
            return (Criteria) this;
        }

        public Criteria andEtaIsNotNull() {
            addCriterion("eta is not null");
            return (Criteria) this;
        }

        public Criteria andEtaEqualTo(Date value) {
            addCriterion("eta =", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotEqualTo(Date value) {
            addCriterion("eta <>", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThan(Date value) {
            addCriterion("eta >", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaGreaterThanOrEqualTo(Date value) {
            addCriterion("eta >=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThan(Date value) {
            addCriterion("eta <", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaLessThanOrEqualTo(Date value) {
            addCriterion("eta <=", value, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaIn(List<Date> values) {
            addCriterion("eta in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotIn(List<Date> values) {
            addCriterion("eta not in", values, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaBetween(Date value1, Date value2) {
            addCriterion("eta between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andEtaNotBetween(Date value1, Date value2) {
            addCriterion("eta not between", value1, value2, "eta");
            return (Criteria) this;
        }

        public Criteria andAtdIsNull() {
            addCriterion("atd is null");
            return (Criteria) this;
        }

        public Criteria andAtdIsNotNull() {
            addCriterion("atd is not null");
            return (Criteria) this;
        }

        public Criteria andAtdEqualTo(Date value) {
            addCriterion("atd =", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdNotEqualTo(Date value) {
            addCriterion("atd <>", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdGreaterThan(Date value) {
            addCriterion("atd >", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdGreaterThanOrEqualTo(Date value) {
            addCriterion("atd >=", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdLessThan(Date value) {
            addCriterion("atd <", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdLessThanOrEqualTo(Date value) {
            addCriterion("atd <=", value, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdIn(List<Date> values) {
            addCriterion("atd in", values, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdNotIn(List<Date> values) {
            addCriterion("atd not in", values, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdBetween(Date value1, Date value2) {
            addCriterion("atd between", value1, value2, "atd");
            return (Criteria) this;
        }

        public Criteria andAtdNotBetween(Date value1, Date value2) {
            addCriterion("atd not between", value1, value2, "atd");
            return (Criteria) this;
        }

        public Criteria andAtaIsNull() {
            addCriterion("ata is null");
            return (Criteria) this;
        }

        public Criteria andAtaIsNotNull() {
            addCriterion("ata is not null");
            return (Criteria) this;
        }

        public Criteria andAtaEqualTo(Date value) {
            addCriterion("ata =", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaNotEqualTo(Date value) {
            addCriterion("ata <>", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaGreaterThan(Date value) {
            addCriterion("ata >", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaGreaterThanOrEqualTo(Date value) {
            addCriterion("ata >=", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaLessThan(Date value) {
            addCriterion("ata <", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaLessThanOrEqualTo(Date value) {
            addCriterion("ata <=", value, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaIn(List<Date> values) {
            addCriterion("ata in", values, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaNotIn(List<Date> values) {
            addCriterion("ata not in", values, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaBetween(Date value1, Date value2) {
            addCriterion("ata between", value1, value2, "ata");
            return (Criteria) this;
        }

        public Criteria andAtaNotBetween(Date value1, Date value2) {
            addCriterion("ata not between", value1, value2, "ata");
            return (Criteria) this;
        }

        public Criteria andFlightStateIsNull() {
            addCriterion("flight_state is null");
            return (Criteria) this;
        }

        public Criteria andFlightStateIsNotNull() {
            addCriterion("flight_state is not null");
            return (Criteria) this;
        }

        public Criteria andFlightStateEqualTo(String value) {
            addCriterion("flight_state =", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotEqualTo(String value) {
            addCriterion("flight_state <>", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateGreaterThan(String value) {
            addCriterion("flight_state >", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateGreaterThanOrEqualTo(String value) {
            addCriterion("flight_state >=", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateLessThan(String value) {
            addCriterion("flight_state <", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateLessThanOrEqualTo(String value) {
            addCriterion("flight_state <=", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateLike(String value) {
            addCriterion("flight_state like", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotLike(String value) {
            addCriterion("flight_state not like", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateIn(List<String> values) {
            addCriterion("flight_state in", values, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotIn(List<String> values) {
            addCriterion("flight_state not in", values, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateBetween(String value1, String value2) {
            addCriterion("flight_state between", value1, value2, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotBetween(String value1, String value2) {
            addCriterion("flight_state not between", value1, value2, "flightState");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeIsNull() {
            addCriterion("business_income is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeIsNotNull() {
            addCriterion("business_income is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeEqualTo(BigDecimal value) {
            addCriterion("business_income =", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeNotEqualTo(BigDecimal value) {
            addCriterion("business_income <>", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeGreaterThan(BigDecimal value) {
            addCriterion("business_income >", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("business_income >=", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLessThan(BigDecimal value) {
            addCriterion("business_income <", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("business_income <=", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeIn(List<BigDecimal> values) {
            addCriterion("business_income in", values, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeNotIn(List<BigDecimal> values) {
            addCriterion("business_income not in", values, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_income between", value1, value2, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("business_income not between", value1, value2, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andFuelCostIsNull() {
            addCriterion("fuel_cost is null");
            return (Criteria) this;
        }

        public Criteria andFuelCostIsNotNull() {
            addCriterion("fuel_cost is not null");
            return (Criteria) this;
        }

        public Criteria andFuelCostEqualTo(BigDecimal value) {
            addCriterion("fuel_cost =", value, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostNotEqualTo(BigDecimal value) {
            addCriterion("fuel_cost <>", value, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostGreaterThan(BigDecimal value) {
            addCriterion("fuel_cost >", value, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_cost >=", value, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostLessThan(BigDecimal value) {
            addCriterion("fuel_cost <", value, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fuel_cost <=", value, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostIn(List<BigDecimal> values) {
            addCriterion("fuel_cost in", values, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostNotIn(List<BigDecimal> values) {
            addCriterion("fuel_cost not in", values, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_cost between", value1, value2, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andFuelCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fuel_cost not between", value1, value2, "fuelCost");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsIsNull() {
            addCriterion("co2_emissions is null");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsIsNotNull() {
            addCriterion("co2_emissions is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsEqualTo(BigDecimal value) {
            addCriterion("co2_emissions =", value, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsNotEqualTo(BigDecimal value) {
            addCriterion("co2_emissions <>", value, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsGreaterThan(BigDecimal value) {
            addCriterion("co2_emissions >", value, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("co2_emissions >=", value, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsLessThan(BigDecimal value) {
            addCriterion("co2_emissions <", value, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("co2_emissions <=", value, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsIn(List<BigDecimal> values) {
            addCriterion("co2_emissions in", values, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsNotIn(List<BigDecimal> values) {
            addCriterion("co2_emissions not in", values, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("co2_emissions between", value1, value2, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCo2EmissionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("co2_emissions not between", value1, value2, "co2Emissions");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostIsNull() {
            addCriterion("cancel_loss_cost is null");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostIsNotNull() {
            addCriterion("cancel_loss_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostEqualTo(BigDecimal value) {
            addCriterion("cancel_loss_cost =", value, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostNotEqualTo(BigDecimal value) {
            addCriterion("cancel_loss_cost <>", value, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostGreaterThan(BigDecimal value) {
            addCriterion("cancel_loss_cost >", value, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cancel_loss_cost >=", value, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostLessThan(BigDecimal value) {
            addCriterion("cancel_loss_cost <", value, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cancel_loss_cost <=", value, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostIn(List<BigDecimal> values) {
            addCriterion("cancel_loss_cost in", values, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostNotIn(List<BigDecimal> values) {
            addCriterion("cancel_loss_cost not in", values, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cancel_loss_cost between", value1, value2, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andCancelLossCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cancel_loss_cost not between", value1, value2, "cancelLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostIsNull() {
            addCriterion("return_loss_cost is null");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostIsNotNull() {
            addCriterion("return_loss_cost is not null");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostEqualTo(BigDecimal value) {
            addCriterion("return_loss_cost =", value, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostNotEqualTo(BigDecimal value) {
            addCriterion("return_loss_cost <>", value, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostGreaterThan(BigDecimal value) {
            addCriterion("return_loss_cost >", value, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_loss_cost >=", value, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostLessThan(BigDecimal value) {
            addCriterion("return_loss_cost <", value, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_loss_cost <=", value, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostIn(List<BigDecimal> values) {
            addCriterion("return_loss_cost in", values, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostNotIn(List<BigDecimal> values) {
            addCriterion("return_loss_cost not in", values, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_loss_cost between", value1, value2, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andReturnLossCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_loss_cost not between", value1, value2, "returnLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostIsNull() {
            addCriterion("air_delay_loss_cost is null");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostIsNotNull() {
            addCriterion("air_delay_loss_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostEqualTo(BigDecimal value) {
            addCriterion("air_delay_loss_cost =", value, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostNotEqualTo(BigDecimal value) {
            addCriterion("air_delay_loss_cost <>", value, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostGreaterThan(BigDecimal value) {
            addCriterion("air_delay_loss_cost >", value, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("air_delay_loss_cost >=", value, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostLessThan(BigDecimal value) {
            addCriterion("air_delay_loss_cost <", value, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("air_delay_loss_cost <=", value, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostIn(List<BigDecimal> values) {
            addCriterion("air_delay_loss_cost in", values, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostNotIn(List<BigDecimal> values) {
            addCriterion("air_delay_loss_cost not in", values, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_delay_loss_cost between", value1, value2, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andAirDelayLossCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("air_delay_loss_cost not between", value1, value2, "airDelayLossCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostIsNull() {
            addCriterion("time_value_cost is null");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostIsNotNull() {
            addCriterion("time_value_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostEqualTo(BigDecimal value) {
            addCriterion("time_value_cost =", value, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostNotEqualTo(BigDecimal value) {
            addCriterion("time_value_cost <>", value, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostGreaterThan(BigDecimal value) {
            addCriterion("time_value_cost >", value, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_value_cost >=", value, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostLessThan(BigDecimal value) {
            addCriterion("time_value_cost <", value, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_value_cost <=", value, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostIn(List<BigDecimal> values) {
            addCriterion("time_value_cost in", values, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostNotIn(List<BigDecimal> values) {
            addCriterion("time_value_cost not in", values, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_value_cost between", value1, value2, "timeValueCost");
            return (Criteria) this;
        }

        public Criteria andTimeValueCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_value_cost not between", value1, value2, "timeValueCost");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table result
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 19 09:39:06 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/06/19
     */
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