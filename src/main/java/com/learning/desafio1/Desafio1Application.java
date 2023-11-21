package com.learning.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.desafio1.entities.Order;
import com.learning.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order o1 = new Order(134, 150.00, 20.00);
		Order o2 = new Order(2282, 800.00, 10.00);
		Order o3 = new Order(1309, 95.90, 0.00);

		System.out.println("Order number: " + o1.getCode());
		System.out.println("Total value: " + String.format("%.2f", orderService.total(o1)));

		System.out.println();

		System.out.println("Order number: " + o2.getCode());
		System.out.println("Total value: " + String.format("%.2f", orderService.total(o2)));

		System.out.println();

		System.out.println("Order number: " + o3.getCode());
		System.out.println("Total value: " + String.format("%.2f", orderService.total(o3)));

	}

}
