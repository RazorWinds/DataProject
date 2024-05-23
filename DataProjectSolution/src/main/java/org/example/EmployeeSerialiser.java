package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class EmployeeSerialiser {

    public static String employeesToJson(ArrayList<Employee> employees) throws JsonProcessingException {
        JsonMapper mapper = new JsonMapper();
        mapper.registerModule(new JavaTimeModule());

        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper.writeValueAsString(employees);
    }

    public static ArrayList<Employee> jsonToEmployees(String json) throws JsonProcessingException {
        JsonMapper mapper = new JsonMapper();
        return mapper.readValue(json, new TypeReference<ArrayList<Employee>>() {
        });
    }

    public static String employeesToXml(ArrayList<Employee> employees) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();

        mapper.registerModule(new JavaTimeModule());

        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper.writeValueAsString(employees);
    }

    public static ArrayList<Employee> xmlToEmployees(String xml) throws JsonProcessingException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(xml, new TypeReference<ArrayList<Employee>>() {
        });
    }

    public static void outputJson(ArrayList<Employee> employees) {
        try {
            Path filePath = Path.of("src/main/resources/JsonOutput.txt");
            Files.write(filePath, employeesToJson(employees).getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void outputXml(ArrayList<Employee> employees) {
        try {
            Path filePath = Path.of("src/main/resources/XmlOutput.txt");
            Files.write(filePath, employeesToXml(employees).getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
