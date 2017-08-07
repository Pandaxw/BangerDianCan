package banger.action.service;


import banger.action.util.ProductNum;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface CarService {
    void addProduct(HttpSession session,long carProductId);
    List<ProductNum> myCar(HttpSession session);
    int updateProductNum(HttpSession session,long carProductId,int carProductNum);
}
