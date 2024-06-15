package Github.MathematicalFunctions;

import java.util.Scanner;

public class maxdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a,b);

        System.out.println("our maximum no is" + " " + max);
    }

}
