package org.example.springdatajpa.repository;

import org.example.springdatajpa.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository repository;

    @Test
    void test1() {
        Person person = new Person();
        person.setName("save");

        repository.save(person);

        Person saved = repository.findById(person.getId()).orElseThrow();
        System.out.println(saved);
    }

    @Test
    void test2() {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setName("saveAll" + i);
            list.add(person);
        }
        repository.saveAll(list);
    }
}