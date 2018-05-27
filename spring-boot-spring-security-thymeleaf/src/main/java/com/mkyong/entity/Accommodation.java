package com.mkyong.entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "accom")
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date start_date;

    private Date end_date;

    //
    //@ManyToOne
    @Transient
    private User host;


    public Accommodation() {
    }

    public Accommodation(Date start_date, Date end_date, User host) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.host = host;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

}
