package Github.ExceptionHandaling;

public class Demo {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred..");
        }

        finally {
            System.out.println("This is the finally block.");
        }

    }
}
