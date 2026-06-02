package june1;

public class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Arun", 22);
        s1.display();
    }
}