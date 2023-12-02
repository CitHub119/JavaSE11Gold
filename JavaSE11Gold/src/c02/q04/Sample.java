package c02.q04;

public class Sample {

	public static void main(String[] args) {
		Item item = new Item.Builder(100)
						.setName("oranbe")
						.setPrice(120)
						.build();
		System.out.println(item);
	}

}
