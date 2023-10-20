package vn.edu.iuh.fit.collectionInjection;

import java.util.List;

public class Person {
    private String name;
    private List<String> email;
    private int age;
    private List<Address> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", email=" + email +
                ", age=" + age +
                ", addresses=" + addresses +
                '}';
    }

    public Person(String name, List<String> email, int age, List<Address> addresses) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.addresses = addresses;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
