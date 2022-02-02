package com.example.product;

import com.example.product.pojo.Products;
import com.example.product.service.ProductService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class ProductApplicationTests {

	private static final Integer ID=1;
	private static final String TITLE="Dji Mavic";
	private static final String DESCRIPTION="Very Good";
	private static final String TEXT="Product has been deleted";

	private Products products;

	private ProductService productService;

	@Before("")
	public void setUp(){
		products = new Products(ID,TITLE,DESCRIPTION);
	}

	@Test
	void DeleteById() {
		assertEquals(products.getId().equals(1));
	}

	private void assertEquals(boolean equals) {
	}

}
