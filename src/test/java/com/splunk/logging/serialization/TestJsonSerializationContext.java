package com.splunk.logging.serialization;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import org.junit.Assert;

import java.lang.reflect.Type;

public class TestJsonSerializationContext implements JsonSerializationContext {

    private final String expected;

    public TestJsonSerializationContext(String expected) {
        this.expected = expected;
    }

    @Override
    public JsonElement serialize(Object src) {
        Assert.assertEquals(expected, src.toString());
        return null;
    }

    @Override
    public JsonElement serialize(Object src, Type typeOfSrc) {
        return null;
    }
}
