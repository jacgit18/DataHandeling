package edu.cityech.cst.review.stock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.cityech.cst.review.model.Stock;

public class StockDAO {

	public List<Stock> findAll() {
		Map<String, Float> map = new HashMap<>();
//		map.put("", 36.13);
		
		List<String> bankStocks =
				Arrays.asList("CM:36.13","C:77.10","HSBC:38.45","RY:79.26","TD:55.63");
		
		return this.findAll(); 
	}

}
