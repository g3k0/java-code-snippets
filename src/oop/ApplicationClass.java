package oop;

class Person {

    // Instance variables (data or "state")
    String name;
    int age;

    // classes can contain

    // 1. data
    // 2 subroutines (methods)
    void speak() {
        System.out.println("My name is " + name + " and I am " + age);
    }

    void sayHello() {
        System.out.println("Hello there!");
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;

    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}


public class ApplicationClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Christian Palazzo";
        person1.age = 36;
        person1.speak();
        person1.sayHello();

        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirement " + years);
        System.out.println(person1.name);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}
