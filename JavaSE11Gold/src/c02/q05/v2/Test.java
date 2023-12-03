package c02.q05.v2;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> bi = new BiConsumer<String, Integer>(){
			@Override
			public void accept(String k, Integer v) {
				map.put(k, v);
			};
		};
		bi.accept("apple", 3);
		bi.accept("orange", 2);
		
		System.out.println(map);
	}

}
