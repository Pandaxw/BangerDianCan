package banger.action.service;

import java.util.List;

import banger.action.model.PaginationBean;
import banger.action.model.Picture;
import banger.action.model.Product;

public interface SellerService {

	PaginationBean<Product> findProList(String page,String sellerid);

	boolean editIsSell(String proid);

	boolean addproduct(Product product, String imglistsrc);

	Product findproductmsg(String productId);

	List<Picture> findproductimg(String productId);

	boolean editproduct(Product product, String imglistsrc);

	boolean delproduct(String productId);

	boolean editsIsSell1(String productId);
	
	boolean editsIsSell2(String productId);

}
