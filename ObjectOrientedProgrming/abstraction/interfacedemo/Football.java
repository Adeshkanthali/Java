package Java.ObjectOrientedProgrming.abstraction.interfacedemo;

public class Football implements Sport{                    // class implements interface

    public void show(){                                    //Concrete method - always body
        System.out.println("in show");
    }

    public static void main(String[] args) {

        Football obj = new Football();
        obj.show();
    }

}

