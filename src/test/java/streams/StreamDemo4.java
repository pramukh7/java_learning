package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Product {
	private int id;
	private String name;
	private int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class StreamDemo4 {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Sampoo", 5));
		products.add(new Product(2, "Cream", 10));
		products.add(new Product(3, "Toy", 55));
		products.add(new Product(4, "Soap", 7));
		products.add(new Product(5, "TV", 13000));
		products.add(new Product(6, "Laptop", 30000));
		products.add(new Product(7, "Shoes", 200));

		printProduct(products);
	}

	private static void printProduct(List<Product> products) {
		List<Product> filterProduct = new ArrayList<>();
		filterProduct = products
				.stream()
				.filter(product->product.getPrice() > 20)
				.collect(Collectors.toList());
		
				filterProduct.forEach(
						product->
						System.out.println(
								product.getId() + 
								product.getName() + 
								product.getPrice()));
	}
}
