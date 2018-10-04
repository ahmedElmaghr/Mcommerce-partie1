package com.ecommerce.microcommerce.dto;

import com.ecommerce.microcommerce.model.Product;

public class MargeProductDTO {

	private Product product;
	private int margeProduct;

	public MargeProductDTO() {
	}

	public MargeProductDTO(Product product, int margeProduct) {
		super();
		this.product = product;
		this.margeProduct = margeProduct;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getMargeProduct() {
		return margeProduct;
	}

	public void setMargeProduct(int margeProduct) {
		this.margeProduct = margeProduct;
	}

}
