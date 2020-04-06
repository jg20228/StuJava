package coffeeshop;

import lombok.Data;

@Data
public class Coffee {
	private String name;
	private int price;

	public Coffee() {
	}

	public Coffee(MenuItem menuItem) {
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}
}
