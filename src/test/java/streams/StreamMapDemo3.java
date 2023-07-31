package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Product1 {
	private int id;
	private String name;
	private int price;
	
	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamMapDemo3 {

	public static void main(String[] args) {
		List<Product1> products = new ArrayList<>();
		products.add(new Product1(1, "Sampoo", 5));
		products.add(new Product1(2, "Cream", 10));
		products.add(new Product1(3, "Toy", 55));
		products.add(new Product1(4, "Soap", 7));
		products.add(new Product1(5, "TV", 13000));
		products.add(new Product1(6, "Laptop", 30000));
		products.add(new Product1(7, "Shoes", 200));

		printProduct(products);
	}

	private static void printProduct(List<Product1> products) {
		List<Integer> namesLength = new ArrayList<>();
		Map<String, Integer> filterProduct = new HashMap<>();
		namesLength = products
				.stream()
				.map(name->name.getName().length())
				.collect(Collectors.toList());
		
		for(int i=0;i<products.size();i++)
		{
			filterProduct.put(products.get(i).getName(), namesLength.get(i));
		}
		System.out.println(filterProduct);		
	}

}