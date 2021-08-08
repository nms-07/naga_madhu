package revature_programs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

 class List_to_Map{

	public static void main(String[] args) {
		List<Bus>buslist=new ArrayList<Bus>();
		buslist.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		buslist.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		buslist.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		buslist.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		buslist.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		buslist.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		Map<Integer, Bus> map=new TreeMap<>();
		map=buslist.stream().collect(Collectors.toMap(Bus->Bus.getId(), Bus->Bus));
		map.entrySet().stream().forEach(System.out::println);
	}
}
