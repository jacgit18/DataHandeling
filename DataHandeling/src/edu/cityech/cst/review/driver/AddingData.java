package edu.cityech.cst.review.driver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AddingData {

	public static void main(String[] args) {

		
		List<String> bankStocks =
				Arrays.asList("CM:36.13","C:77.10","HSBC:38.45","RY:79.26","TD:55.63");
		
		
		bankStocks.stream()
		.sorted( (s1,s2) ->{
			float price1 = Float.parseFloat(s1.split(":")[1]);
			float price2 = Float.parseFloat(s2.split(":")[1]);
			// negatve less than
			int statusDescend = -1 * Float.compare(price1, price2);
			// statusAcending doesnt need 1 it will be he same with 
			// or without it positive greater than
			int statusAcending = 1 * Float.compare(price1, price2);
			// statusEQ keeps order as is zero equal
			int statusEQ = 0 * Float.compare(price1, price2);

			return statusAcending;
		})
		.forEach(System.out::println);
		
	}

}
