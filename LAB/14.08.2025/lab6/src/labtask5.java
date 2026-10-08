import java.util.Scanner;

public class labtask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String fir =sc.nextLine();
        String in = " " + fir;
        String ns ="";
        for (int i = in.length()-1 ; i>=0 ; i--){
            char c = in.charAt(i);
            if (c != ' '){
                ns = c + ns;
            }
            else {
                System.out.print(ns + " ");
                ns ="";
            }
        }
    }
}
