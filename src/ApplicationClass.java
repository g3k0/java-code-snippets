class Person {

    // Instance variables (data or "state")
    String name;
    int age;

    // classes can contain

    // 1. data
    // 2 subroutines (methods)

}


public class ApplicationClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Christian Palazzo";
        person1.age = 36;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person1.name);
    }
}
