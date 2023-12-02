package c02.q04.v2;

import java.util.function.Consumer;

import c02.q04.v2.Item.Builder;

public class Sample {

	public static void main(String[] args) {
		Item item = new Item.Builder(100)
						.with(new Consumer<Item.Builder>() {
							@Override
							public void accept(Builder builder) {
								builder.name = "orage";
								builder.price = 120;
							}
						})
						.build();
		System.out.println(item);
	}

}
