package com.dlegacy.spp;


public class Company {

    public static void main(String args[]) {
        Car carIsAnd = new Car("IS_10_AND");
        carIsAnd.setColor("Green");
        carIsAnd.setCapacity(400);

        Employee pie = new Employee("Pie", Professions.LOADER, 1200, "Iasi");
        pie.setAvailability(true);

        Employee oreo = new Employee();
        oreo.setName("Oreo");
        oreo.setProfession(Professions.DRIVER);
        oreo.setAvailability(true);
        oreo.setSalary(1500);
        oreo.setLocation("Iasi");
        oreo.setCar(carIsAnd);

        Employee nougat = new Employee();
        nougat.setName("Nougat");
        nougat.setProfession(Professions.DRIVER);
        nougat.setAvailability(false);
        nougat.setSalary(1500);
        nougat.setLocation("Iasi");
        nougat.setCar(new Car("B-999-IOS", 1111));

        Person marshmallow = new Person("Marshmallow");

        Employee director = new Manager();
        director.setName("CTO");
        director.setProfession(Professions.UNKNOWN);
        System.out.println("Employee: " + oreo);

        Branch branchIasi = new Branch();
        branchIasi.setName("IsBranch");
        branchIasi.addEmployee(pie);
        branchIasi.addEmployee(oreo);
        branchIasi.addEmployee(nougat);
        branchIasi.addEmployee(marshmallow);
        branchIasi.addEmployee(director);
        branchIasi.addCar(carIsAnd);
        branchIasi.addCar(oreo.getCar());

        System.out.println("Employees: \n" + branchIasi.getEmployees()); // employees should be sorted alphabetically before returning them

        Order transport = new Order();
        transport.setQuantity(1400);
        transport.setDestination("Bucharest");

        System.out.println("\nBranch: " + branchIasi);

        /**
         * This function should return true if:
         *          - the Branch has enough cars to transport the quantity,
         *          - there are enough man available to use the cars
         *          - exist at least 1 loader to load the cars.
         */
        if (branchIasi.checkIfOrderIsValid(transport)) {
            branchIasi.addOrder(transport);
        }

        System.out.println("Branch: " + branchIasi);

    }
}
