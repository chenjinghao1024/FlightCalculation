package com.chen.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightFlnExample {
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
     * FlightFlnExample
     */
    public FlightFlnExample() {
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
     * @date 2019/06/18
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

        public Criteria andYetdIsNull() {
            addCriterion("yetd is null");
            return (Criteria) this;
        }

        public Criteria andYetdIsNotNull() {
            addCriterion("yetd is not null");
            return (Criteria) this;
        }

        public Criteria andYetdEqualTo(String value) {
            addCriterion("yetd =", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdNotEqualTo(String value) {
            addCriterion("yetd <>", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdGreaterThan(String value) {
            addCriterion("yetd >", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdGreaterThanOrEqualTo(String value) {
            addCriterion("yetd >=", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdLessThan(String value) {
            addCriterion("yetd <", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdLessThanOrEqualTo(String value) {
            addCriterion("yetd <=", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdLike(String value) {
            addCriterion("yetd like", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdNotLike(String value) {
            addCriterion("yetd not like", value, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdIn(List<String> values) {
            addCriterion("yetd in", values, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdNotIn(List<String> values) {
            addCriterion("yetd not in", values, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdBetween(String value1, String value2) {
            addCriterion("yetd between", value1, value2, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetdNotBetween(String value1, String value2) {
            addCriterion("yetd not between", value1, value2, "yetd");
            return (Criteria) this;
        }

        public Criteria andYetaIsNull() {
            addCriterion("yeta is null");
            return (Criteria) this;
        }

        public Criteria andYetaIsNotNull() {
            addCriterion("yeta is not null");
            return (Criteria) this;
        }

        public Criteria andYetaEqualTo(String value) {
            addCriterion("yeta =", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaNotEqualTo(String value) {
            addCriterion("yeta <>", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaGreaterThan(String value) {
            addCriterion("yeta >", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaGreaterThanOrEqualTo(String value) {
            addCriterion("yeta >=", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaLessThan(String value) {
            addCriterion("yeta <", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaLessThanOrEqualTo(String value) {
            addCriterion("yeta <=", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaLike(String value) {
            addCriterion("yeta like", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaNotLike(String value) {
            addCriterion("yeta not like", value, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaIn(List<String> values) {
            addCriterion("yeta in", values, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaNotIn(List<String> values) {
            addCriterion("yeta not in", values, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaBetween(String value1, String value2) {
            addCriterion("yeta between", value1, value2, "yeta");
            return (Criteria) this;
        }

        public Criteria andYetaNotBetween(String value1, String value2) {
            addCriterion("yeta not between", value1, value2, "yeta");
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

        public Criteria andDepGateIdIsNull() {
            addCriterion("dep_gate_id is null");
            return (Criteria) this;
        }

        public Criteria andDepGateIdIsNotNull() {
            addCriterion("dep_gate_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepGateIdEqualTo(String value) {
            addCriterion("dep_gate_id =", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdNotEqualTo(String value) {
            addCriterion("dep_gate_id <>", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdGreaterThan(String value) {
            addCriterion("dep_gate_id >", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdGreaterThanOrEqualTo(String value) {
            addCriterion("dep_gate_id >=", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdLessThan(String value) {
            addCriterion("dep_gate_id <", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdLessThanOrEqualTo(String value) {
            addCriterion("dep_gate_id <=", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdLike(String value) {
            addCriterion("dep_gate_id like", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdNotLike(String value) {
            addCriterion("dep_gate_id not like", value, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdIn(List<String> values) {
            addCriterion("dep_gate_id in", values, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdNotIn(List<String> values) {
            addCriterion("dep_gate_id not in", values, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdBetween(String value1, String value2) {
            addCriterion("dep_gate_id between", value1, value2, "depGateId");
            return (Criteria) this;
        }

        public Criteria andDepGateIdNotBetween(String value1, String value2) {
            addCriterion("dep_gate_id not between", value1, value2, "depGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdIsNull() {
            addCriterion("arr_gate_id is null");
            return (Criteria) this;
        }

        public Criteria andArrGateIdIsNotNull() {
            addCriterion("arr_gate_id is not null");
            return (Criteria) this;
        }

        public Criteria andArrGateIdEqualTo(String value) {
            addCriterion("arr_gate_id =", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdNotEqualTo(String value) {
            addCriterion("arr_gate_id <>", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdGreaterThan(String value) {
            addCriterion("arr_gate_id >", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdGreaterThanOrEqualTo(String value) {
            addCriterion("arr_gate_id >=", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdLessThan(String value) {
            addCriterion("arr_gate_id <", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdLessThanOrEqualTo(String value) {
            addCriterion("arr_gate_id <=", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdLike(String value) {
            addCriterion("arr_gate_id like", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdNotLike(String value) {
            addCriterion("arr_gate_id not like", value, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdIn(List<String> values) {
            addCriterion("arr_gate_id in", values, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdNotIn(List<String> values) {
            addCriterion("arr_gate_id not in", values, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdBetween(String value1, String value2) {
            addCriterion("arr_gate_id between", value1, value2, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andArrGateIdNotBetween(String value1, String value2) {
            addCriterion("arr_gate_id not between", value1, value2, "arrGateId");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneIsNull() {
            addCriterion("org_timezone is null");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneIsNotNull() {
            addCriterion("org_timezone is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneEqualTo(String value) {
            addCriterion("org_timezone =", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneNotEqualTo(String value) {
            addCriterion("org_timezone <>", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneGreaterThan(String value) {
            addCriterion("org_timezone >", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("org_timezone >=", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneLessThan(String value) {
            addCriterion("org_timezone <", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneLessThanOrEqualTo(String value) {
            addCriterion("org_timezone <=", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneLike(String value) {
            addCriterion("org_timezone like", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneNotLike(String value) {
            addCriterion("org_timezone not like", value, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneIn(List<String> values) {
            addCriterion("org_timezone in", values, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneNotIn(List<String> values) {
            addCriterion("org_timezone not in", values, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneBetween(String value1, String value2) {
            addCriterion("org_timezone between", value1, value2, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andOrgTimezoneNotBetween(String value1, String value2) {
            addCriterion("org_timezone not between", value1, value2, "orgTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneIsNull() {
            addCriterion("dst_timezone is null");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneIsNotNull() {
            addCriterion("dst_timezone is not null");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneEqualTo(String value) {
            addCriterion("dst_timezone =", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneNotEqualTo(String value) {
            addCriterion("dst_timezone <>", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneGreaterThan(String value) {
            addCriterion("dst_timezone >", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("dst_timezone >=", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneLessThan(String value) {
            addCriterion("dst_timezone <", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneLessThanOrEqualTo(String value) {
            addCriterion("dst_timezone <=", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneLike(String value) {
            addCriterion("dst_timezone like", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneNotLike(String value) {
            addCriterion("dst_timezone not like", value, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneIn(List<String> values) {
            addCriterion("dst_timezone in", values, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneNotIn(List<String> values) {
            addCriterion("dst_timezone not in", values, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneBetween(String value1, String value2) {
            addCriterion("dst_timezone between", value1, value2, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andDstTimezoneNotBetween(String value1, String value2) {
            addCriterion("dst_timezone not between", value1, value2, "dstTimezone");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(String value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(String value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(String value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(String value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(String value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(String value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLike(String value) {
            addCriterion("insert_time like", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotLike(String value) {
            addCriterion("insert_time not like", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<String> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<String> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(String value1, String value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(String value1, String value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andNewVersionIsNull() {
            addCriterion("new_version is null");
            return (Criteria) this;
        }

        public Criteria andNewVersionIsNotNull() {
            addCriterion("new_version is not null");
            return (Criteria) this;
        }

        public Criteria andNewVersionEqualTo(String value) {
            addCriterion("new_version =", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionNotEqualTo(String value) {
            addCriterion("new_version <>", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionGreaterThan(String value) {
            addCriterion("new_version >", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionGreaterThanOrEqualTo(String value) {
            addCriterion("new_version >=", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionLessThan(String value) {
            addCriterion("new_version <", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionLessThanOrEqualTo(String value) {
            addCriterion("new_version <=", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionLike(String value) {
            addCriterion("new_version like", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionNotLike(String value) {
            addCriterion("new_version not like", value, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionIn(List<String> values) {
            addCriterion("new_version in", values, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionNotIn(List<String> values) {
            addCriterion("new_version not in", values, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionBetween(String value1, String value2) {
            addCriterion("new_version between", value1, value2, "newVersion");
            return (Criteria) this;
        }

        public Criteria andNewVersionNotBetween(String value1, String value2) {
            addCriterion("new_version not between", value1, value2, "newVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andUpdateRegIsNull() {
            addCriterion("update_reg is null");
            return (Criteria) this;
        }

        public Criteria andUpdateRegIsNotNull() {
            addCriterion("update_reg is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateRegEqualTo(String value) {
            addCriterion("update_reg =", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegNotEqualTo(String value) {
            addCriterion("update_reg <>", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegGreaterThan(String value) {
            addCriterion("update_reg >", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegGreaterThanOrEqualTo(String value) {
            addCriterion("update_reg >=", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegLessThan(String value) {
            addCriterion("update_reg <", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegLessThanOrEqualTo(String value) {
            addCriterion("update_reg <=", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegLike(String value) {
            addCriterion("update_reg like", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegNotLike(String value) {
            addCriterion("update_reg not like", value, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegIn(List<String> values) {
            addCriterion("update_reg in", values, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegNotIn(List<String> values) {
            addCriterion("update_reg not in", values, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegBetween(String value1, String value2) {
            addCriterion("update_reg between", value1, value2, "updateReg");
            return (Criteria) this;
        }

        public Criteria andUpdateRegNotBetween(String value1, String value2) {
            addCriterion("update_reg not between", value1, value2, "updateReg");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table flight_fln
     *
     * @mbg.generated do_not_delete_during_merge Tue Jun 18 16:10:13 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/06/18
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