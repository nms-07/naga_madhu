package comparator;

import java.util.*;


public class ProductMain {

	public static <T> void main(String[] args) {
		List<Product> pd=new ArrayList<Product>();
		pd.add(new Product(11, "ABC", 25f, 3.2f, 2.5f));
		pd.add(new Product(12, "xyz", 30.5f, 4.0f, 2f));
		pd.add(new Product(13, "pqr", 40.7f, 3.0f, 5.3f));
		pd.add(new Product(16, "ABC", 50f, 2.4f, 4f));
		pd.add(new Product(18, "pqr", 45.3f, 2.6f, 3f));
		pd.add(new Product(22, "mno", 15f, 2.8f, 3.2f));
		for(Product i:pd) {
			System.out.println(i);
		}
		Collections.sort(pd, (Product p1, Product p2) -> {
			Integer d1 = p1.getId();
			Integer d2 = p2.getId();
			return d1.compareTo(d2);
		});
		System.out.println("Sorting based on id");
		printProductList(pd);
		
		Collections.sort(pd, (Product p1, Product p2) -> {
			Float d1 = p1.getCost();
			Float d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("Sorting based on cost");
		printProductList(pd);
		
		Collections.sort(pd, (Product p1, Product p2) -> {
			Float f1=p1.getRating();
			Float f2=p2.getRating();
			int x=f2.compareTo(f1);
			if(x==0) {
				Float d1 = p1.getCost();
				Float d2 = p2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("Sorting based on rating");
		printProductList(pd);
	}
	public static void printProductList(List<Product> pd) {
		for (Product p : pd) {
			System.out.println(p);
		}
	}

}
