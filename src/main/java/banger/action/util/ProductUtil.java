package banger.action.util;

import banger.action.model.Picture;
import banger.action.model.Product;

import java.util.List;

/**
 * Created by Zgx on 2017/8/7.
 * 该类是用于查询菜品时间包括了卖家的部分信息
 */
public class ProductUtil {

    private String userNickname;

    private Product product;

    private List<Picture> pictureList;

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }
}
