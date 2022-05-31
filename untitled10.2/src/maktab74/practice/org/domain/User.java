package maktab74.practice.org.domain;

import maktab74.practice.org.Base.domain.BaseEntity;

public class User extends BaseEntity<Long> {

    private String name;
    private String service;
    private String amount;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", service='" + service + '\'' +
                ", amount='" + amount + '\'' +
                "} " + super.toString();
    }
}
