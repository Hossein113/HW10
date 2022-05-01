package maktab74.practice10.org.domain;

import maktab74.practice10.org.Base.domain.BaseEntity;

public class User extends BaseEntity<Long> {

    private String name;

    private String service;

    private String amount;

    public User() {
    }

    public User(String name, String service, String amount) {
        this.name = name;
        this.service = service;
        this.amount = amount;
    }

    public User(Long aLong, String name, String service, String amount) {
        super(aLong);
        this.name = name;
        this.service = service;
        this.amount = amount;
    }
}


