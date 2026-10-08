import java.util.Scanner;

public class labtask1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String fin="";
        for (int i =0 ; i<inp.length() ; i++){

            char x = inp.charAt(i);
            int d = (int) x;
            if (d >= 97 && d<= 122 ){
                d = d-32;

            }
            char y = (char) d;
            fin += y;

        }
        System.out.println(fin);

    }
}
