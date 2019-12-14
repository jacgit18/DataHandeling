package edu.cityech.cst.review.driver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;

import edu.cityech.cst.review.model.Stock;
import edu.cityech.cst.review.stock.StockDAO;

public class MonthlyCostData {
	
	public static void costmethod() {
		List<String> bankStocks =
				Arrays.asList("CM:36.13","C:77.10","HSBC:38.45","RY:79.26","TD:55.63");
		
		// can only be accessed once find out later how to make it more
		DoubleStream Monthlycost = 	
				bankStocks.stream().mapToDouble(m -> {
					double n = Double.parseDouble(m.split(":")[1]);
					return n;
				});

 		System.out.println("Montly Cost " +  Monthlycost.summaryStatistics());
	}
	
	
	public static void stockmethod() {
		StockDAO dao = new StockDAO();
		List<Stock> bankStocks = dao.findAll();
		
		bankStocks.forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		bankStocks.stream().sorted()
		.forEach(System.out::println);
		
	}


	public static void main(String[] args) {

//		costmethod();
		stockmethod();
	
	}
	
	
}
