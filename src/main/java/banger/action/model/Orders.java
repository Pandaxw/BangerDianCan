package banger.action.model;

import java.util.Date;

public class Orders {
    private int id;

    private long ordersId;

    private long ordersBuyerId;

    private long ordersSellerId;

    private String ordersNo;

    private String ordersAddress;

    private Date ordersTime;

    private Date ordersDelieveTime;

    private Date ordersFinishTime;

    private Double ordersTotalPrice;

    private String ordersPayment;

    private int ordersStatus;

    private String ordersComments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }

    public long getOrdersBuyerId() {
        return ordersBuyerId;
    }

    public void setOrdersBuyerId(long ordersBuyerId) {
        this.ordersBuyerId = ordersBuyerId;
    }

    public long getOrdersSellerId() {
        return ordersSellerId;
    }

    public void setOrdersSellerId(long ordersSellerId) {
        this.ordersSellerId = ordersSellerId;
    }

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo == null ? null : ordersNo.trim();
    }

    public String getOrdersAddress() {
        return ordersAddress;
    }

    public void setOrdersAddress(String ordersAddress) {
        this.ordersAddress = ordersAddress == null ? null : ordersAddress.trim();
    }

    public Date getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }

    public Date getOrdersDelieveTime() {
        return ordersDelieveTime;
    }

    public void setOrdersDelieveTime(Date ordersDelieveTime) {
        this.ordersDelieveTime = ordersDelieveTime;
    }

    public Date getOrdersFinishTime() {
        return ordersFinishTime;
    }

    public void setOrdersFinishTime(Date ordersFinishTime) {
        this.ordersFinishTime = ordersFinishTime;
    }

    public Double getOrdersTotalPrice() {
        return ordersTotalPrice;
    }

    public void setOrdersTotalPrice(Double ordersTotalPrice) {
        this.ordersTotalPrice = ordersTotalPrice;
    }

    public String getOrdersPayment() {
        return ordersPayment;
    }

    public void setOrdersPayment(String ordersPayment) {
        this.ordersPayment = ordersPayment == null ? null : ordersPayment.trim();
    }

    public int getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(int ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public String getOrdersComments() {
        return ordersComments;
    }

    public void setOrdersComments(String ordersComments) {
        this.ordersComments = ordersComments == null ? null : ordersComments.trim();
    }
}