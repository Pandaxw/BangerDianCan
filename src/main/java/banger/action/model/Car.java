package banger.action.model;

public class Car {
    //carStatus 加入购物车后默认状态 ： 0
    //          加入购物车后用户操作删除商品  ：1
    //          加入购物车后用户退出登录购物车失效商品 ：2
    private int id;

    private long carId;

    private long carBuyerId;

    private long carProductId;

    private int carProductNum;

    private Double carProductPrice;

    private int carStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public long getCarBuyerId() {
        return carBuyerId;
    }

    public void setCarBuyerId(long carBuyerId) {
        this.carBuyerId = carBuyerId;
    }

    public long getCarProductId() {
        return carProductId;
    }

    public void setCarProductId(long carProductId) {
        this.carProductId = carProductId;
    }

    public int getCarProductNum() {
        return carProductNum;
    }

    public void setCarProductNum(int carProductNum) {
        this.carProductNum = carProductNum;
    }

    public Double getCarProductPrice() {
        return carProductPrice;
    }

    public void setCarProductPrice(Double carProductPrice) {
        this.carProductPrice = carProductPrice;
    }

    public int getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(int carStatus) {
        this.carStatus = carStatus;
    }


}