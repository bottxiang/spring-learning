package top.woohsi.bean;

import org.springframework.stereotype.Component;

//@Component
public class Address {

    private String city="Shanghai";
    private String avenue="No. 99, Dechun Road";

    public Address() {
    }

    @Override
    public String toString() {
        return "top.woohsi.bean.Address: " + avenue + ", " + city + '.';
    }
}
