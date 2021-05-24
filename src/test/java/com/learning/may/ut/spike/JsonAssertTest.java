package com.learning.may.ut.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	String actualResponse = "{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100,\"value\":0}";

	@Test
	public void jsonAssert_strict_true() throws JSONException {
		String expectedResponse = "{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100,\"value\":0}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);

	}

	@Test
	public void jsonAssert_strict_false() throws JSONException {
		String expectedResponse = "{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);

	}
	@Test
	public void jsonAssert_without_escape_sequence() throws JSONException {
		String expectedResponse = "{\"id\":1001,\"name\":\"Item-1\",\"desc\":\"Book\",\"price\":100,\"value\":0}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, false);

	}
}
