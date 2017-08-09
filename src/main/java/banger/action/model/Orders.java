package banger.action.model;

import java.util.Date;

/**
 * 订单实体类
 */
public class Orders {
    private int id;

    private String ordersId;           //订单Id

    private String ordersBuyerId;      //买家Id

    private String ordersSellerId;     //卖家Id

    private String ordersAddress;    //订单地址

    private Date ordersTime;         //订单成交时间

    private Date ordersDelieveTime;  //订单配送时间

    private Date ordersFinishTime;   //订单完成时间

    private Double ordersTotalPrice; //订单总计价格

    private String ordersPayment;    //付款方式

    private int ordersStatus;        //订单状态

    private String ordersComments;   //买家备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersBuyerId() {
        return ordersBuyerId;
    }

    public void setOrdersBuyerId(String ordersBuyerId) {
        this.ordersBuyerId = ordersBuyerId;
    }

    public String getOrdersSellerId() {
        return ordersSellerId;
    }

    public void setOrdersSellerId(String ordersSellerId) {
        this.ordersSellerId = ordersSellerId;
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