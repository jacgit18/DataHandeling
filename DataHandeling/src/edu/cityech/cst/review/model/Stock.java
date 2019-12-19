package edu.cityech.cst.review.model;

public class Stock implements Comparable<Stock> {

	private String symbol;
	private float price;
	
	public Stock() {}
	
	public Stock(String symbol, float price) {
		super();
		this.symbol = symbol;
		this.price = price;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Stock o) {
		int status = this.symbol.compareTo(o.symbol);
		
		return status;
	}
	
	
}
