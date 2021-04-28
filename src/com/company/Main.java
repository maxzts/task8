package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        Person  person1 = new Person("Maxim", "Zayats", new Address("Minsk", "Miroshnichenko street", 3));
        Person  person2 = new Person("Helen", "Zayats", new Address("Soligorsk", "Miners street", 3));
        Person  person3 = new Person("Sergey", "Zayats", new Address("Soligorsk", "Miners street", 3));
        Person  person4 = new Person(null, "Zayats", new Address("Minsk", "Miroshnichenko street", 3));
        Person  person5 = new Person("Helen", null , new Address("Soligorsk", "Miners street", 3));
        Person  person6 = new Person("Sergey", "Zayats", null);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        persons.stream()
                .filter(a -> a.getFirstName() != null)
                .filter(b -> b.getLastName() != null)
                .filter(c -> c.getAddress() != null)
                .sorted(Comparator.comparing(person -> person.getAddress().getId()))
                .map(Person::toString)
                .collect(Collectors.toList())
                .forEach(System.out::println);









    }

}