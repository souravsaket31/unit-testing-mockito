package com.learning.may.ut.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void calculateSumSimpleTest() {

		SomeBusinessImpl sb = new SomeBusinessImpl();
		assertEquals(6, sb.calculateSum(new int[] { 1, 2, 3 }));
	}

	@Test
	void calculateSumEmptyTest() {

		SomeBusinessImpl sb = new SomeBusinessImpl();
		assertEquals(0, sb.calculateSum(new int[] {}));

	}
	@Test
	void calculateSumUsingDataServiceTest() {

		

	}

}
