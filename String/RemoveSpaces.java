package Github.String;

public class RemoveSpaces {
    public static void main(String[] args) {

        String st = "I am Adesh";

        String str = st.replaceAll("[ ]", "");

        System.out.println(str);
        
    }
}
