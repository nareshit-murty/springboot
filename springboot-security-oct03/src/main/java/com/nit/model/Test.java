package com.nit.model;

public class Test {

	public static void main(String[] args) {
		Student st = Student.builder()
				.id(1L)
				.name("Kiran")
				.marsks(1234F)
				.build();
		System.out.println(st);

	}

}
