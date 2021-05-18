package com.learning.may.ut.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.learning.may.ut.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 1, 2, 3 };
	}

}

class SomeDataServiceSimpleStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 1, 2, 3 };
	}

}

class SomeDataServiceEmptyStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {};
	}

}

class SomeBusinessImplStubTest {

	@Test
	void calculateSumUsingDataServiceTest() {

		SomeBusinessImpl sb = new SomeBusinessImpl();
		sb.setSomeDataService(new SomeDataServiceStub());
		int actual = sb.calculateSumUsingDataService();
		assertEquals(6, actual);
	}

	@Test
	void calculateSumSimpleStubTest() {

		SomeBusinessImpl sb = new SomeBusinessImpl();
		sb.setSomeDataService(new SomeDataServiceSimpleStub());
		assertEquals(6, sb.calculateSumUsingDataService());
	}

	@Test
	void calculateSumEmptyStubTest() {
		SomeBusinessImpl sb = new SomeBusinessImpl();
		sb.setSomeDataService(new SomeDataServiceEmptyStub());
		int actual = sb.calculateSumUsingDataService();
		assertEquals(0, actual);

	}

}
