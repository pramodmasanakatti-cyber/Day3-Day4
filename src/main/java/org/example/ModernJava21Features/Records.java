package org.example.ModernJava21Features;

record Person(String name,String email){}
public class Records {
    public static void main(String[] args) {
        Person person=new Person("Pramod","pramod@gmail.com");
        System.out.println("Name: " + person.name());
        System.out.println("Emial: " + person.email());
        System.out.println(person);
    }
}
