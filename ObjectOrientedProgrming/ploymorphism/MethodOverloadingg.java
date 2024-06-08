package Java.ObjectOrientedProgrming.ploymorphism;

public class MethodOverloadingg {

    public void display(int i){
        System.out.println("Adesh");
    }

    public void display(int i,int j){
        System.out.println("kanthali adesh");
    }


    public static void main(String[] args) {

        MethodOverloadingg obj = new MethodOverloadingg();
        obj.display(5);
        obj.display(4,5);
    }

}

