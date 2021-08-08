package revature_programs;

import java.util.*;

public class Bill {
	private String itemname;
	private Double price;
	private Float quantity;
	
	public Bill(String itemname, Double price, Float quantity) {
		super();
		this.itemname = itemname;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Bill [itemname=" + itemname + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}


public class Total_bill {

	public static void main(String[] args) {
		List<Bill> bill=new ArrayList<Bill>();
		bill.add(new Bill("rice",220.55,12.5f));
		bill.add(new Bill("vegetables",100.00,5.5f));
		bill.add(new Bill("dall",5.25,2.0f));
		bill.add(new Bill("oil",100.55,2.5f));
		bill.add(new Bill("peppar",20.5,3.0f));
		System.out.println("TOTAL_LINE OF PRODUCTS:");
		System.out.println("-------------------------------");
		bill.stream().forEach(e->System.out.println("Total_line of "+e.getItemname()+" is "+e.getPrice()*e.getQuantity()));
		System.out.println("\n\nTOTAL BILL INCLUDING TAX:");
		System.out.println("-------------------------------");
		Double total=bill.stream().map(e->e.getPrice()*e.getQuantity()).reduce(0.0,(sum,ele)->sum+ele);
		
		System.out.println("Bill is :   \t "+total);
		
		System.out.println("Tax : \t \t "+total*5/100);
		System.out.println("\t\t ---------");
		total=total+(total*5/100);
		System.out.println("Total Bill is :\t "+total);
		System.out.println("\n\nProducts sort by itemname");
		System.out.println("-------------------------------");
		System.out.println("ITEM\t\tPRICE\t\tQuantity");
		System.out.println("--------\t-------\t\t--------");
		bill.stream().map(e->e.getItemname()+"\t\t"+e.getPrice()+"\t\t"+e.getQuantity()).sorted().forEach(x->System.out.println(x));
	}

}
