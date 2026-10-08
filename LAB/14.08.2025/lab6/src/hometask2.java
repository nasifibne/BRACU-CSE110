//ans to the ques no 2
import java.util.Scanner;
public class hometask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your first string in lowercase");
        String in1 = sc.nextLine();
        System.out.println("Give me your second string in lowercase");
        String in2 = sc.nextLine();
        String ns ="";
        boolean flag=true;
        
        for (int i =0 ; i<in1.length() ; i++){
            for (int j =0; j<in2.length() ; j++) {
                if (in1.charAt(i)== in2.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                ns = ns+ in1.charAt(i);
            }
            flag = true;
        }

        for (int i =0 ; i<in2.length() ; i++){
            for (int j =0; j<in1.length() ; j++) {
                if (in2.charAt(i)== in1.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                ns = ns+ in2.charAt(i);
            }
            flag = true;
        }

        String upper="";
        for (int i =0 ; i<ns.length() ; i++){
            char c = ns.charAt(i);
           
            if (c >= 'a' && c<='z'){
                c-=32;
            }
            upper +=c;
        }
        System.out.println(upper);
        sc.close();
    }
}
