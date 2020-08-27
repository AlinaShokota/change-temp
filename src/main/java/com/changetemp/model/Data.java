package com.changetemp.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tab_cpu")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "T_Date")
    private LocalDate T_Date;
    @Column(name = "TValue")
    private int TValue;
    @Column(name = "T_Time")
    private LocalTime T_Time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getT_Date() {
        return T_Date;
    }

    public void setT_Date(LocalDate t_Date) {
        T_Date = t_Date;
    }

    public int getTValue() {
        return TValue;
    }

    public void setTValue(int TValue) {
        this.TValue = TValue;
    }

    public LocalTime getT_Time() {
        return T_Time;
    }

    public void setT_Time(LocalTime t_Time) {
        T_Time = t_Time;
    }
}
