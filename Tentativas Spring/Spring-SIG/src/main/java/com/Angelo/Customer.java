package com.Angelo;

import java.util.Objects;

public class Customer
{
    private String name;
    private String email;
    private Integer id;
    private Integer age;

    public Customer(String name, String email, Integer id, Integer age) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(id, customer.id) && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, id, age);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
