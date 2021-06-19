package com.example.newCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewCalculatorApplicationTests {

	private Calculator calculator;

	@BeforeEach
	public void setUp(){
		calculator = new Calculator();
	}



	@Test
	@DisplayName("test sum")
	void test1() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 10;

		assert calculator.sum(first, second).equals(expected);
	}

	@Test
	@DisplayName("test multiply")
	void test2() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 21;

		assert calculator.multiply(first, second).equals(expected);
	}

	@Test
	@DisplayName("test substraction")
	void test3() {
		Integer first = 12;
		Integer second = 4;
		Integer expected = 8;

		assert calculator.substraction(first, second).equals(expected);
	}

	@Test
	@DisplayName("test division")
	void test4() {
		Integer first = 30;
		Integer second = 6;
		Integer expected = 5;

		assert calculator.division(first, second).equals(expected);
	}

	@Test
	@DisplayName("test elevate")
	void test5() {
		Integer first = 2;
		Integer second = 3;
		Integer expected = 8;

		assert calculator.elevate(first, second).equals(expected);
	}

	@Test
	@DisplayName("test sqrt")
	void test6() {
		Integer first = 9;
		Integer second = 2;
		Integer expected = 3;

		assert calculator.sqrt(first, second).equals(expected);
	}

}
