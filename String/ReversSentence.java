package Github.String;

public class ReversSentence {

    public static String ReversSentence(String st){

        String str[] = st.split(" ");

        String ab = "";

        for (int i=str.length-1; i>=0;i--){
            if (i == 0){
                ab = ab + str[i];
            }
            else {
                ab = ab + str[i] + " ";
            }
        }
        return ab;
    }

    public static void main(String[] args) {

        String st = "I am Adesh";

        String result = ReversSentence(st);

        System.out.println(result);
    }
}
