package controlstatements;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};

        Arrays.stream(arr).forEach(s->{
            System.out.println(s);
        });

    }
}
