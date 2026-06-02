package june1;

public class SuperMethod {
    int a = 10;
}

class Child extends SuperMethod {

    void display() {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}