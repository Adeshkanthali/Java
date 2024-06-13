package Github.Array;

public class SortArrayDesendingOrder {

    public static void main(String[] args) {

        int[] arr = {10, 38, 2, 13, 22};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }

        System.out.println("Descending Array is :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
