package banger.action.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import banger.action.dao.SellerDAO;
import banger.action.model.PaginationBean;
import banger.action.model.Picture;
import banger.action.model.Product;
import banger.action.service.SellerService;
import banger.action.util.UuidUtil;

@Service("sellerService")
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerDAO sellDao;

	@Override
	public PaginationBean<Product> findProList(String page, String sellerid) {
		// TODO Auto-generated method stub
		PaginationBean<Product> propagbean = new PaginationBean<Product>();
		if (page != null) {
			propagbean.setCurrPage(Integer.valueOf(page));
		}
		propagbean.setSellerId(sellerid);

		propagbean = sellDao.findProList(propagbean);

		return propagbean;
	}

	@Override
	public boolean editIsSell(String proid) {
		// TODO Auto-generated method stub
		int tt = sellDao.findIsSell(proid);
		if (tt == 0) {
			return sellDao.editIsSell1(proid);
		} else {
			return sellDao.editIsSell2(proid);
		}
	}

	/*
	 * 添加商品
	 * 
	 * @see banger.action.service.SellerService#addproduct(banger.action.model.
	 * Product, java.lang.String)
	 */
	@Override
	public boolean addproduct(Product product, String imglistsrc) {
		// TODO Auto-generated method stub
		boolean adimg = false;
		boolean adpro = sellDao.addproduct(product);
		Picture picture = new Picture();
		String[] imgs = imglistsrc.split(",");
		String proid = product.getProductId();
		System.out.println(imgs);
		for (int i = 0; i < imgs.length; i++) {
			picture.setPictureAddress(imgs[i].toString());
			picture.setPictureId(UuidUtil.generateShortUuid());
			picture.setProductId(proid);
			adimg = sellDao.addimgs(picture);
		}
		if (adpro == true && adimg == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Product findproductmsg(String productId) {
		// TODO Auto-generated method stub
		return sellDao.findproductmsg(productId);
	}

	@Override
	public List<Picture> findproductimg(String productId) {
		// TODO Auto-generated method stub
		return sellDao.findproductimg(productId);
	}

	@Override
	public boolean editproduct(Product product, String imglistsrc) {
		boolean delimg = false;
		boolean addimg = false;
		boolean eidtpromsg = sellDao.editpromsg(product);
		Picture picture = new Picture();
		String[] imgs = imglistsrc.split(",");
		String proid = product.getProductId();
		System.out.println(imgs);
		for (int i = 0; i < imgs.length; i++) {
			picture.setPictureAddress(imgs[i].toString());
			picture.setPictureId(UuidUtil.generateShortUuid());
			picture.setProductId(proid);

			delimg = sellDao.deleteimg(proid);
			if (delimg == true) {
				addimg = sellDao.addimgs(picture);
			}

		}
		if (eidtpromsg == true && addimg == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delproduct(String productId) {
		// TODO Auto-generated method stub
		boolean delmsg = sellDao.delpromsg(productId);
		System.out.println(delmsg+"&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		if (delmsg == true) {
			
			return sellDao.deleteimg(productId);
		} else {
			return false;
		}
	}

}
