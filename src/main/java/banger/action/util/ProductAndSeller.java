package banger.action.util;

import banger.action.model.Product;

/**
 * Created by Zgx on 2017/8/7.
 * 该类是用于查询菜品时间包括了卖家的部分信息
 */
public class ProductAndSeller extends Product {

    private String userNickname;

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    @Override
    public String toString() {
        return "ProductAndSeller{" +
                "userNickname='" + userNickname + '\'' +
                '}';
    }
}
