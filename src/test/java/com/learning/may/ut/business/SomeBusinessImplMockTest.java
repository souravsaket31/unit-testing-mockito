package com.learning.may.ut.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.learning.may.ut.data.SomeDataService;

class SomeBusinessImplMockTest {

	@Test
	void calculateSumUsingDataServiceTest() {

		SomeBusinessImpl sb = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);

		// dataServiceMock retrieveAllData new int[] { 1, 2, 3 }

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		sb.setSomeDataService(dataServiceMock);
		int actual = sb.calculateSumUsingDataService();
		assertEquals(6, actual);
	}

	@Test
	void calculateSumForNegativeNumbers() {

		SomeBusinessImpl sb = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		sb.setSomeDataService(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { -1, -2, -3 });
		int actual = sb.calculateSumUsingDataService();
		assertEquals(-6, actual);
	}

	@Test
	void calculateSumForEmptyArray() {
		SomeBusinessImpl sb = new SomeBusinessImpl();
		SomeDataService dataServiceMock = mock(SomeDataService.class);
		sb.setSomeDataService(dataServiceMock);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		int actual = sb.calculateSumUsingDataService();
		assertEquals(0, actual);
	}

}
