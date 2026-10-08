import java.util.Scanner;

public class SC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        String ns="";
        for (int i =st.length()-1; i>=0 ; i--){
            char c =st.charAt(i);
            ns +=c;
        }
        if (ns.equals(st)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        System.out.println(ns);
    }
}
