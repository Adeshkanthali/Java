package Github.MathematicalFunctions;

import java.util.Scanner;

public class squarerootdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no ");
        int a = sc.nextInt();

        int root = (int) Math.sqrt(a);

        System.out.println("our no square root is " + root);
    }
    
}
