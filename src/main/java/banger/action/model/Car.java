package banger.action.model;

public class Car {
    //carStatus 加入购物车后默认状态 ： 0
    //          加入购物车后用户操作删除商品  ：1
    //          加入购物车后用户退出登录购物车失效商品 ：2
    private int id;

    private String carId;

    private String carBuyerId;

    private String carProductId;

    private int carProductNum;

    private Double carProductPrice;

    private int carStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }


    public String getCarBuyerId() {
        return carBuyerId;
    }

    public void setCarBuyerId(String carBuyerId) {
        this.carBuyerId = carBuyerId;
    }

    public String getCarProductId() {
        return carProductId;
    }

    public void setCarProductId(String carProductId) {
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