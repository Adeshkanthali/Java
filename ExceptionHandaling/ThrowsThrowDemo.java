package Github.ExceptionHandaling;

public class ThrowsThrowDemo {

    public static void main(String[] args) throws Exception {     //throws

        int i = 10;

        if(i>=18) {
            System.out.println("you can vote");
        }
        else{
            throw new Exception("you can not vote");               //throw
        }

    }

}
