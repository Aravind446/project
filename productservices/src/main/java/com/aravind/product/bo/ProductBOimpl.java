package com.aravind.product.bo;

import com.aravind.product.dao.ProductDAO;
import com.aravind.product.dao.ProductDAOimpl;
import com.aravind.product.dto.Product;

public class ProductBOimpl implements ProductBO {

	
	private static ProductDAO dao = new ProductDAOimpl();
	@Override
	public void create(Product product) {
dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
