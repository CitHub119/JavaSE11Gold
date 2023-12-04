package c02.q13;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.replaceAll(x -> x.toUpperCase());
		
		list.forEach(x -> System.out.println(x));
	}
}
