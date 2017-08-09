package banger.action.dao;

import banger.action.model.Picture;

import java.util.List;

public interface PictureDAO {

    /**
     * 通过商品的id查询商品的图片
     * @param productId
     * @return
     */
    List<Picture> selectprctureByproductId(String productId);
}