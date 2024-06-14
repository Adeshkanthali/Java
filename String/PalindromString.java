package Github.String;

public class PalindromString {

    public static void main(String[] args) {

        String a = "madam";
        String b = "";

        int c = a.length();

        //....................................................................................//

        for (int i=c-1; i>=0; i--){
            b = b + a.charAt(i);
        }

        if(a.equals(b)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Non-paindrome");
        }

        //....................................................................................//

    }

}
