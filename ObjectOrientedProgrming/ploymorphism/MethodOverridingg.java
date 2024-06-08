package Java.ObjectOrientedProgrming.ploymorphism;

public class MethodOverridingg{                 // parent class

    public void sound(){                      // sound method
        System.out.println("in Animal sound");
    }

}

class Cat extends MethodOverridingg{            // child class

    public void sound(){
        System.out.println("in cat sound");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }

}

