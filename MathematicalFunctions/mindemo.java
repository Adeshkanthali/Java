package Github.MathematicalFunctions;

import java.util.Scanner;

public class mindemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a,b);

        System.out.println("our minimum no is " + min);
    }
    
}
