package com.learning.may.ut.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.learning.may.ut.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@InjectMocks
	SomeBusinessImpl sb;
	
	@Mock
	SomeDataService dataServiceMock;

	@Test
	void calculateSumUsingDataServiceTest() {
		// dataServiceMock retrieveAllData new int[] { 1, 2, 3 }
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
		
		assertEquals(6, sb.calculateSumUsingDataService());
	}

	@Test
	void calculateSumForNegativeNumbers() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { -1, -2, -3 });
		
		assertEquals(-6, sb.calculateSumUsingDataService());
	}

	@Test
	void calculateSumForEmptyArray() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		
		assertEquals(0, sb.calculateSumUsingDataService());
	}

}
