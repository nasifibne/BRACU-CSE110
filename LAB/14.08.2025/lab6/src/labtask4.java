import java.util.Scanner;

public class labtask4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fir = sc.nextLine();
        String sec= sc.nextLine();
        String in = fir + sec;
        char sym = sec.charAt(0);
        String ns = "";
        for (int i =0 ; i<in.length() ; i++){
            char d =in.charAt(i);
            if ( d != sym){
                ns += d;
            }
            else {
                System.out.println(ns);
                ns ="";
            }
        }
    }
}
