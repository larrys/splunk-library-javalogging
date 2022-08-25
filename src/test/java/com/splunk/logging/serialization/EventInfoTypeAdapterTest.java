package com.splunk.logging.serialization;

import com.splunk.logging.HttpEventCollectorEventInfo;
import org.junit.Test;

import java.util.HashMap;

public class EventInfoTypeAdapterTest {
    @Test
    public void testSerialize() {
        EventInfoTypeAdapter eventInfoTypeAdapter = new EventInfoTypeAdapter();
        HttpEventCollectorEventInfo httpEventCollectorEventInfo = new HttpEventCollectorEventInfo(
                System.currentTimeMillis(),
                "INFO",
                "// This is a message",
                this.getClass().toString(),
                Thread.currentThread().getName().toString(),
                new HashMap<>(),
                null,
                null
        );
        eventInfoTypeAdapter.serialize(
                httpEventCollectorEventInfo,
                null,
                new TestJsonSerializationContext(
                        "{severity=INFO, logger=class com.splunk.logging.serialization.EventInfoTypeAdapterTest, thread=main, message=// This is a message}"));
    }
}
