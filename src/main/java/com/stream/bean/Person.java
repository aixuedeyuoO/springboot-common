package com.stream.bean;

/**
 * Person
 *
 * @author Jun Mowen
 * @date 2020/1/25
 */
public class Person {
    private String name;
    private Integer age;
    private String address;


    public Person() {
        super();
    }
    public Person(String name, Integer age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
