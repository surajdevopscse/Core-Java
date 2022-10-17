public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Suarj", 22);

        s1.info(s1.name);
        s1.info(s1.age);
        s1.info(s1.name, s1.age);
    }

}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info(String name) {
        System.out.println("Name is " + name);
    }

    public void info(int age) {
        System.out.println("Age " + age);
    }

    public void info(String name, int age) {
        System.out.println("Name and Age :" + name + age);
    }
}
