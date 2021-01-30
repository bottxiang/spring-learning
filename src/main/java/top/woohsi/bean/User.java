package top.woohsi.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Named
@Component
public class User {

    private String name = "Xiang";
    private String age = "20";
    private Address address;

    @Autowired(required=false)
    public User(Address address) {
        this.address = address;
    }

    public User() {}

    public User(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\n"
                + age + "\n"
                + address;
    }
}
