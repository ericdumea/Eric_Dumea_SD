package com.mkyong.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Accommodation property;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User customer;

    private Float price;

    private Date check_in;

    private Date check_out;

    public Booking(Accommodation property, User customer, Float price, Date check_in, Date check_out) {
        this.property = property;
        this.customer = customer;
        this.price = price;
        this.check_in = check_in;
        this.check_out = check_out;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Accommodation getProperty() {
        return property;
    }

    public void setProperty(Accommodation property) {
        this.property = property;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", property=" + property +
                ", customer=" + customer +
                ", price=" + price +
                ", check_in=" + check_in +
                ", check_out=" + check_out +
                '}';
    }
}
