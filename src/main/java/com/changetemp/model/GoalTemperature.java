package com.changetemp.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "goal_temp")
public class GoalTemperature {
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

    public GoalTemperature() {
    }

    public GoalTemperature(LocalDate t_Date, int TValue, LocalTime t_Time) {
        this.T_Date = t_Date;
        this.TValue = TValue;
        this.T_Time = t_Time;
    }

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
        this.T_Date = t_Date;
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
        this.T_Time = t_Time;
    }
}
