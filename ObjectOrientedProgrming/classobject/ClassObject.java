package Java.ObjectOrientedProgrming.classobject;

public class ClassObject {                     // Class Creation

    public int add(int a, int b){              // Method Declaration
        return a + b;
    }

    public static void main(String[] args) {

        ClassObject obj = new ClassObject();   // Object Creaction

        obj.add(5,4);                    // Method Call

    }

}
