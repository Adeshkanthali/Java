package Java.ObjectOrientedProgrming.inheritance;

public class Teacher{

    int id;
    String name;
    String address;
}

class MathsTeacher extends Teacher {

    public static void main(String args[]){

        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Ramesh";
        obj.address = "Pune";

        System.out.println("id = "+obj.id + " name = " + obj.name + " address = " +obj.address);
    }

}

