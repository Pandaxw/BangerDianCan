package banger.action.dao;


import java.util.List;

import banger.action.model.PaginationBean;
import banger.action.model.Picture;
import banger.action.model.Product;

public interface SellerDAO {

	PaginationBean<Product> findProList(PaginationBean<Product> propagbean);

	int findIsSell(String proid);

	boolean editIsSell1(String proid);

	boolean editIsSell2(String proid);

	boolean addproduct(Product product);

	boolean addimgs(Picture picture);

	Product findproductmsg(String productId);

	List<Picture> findproductimg(String productId);

	boolean editpromsg(Product product);

	boolean deleteimg(String productId);

	boolean delpromsg(String productId);
	
}
