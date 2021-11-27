package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeTest {

	@Test
	void test2() {
		Assertions.assertTrue(Prime.isPrime(2));
	}
	
	@Test
	void test3() {
		Assertions.assertTrue(Prime.isPrime(3));
	}
	
	@Test
	void test4() {
		Assertions.assertTrue(Prime.isPrime(4));
	}
	
	@Test
	void test5() {
		Assertions.assertTrue(Prime.isPrime(5));
	}
	
	@Test
	void test6() {
		Assertions.assertTrue(Prime.isPrime(6));
	}
}
