package Java.PatternPrograms;

public class RighHalfPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i=0; i<n; i++){

            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}


/*
OUTPUT :-

 *
 * *
 * * *
 * * * *
 * * * * *
 */