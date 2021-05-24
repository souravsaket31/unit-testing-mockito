package com.learning.may.ut.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	String actualResponse = "{\"id\":1,\"name\":\"Book\",\"desc\":\"Cracking the Coding Interview\"}";

	@Test
	public void jsonAssert_strict_true() throws JSONException {
		String expectedResponse = "{\"id\": 1,\"name\":\"Book\",\"desc\":\"Cracking the Coding Interview\"}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);

	}

	@Test
	public void jsonAssert_strict_false() throws JSONException {
		String expectedResponse = "{\"id\": 1,\"name\":\"Book\"}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);

	}
	@Test
	public void jsonAssert_without_escape_sequence() throws JSONException {
		String expectedResponse = "{id:1,name:Book}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);

	}
}
