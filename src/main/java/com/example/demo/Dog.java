package com.example.demo;

import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Controller
public class Dog {

    private long id;
    @NotNull
    private String name;
    @NotNull
    @Size(min = 1)
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
