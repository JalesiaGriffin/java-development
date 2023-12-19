package com.pluralsight;

import com.pluralsight.model.Product;
import com.pluralsight.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);

		// this locates a Bean that is of type ProductService
		ProductService productService = context.getBean(ProductService.class);

		Scanner scan = new Scanner(System.in);

		System.out.println("1.) List Products");
		System.out.println("2) Add Product");
		System.out.print("Select option: ");
		String option = scan.nextLine();

		switch (option) {
			case "1":
				listProducts(productService.getAllProducts());
				break;
			case "2":
				productService.addProduct(createProduct(scan));
				break;
			default:
				System.out.println("invalid response.");
		}
	}

	public static Product createProduct(Scanner scan){
		System.out.print("Product ID: ");
		int id = scan.nextInt();
		scan.nextLine();

		System.out.print("Name: ");
		String name = scan.nextLine();

		System.out.print("Category: ");
		String category = scan.nextLine();

		System.out.print("Price: ");
		double price = scan.nextDouble();
		scan.nextLine();

		return new Product(id, name, category, price);
	}

	public static void listProducts(List<Product> products){
		products.forEach(System.out::println);
	}
}