package revature_programs;

import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Match_distinct {

	public static void main(String[] args) {
		List<Bus> buslist=new ArrayList<>();
		buslist.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		buslist.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		buslist.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		buslist.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		buslist.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		buslist.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		Boolean anymatch=buslist.stream().anyMatch(e->e.getProviderName().matches("Jee Travels"));
		System.out.println(anymatch);
		Boolean allmatch=buslist.stream().allMatch(e->e.getProviderName().matches("Abc Travels"));
		System.out.println(allmatch);
		Boolean nonematch=buslist.stream().noneMatch(e->e.getProviderName().matches("Xyz Travels"));
		System.out.println(nonematch);
        List<Bus> distinct_elements = buslist.stream().filter(distinctByKey(e -> e.getId())).collect(Collectors.toList());
        System.out.println(distinct_elements);
	}

}
