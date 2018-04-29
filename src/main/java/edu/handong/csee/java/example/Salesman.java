package edu.handong.csee.java.example;

public class Salesman implements Comparable<Salesman> {
	private String name;
	private double sales;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSales() {
		return sales;
	}
	
	public void setSales(double sales) {
		this.sales = sales;
	}

	@Override
	public int compareTo(Salesman anotherSalesman) {
		double compareSales = ((Salesman)anotherSalesman).getSales();
		
		return (int) (compareSales - this.sales);
	}
}
