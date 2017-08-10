package banger.action.handler;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import banger.action.model.PaginationBean;
import banger.action.model.Picture;
import banger.action.model.Product;
import banger.action.service.SellerService;
import banger.action.util.ServletUtil;
import banger.action.util.UuidUtil;

/**
 * 
 * @author 黄福州
 * 该类主要为商家模块的商品的增删改查功能，后面会补充商家模块订单的增删改查
 * 
 *
 */

@Controller
@RequestMapping("/seller")
@SessionAttributes({"users"})
public class SellerHandler {
	
	@Autowired
	private SellerService sellerService;
	

	/*
	 * 获取商品列表
	 */
	@RequestMapping("/findProList")//处理分页,得到该商家的所有的商品
	@ResponseBody//@ResponseBody做json异步响应处理注解，响应的数据对象，springMVC会把此对象转换成json字符串响应
	public PaginationBean<Product> findProList(String page,String sellerid ){
		
		PaginationBean<Product> products = sellerService.findProList(page,sellerid);
		
		return products;
		
	}
	/*
	 * 修改商品上架状态
	 */
	
	@RequestMapping("/editIsSell")
	@ResponseBody
	public boolean editIsSell(String proid){
		
		return sellerService.editIsSell(proid);
	 
	}
	/*
	 * 添加商品
	 */
	@RequestMapping("/addpro")
	@ResponseBody
	public boolean addproduct(Product product,String imglistsrc){
		String productId=UuidUtil.generateShortUuid();
		product.setProductId(productId);	
		System.out.println(product+imglistsrc+productId+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");	
		boolean tt=sellerService.addproduct(product,imglistsrc);	
		/*Product [id=0, productId=qN4z5EXO, productName=tufou, productSellerId=1001, productPrice=33.22, productStock=22, productTaste=0, productIsSell=1,
				productDescription=还是很美味的, productHassSelled=0]/zxdImg/4.jpg,/zxdImg/6.jpg,qN4z5EXO@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*/	
		return true;
	}	
	/*
	 * 上传图片到服务器下面
	 */
	
	@RequestMapping("/updatepic")
	@ResponseBody
	public String updatepic(MultipartFile picdata){	
		String path="";
		System.out.println(picdata + "picdata****************");
		if (picdata != null && !picdata.isEmpty()) {
			try {
				File file = new File(ServletUtil.UPLOAD_DIR, picdata.getOriginalFilename());
				picdata.transferTo(file);
				path=("/" + ServletUtil.UPLOAD_DIR_NAME + "/" + picdata.getOriginalFilename());			
			} catch (IllegalStateException | IOException e) {
				System.err.println("图片上传失败");
			}
		}
		return path;		
	}
	
	/*
	 * 点击查看详情查看商品文本信息
	 */
	
	@RequestMapping("/findproductmsg")
	@ResponseBody
	public Product findproductmsg(String productId){	
		return sellerService.findproductmsg(productId);	
	}
	
	/*
	 * 点击查看详情查看商品图片
	 */
	@RequestMapping("/findproductimg")
	@ResponseBody
	public List<Picture> findproductimg(String productId){	
		return sellerService.findproductimg(productId);	
	}
	
	/*
	 * 修改商品信息
	 */
	@RequestMapping("/editproduct")
	@ResponseBody
	public boolean editproduct(Product product,String imglistsrc){
		
		System.out.println(product.toString()+imglistsrc+"################");
		return sellerService.editproduct(product,imglistsrc);	
	}
	
	/*
	 * 删除商品信息
	 */
	@RequestMapping("/delproduct")
	@ResponseBody
	public boolean delproduct(String productId){
		
		return sellerService.delproduct(productId);	
	}
	
}
