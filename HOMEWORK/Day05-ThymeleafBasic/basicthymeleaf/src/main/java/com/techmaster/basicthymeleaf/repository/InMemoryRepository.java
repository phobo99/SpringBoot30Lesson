package com.techmaster.basicthymeleaf.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import com.techmaster.basicthymeleaf.model.Person;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

@Repository
public class InMemoryRepository {
    private List<Person> persons = new ArrayList<>();

    //Constructor đọc toàn bộ dữ liệu từ JSON vào
    public InMemoryRepository() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File file;

        try {
            file = ResourceUtils.getFile("classpath:static/danhsach.json");
            persons.addAll(mapper.readValue(file, new TypeReference<List<Person>>() {
            }));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getPerson() {
        return persons;
    }

}