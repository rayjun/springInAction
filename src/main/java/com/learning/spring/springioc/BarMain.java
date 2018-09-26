package com.learning.spring.springioc;

public class BarMain {

	public static void main(String[] args) {
		SpringIoc springIoc = new SpringIoc();
		Bar bar = new Bar(springIoc);
	}
}