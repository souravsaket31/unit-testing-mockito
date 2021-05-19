package com.learning.may.ut.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when; 
import java.util.List;

import org.junit.jupiter.api.Test;

class ListMockTest {

	List<String> mock = mock(List.class);

	@Test
	void basicSizeTest() {

		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());

	}

	@Test
	void anyParamTest() {

		when(mock.get(anyInt())).thenReturn("Saket");
		assertEquals("Saket", mock.get(0));
		assertEquals("Saket", mock.get(1));

	}
}
