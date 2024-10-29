package com.nit.controller;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		int[] vals = {1,2,3,4,5,6};
		List<Integer> names = List.of(1,2,3,4,5,67,8);
		names.forEach(obj -> System.out.println(obj));
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("welcome1"));
	}

}
