public class Oops {
    public static void main(String[] args) {

        Student s1 = new Student("Suraj", "22", "B.tech", "Lucknow");

        s1.studentDetails();

        Student s2 = new Student("Varsha", "22", "B.tech", "Gorakhpur");

        s2.studentDetails();

    }
}

class Student {
    String name;
    String age;
    String className;
    String address;

    Student(String name, String age, String className, String address) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.address = address;
    }

    public void studentDetails() {
        System.out.println("Name " + name);
        System.out.println("Class " + className);
        System.out.println("Age " + age);
        System.out.println("Address " + address);
    }
}
