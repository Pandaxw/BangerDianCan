package banger.action.dao;

import banger.action.model.Car;

import java.util.List;

public interface CarDAO {
    /*
    Change by yang  on 2017.8.7
    add product to car table
     */
    int insertProduct(Car car);
    /*
    Change by yang  on 2017.8.7   change  product's number and price
     */
    int updateNum(long carProductId,int carProductNum,Double carProductPrice,long carBuyerId);
    /*
    Change by yang  on 2017.8.7    user delete product,change  product's status
    */
    int deleteProduct(long carProductId,int carStatus,long carBuyerId);
    /*
  Change by yang  on 2017.8.7    user  sign out or remove all car,change  product's status
  */
    int deleteAllProduct(int carStatus,long carBuyerId);
    /*
    Change by yang  on 2017.8.7    user select my car
     */
    List<Car> selectUserCar(long carBuyerId,int carStatus);
}