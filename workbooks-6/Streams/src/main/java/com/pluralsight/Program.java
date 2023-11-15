package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        people.add(new Person("Benjamin", "Pena", 13));
        people.add(new Person("Dollie", "Harding", 64));
        people.add(new Person("Walker", "Mcguire", 44));
        people.add(new Person("Joann", "Mckinney", 31));
        people.add(new Person("Maura", "Stephens", 22));
        people.add(new Person("Andrew", "York", 27));
        people.add(new Person("Myrna", "Holloway", 5));
        people.add(new Person("Hershel", "Klein", 56));
        people.add(new Person("Juliet", "Bray", 48));
        people.add(new Person("Andrew", "Dunn", 79));

        List<Person> matched = searchByName(people, scan);
        System.out.println(matched);
        System.out.println("Average age: " + getAverageAge(people));
        System.out.println("Oldest age: " + getOldestAge(people));
        System.out.println("Youngest age: " + getYoungestAge(people));
    }

    public static List<Person> searchByName(List<Person> people, Scanner scan){
        List<Person> searchResults = new ArrayList<>();

        System.out.print("Search by first or last name: ");
        String name = scan.nextLine();

        for(Person p: people){
            if(p.getFirstName().equalsIgnoreCase(name) || p.getLastName().equalsIgnoreCase(name)){
                searchResults.add(p);
            }
        }
    return searchResults;
    }

    public static int getAverageAge(List<Person> people){
        int avg = 0;
        for (Person p: people){
            avg += p.getAge();
        }
        return avg/people.size();
    }

    public static int getOldestAge(List<Person> people){
        int oldest = people.get(0).getAge();
        for(Person p: people){
            if(p.getAge() > oldest){
                oldest = p.getAge();
            }
        }
    return oldest;
    }

    public static int getYoungestAge(List<Person> people){
        int youngest = people.get(0).getAge();
        for(Person p: people){
            if(p.getAge() < youngest){
                youngest = p.getAge();
            }
        }
    return youngest;
    }
}
