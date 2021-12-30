package jpabook.jpashop.domain;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    //접근제어자 설정
    protected Address() {
    }

    //생성할때만 값이 setting, Setter를 제공하지 않는다. 변경불가
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
