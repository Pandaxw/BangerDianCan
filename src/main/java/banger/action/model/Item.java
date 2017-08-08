package banger.action.model;

public class Item {
	
    private int id;      

    private String itemOrderId;   //订单明细表ID

    private String itemProductId; //订单明细表菜品ID

    private int itemProductNum;  //订单明细表菜品购买数量

    private Double itemProductPrice;  //订单明细表该菜品价格小计

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemOrderId() {
        return itemOrderId;
    }

    public void setItemOrderId(String itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    public String getItemProductId() {
        return itemProductId;
    }

    public void setItemProductId(String itemProductId) {
        this.itemProductId = itemProductId;
    }

    public int getItemProductNum() {
        return itemProductNum;
    }

    public void setItemProductNum(int itemProductNum) {
        this.itemProductNum = itemProductNum;
    }

    public Double getItemProductPrice() {
        return itemProductPrice;
    }

    public void setItemProductPrice(Double itemProductPrice) {
        this.itemProductPrice = itemProductPrice;
    }
}