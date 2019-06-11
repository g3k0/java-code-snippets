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

}


public class ApplicationClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Christian Palazzo";
        person1.age = 36;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person2.sayHello();

        System.out.println(person1.name);
    }
}
