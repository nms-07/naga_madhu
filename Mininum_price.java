package revature_programs;

import java.util.*;

 public class Minimumprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bus> buslist=new ArrayList<Bus>();
		buslist.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		buslist.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		buslist.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		buslist.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		buslist.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		buslist.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		Double minprice=buslist.stream().filter(e->e.getProviderName().equals("Xyz Travels")).map(e -> e.getCost()).sorted().findFirst().get();
		System.out.println("Minimum cost in Xyz Travellers is : "+minprice);
	}

}
