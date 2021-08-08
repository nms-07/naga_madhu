package comparator;

import java.util.Comparator;

public class Product {
	private int id;
	private String name;
	private float cost;
	private float rating;
	private float quant;
	public Product(int id,String name,float cost,float rating,float quant) {
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.rating=rating;
		this.quant=quant;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getQuant() {
		return quant;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setQuant(float quant) {
		this.quant = quant;
	}
	public String toString() {
		String s="[id="+id+" product name="+name+" cost="+cost+" rating="+rating+" weight="+quant+"]";
		return s;
		
	}
	

}
