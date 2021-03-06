package com.plexobject.mock.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/**
 * This class provides serializatio support using YAML format
 * 
 * @author shahzad bhatti
 *
 */

public class YAMLUtils {
    private static ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    public static String marshal(Object value) throws IOException {
        try {
            return mapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new IOException(e);
        }
    }

    public static Object unmarshal(String yaml, Class<?> klass)
            throws IOException {
        return mapper.readValue(yaml, klass);
    }

    public static void write(File outputFile, Object value) throws IOException {
        try {
            mapper.writeValue(outputFile, value);
        } catch (JsonProcessingException e) {
            throw new IOException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T read(File inputFile, Class<?> klass)
            throws IOException {
        return (T) mapper.readValue(inputFile, klass);
    }

    @SuppressWarnings("unchecked")
    public static <T> T read(String input, Class<?> klass) throws IOException {
        return (T) mapper.readValue(input, klass);
    }
}
