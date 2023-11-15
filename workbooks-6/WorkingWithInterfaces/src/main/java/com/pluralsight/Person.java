package com.pluralsight;

public class Person implements Comparable<Person>{
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        int last = this.lastName.compareTo(person.lastName);
        return last == 0? this.firstName.compareTo(person.firstName) : last;
    }

    @Override
    public String toString() {
        return "com.pluralsight.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}