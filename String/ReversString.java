package Github.String;

public class ReversString {

    public static void main(String[] args) {

        //........................................Method1.........................................//

        StringBuffer obj = new StringBuffer("adesh");
        System.out.println(obj.reverse());


        //.........................................Method2.......................................//

        StringBuilder obj1 = new StringBuilder("adesh");
        System.out.println(obj1.reverse());


        //.........................................Method3......................................//

        String a = "adesh ashok kanthali";
        String b = "";

        int length = a.length();

        for(int i=length-1; i>=0; i--){
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }

}
