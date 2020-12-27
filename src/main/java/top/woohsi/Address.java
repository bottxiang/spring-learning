package top.woohsi;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city="Shanghai";
    private String avenue="No. 99, Dechun Road";

    public Address() {
    }

    @Override
    public String toString() {
        return "top.woohsi.Address: " + avenue + ", " + city + '.';
    }
}
