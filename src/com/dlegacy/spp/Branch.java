package com.dlegacy.spp;

import java.util.*;

public class Branch {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<Car> cars;
    private ArrayList<Person> persons;
    private ArrayList<Manager> managers;
    private ArrayList<Order> orders;

    public Branch() {
        this.name = null;
        this.employees = new ArrayList<>();
        this.cars = new ArrayList<>();
        this.persons = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void addEmployee(Person... people){
        for(Person pl : people){
            this.persons.add(pl);
        }
    }

    public void addCar(Car... cars){
        for(Car c : cars){
            this.cars.add(c);
        }
    }

    public void addEmployee(Manager... managers){
        for(Manager m : managers){
            this.managers.add(m);
        }
    }

    public String getEmployees() {
        Collections.sort(this.employees, (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return this.employees.toString().replace(", ", " \n");
    }
    
    public boolean checkIfOrderIsValid(Order order){
        boolean flag = true;
        if(this.cars == null)
            flag = false;
        for(Employee e : this.employees){
            if(e.isAvailability() && e.isLoader(e.getProfession())){
                flag = true;
            }
        }
        return flag;
    }

    public void addOrder(Order... orders){
        for(Order o : orders){
            this.orders.add(o);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);

        sb.append("\nAvailable cars\n");
        for(Car c : this.cars){
            sb.append(c);
        }

        if(this.orders != null) {
            for (Order o : this.orders) {
                sb.append(o);
            }
        }
        return sb.toString();
    }
}
