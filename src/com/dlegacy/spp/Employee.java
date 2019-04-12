package com.dlegacy.spp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    private String name;
    private Professions profession;
    private int salary;
    private String location;
    private Car car;
    private boolean availability;


    public Employee(){

    }

    public Employee(String name, Professions profession, int salary, String location) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(Professions profession) {
        this.profession = profession;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return this.car;
    }

    public Professions getProfession() {
        return profession;
    }

    public boolean isAvailability() {
        return availability;
    }

    public boolean isLoader(Professions profession){
        return profession == Professions.LOADER;
    }

    @Override
    public String toString() {
        return "Name " + this.name + " with profession " + this.profession + " salary " + this.salary + " location "
                + this.location;
    }
}
