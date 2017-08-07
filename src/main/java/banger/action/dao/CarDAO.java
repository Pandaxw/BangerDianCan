package banger.action.dao;

import banger.action.model.Car;
import banger.action.model.Product;

public interface CarDAO {
    /*
    Change by yang  on 2017.8.7
    add product to car table
     */
    int insertProduct(long carId,long carProductId,long carBuyerId);
    /*
    Change by yang  on 2017.8.7   change  product's number and price
     */
    int updateNum(long carProductId,int carProductNum,Double carProductPrice);
    /*
    Change by yang  on 2017.8.7    user delete product or user sign out,change  product's status
    */
    int deleteProduct(long carProductId,int carStatus,long carBuyerId);
    /*
    Change by yang  on 2017.8.7    user select my car
     */
}