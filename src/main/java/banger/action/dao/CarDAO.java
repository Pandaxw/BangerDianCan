package banger.action.dao;

import banger.action.model.Car;
import org.apache.ibatis.annotations.Param;


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
    int updateNum(@Param("carProductId")String carProductId, @Param("carProductNum")int carProductNum, @Param("carProductPrice")Double carProductPrice, @Param("carBuyerId")String carBuyerId);
    /*
    Change by yang  on 2017.8.7    user delete product,change  product's status
    */
    int deleteProduct(@Param("carProductId")String carProductId,@Param("carStatus")int carStatus,@Param("carBuyerId")String carBuyerId);
    /*
  Change by yang  on 2017.8.7    user  sign out or remove all car,change  product's status
  */
    int deleteAllProduct(int carStatus,String carBuyerId);
    /*
    Change by yang  on 2017.8.7    user select my car
     */
    List<Car> selectUserCar(String carBuyerId,int carStatus);
      /*
    Change by yang  on 2017.8.9    user select a my product
     */
    Car selectCarproduct(@Param("carProductId")String carProductId, @Param("carStatus")int carStatus, @Param("carBuyerId")String carBuyerId);
}