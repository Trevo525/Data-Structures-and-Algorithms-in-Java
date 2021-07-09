public class App {
    public static void main(String[] args) throws Exception {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        // Employee zachGalifianakis = new Employee("Zach", "Galifianakis", 69);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put(janeJones.getLastName(), janeJones);
        ht.put(johnDoe.getLastName(), johnDoe);
        ht.put(marySmith.getLastName(), marySmith);
        ht.put(mikeWilson.getLastName(), mikeWilson);
        ht.put(billEnd.getLastName(), billEnd);
        // ht.put(zachGalifianakis.getLastName(), zachGalifianakis);

        ht.printHashTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");

        ht.printHashTable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
