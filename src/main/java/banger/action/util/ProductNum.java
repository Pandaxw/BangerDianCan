package banger.action.util;
/*
create by yang on 2017.8.7
a model for  select product and product number
 */
public class ProductNum {
    private String productId;
    private int carProductNum;
    private String productName;
    private double price;
    private double carProductPrice;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }



    public int getCarProductNum() {
        return carProductNum;
    }

    public void setCarProductNum(int carProductNum) {
        this.carProductNum = carProductNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getCarProductPrice() {
        return carProductPrice;
    }

    public void setCarProductPrice(double carProductPrice) {
        this.carProductPrice = carProductPrice;
    }


}
