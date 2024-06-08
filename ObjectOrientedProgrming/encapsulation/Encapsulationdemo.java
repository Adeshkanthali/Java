package Java.ObjectOrientedProgrming.encapsulation;

public class Encapsulationdemo {

    private int id;                  //global variable  or  instance variable
    private String name;


    public int getId(){              // return the value & getter have datatype.
        return id;
    }

    public void setId(int id) {       // set the value & setter have no datatype.
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Encapsulationdemo obj = new Encapsulationdemo();
        obj.setId(1);

        System.out.println(obj.getId());
    }

}

