package com.ecommerce.microcommerce.utils;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.microcommerce.dto.MargeProductDTO;
import com.ecommerce.microcommerce.model.Product;

public class Utils {

	public static List<MargeProductDTO> caluclerMargeProduct(List<Product> products) {
		List<MargeProductDTO> margeProdDto = new ArrayList<>();
		for (Product product : products) {
			int margePrix = product.getPrix() - product.getPrixAchat();
			margeProdDto.add(new MargeProductDTO(product, margePrix));
		}
		return margeProdDto;
	}
}
