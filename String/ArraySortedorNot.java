package Github.Array;

import java.util.Scanner;

public class ArraySortedorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of arrays");
        int t = sc.nextInt();

        int arr[] = new int[t];

        System.out.println("enter elements of arrays");
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0;i < arr.length; i++){
            for (int j =i + 1;j<arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
