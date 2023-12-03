package c02.q11;

import java.util.function.BiFunction;

public class ZeroPad implements BiFunction<String, Integer, String> {

	@Override
	public String apply(String t, Integer u) {
		return String.format("%" + u + "s", t).replace(' ', '0');
	}
}
