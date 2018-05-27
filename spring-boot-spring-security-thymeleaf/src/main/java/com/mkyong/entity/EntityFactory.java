package com.mkyong.entity;

public class EntityFactory {

    public User getNewUser(){
        return new User();
    }

    public UserGroup getNewUserGroup(){
        return new UserGroup();
    }

    public Booking getNewBooking(){
        return new Booking();
    }

    public Address getNewAddress(){
        return new Address();
    }

    public Accommodation getNewAccom(){
        return new Accommodation();
    }

}
