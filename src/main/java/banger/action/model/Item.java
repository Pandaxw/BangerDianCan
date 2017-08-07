package banger.action.model;

public class Item {
    private int id;

    private long itemOrderid;

    private long itemProductId;

    private int itemProductNum;

    private Double itemProductPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getItemOrderid() {
        return itemOrderid;
    }

    public void setItemOrderid(long itemOrderid) {
        this.itemOrderid = itemOrderid;
    }

    public long getItemProductId() {
        return itemProductId;
    }

    public void setItemProductId(long itemProductId) {
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