package edu.cityech.cst.review.stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.cityech.cst.review.model.Stock;

public class StockDAO {

	
	public List<Stock> findBy(Map<String, String> map) {

		List<Stock> sectors = new ArrayList<Stock>();
		return sectors;
		
	}


	public List<Stock> findAll() {
		Map<String, String> map = new HashMap<>();
		return this.findBy(map);
	}

}
