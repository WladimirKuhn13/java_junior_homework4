package org.example;

import jakarta.persistence.*;
import java.util.Random;

@Entity
@Table(name="persons")
public class Person {

    private static final Random random = new Random();

    @Id
    @GeneratedValue
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;



    public Person() {

    }

    public Person(String name, int age) {
        id = random.nextInt(11 - 1 + 1) + 1;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
