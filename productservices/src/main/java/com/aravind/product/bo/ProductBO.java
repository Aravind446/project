package com.aravind.product.bo;

import com.aravind.product.dto.Product;

public interface ProductBO {
void create (Product product);
 Product findProduct(int id);
}
