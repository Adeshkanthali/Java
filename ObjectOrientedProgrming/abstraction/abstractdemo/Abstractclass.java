package Java.ObjectOrientedProgrming.abstraction.abstractdemo;

public abstract class Abstractclass {                 // abstract class

    public abstract void animalsound();               // abstract method

    public void sleep(){
        System.out.println("animal is sleeping");     // non-abstract method
    }

}

class Pig extends Abstractclass {                   // extend te Abstractclass in the subclass

    public void animalsound() {
        System.out.println("there is the pig");
    }

    public static void main(String[] args) {

        Pig obj = new Pig();
        obj.animalsound();
        obj.sleep();
    }

}


