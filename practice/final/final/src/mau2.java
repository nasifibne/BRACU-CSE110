import java.util.Scanner;

public class mau2 {
    public static boolean pass(String s ){
        boolean flag = true;
        for (int i =0 ; i<s.length() ;i++){
            char c = s.charAt(i);
            if(c<='A' || c>='Z' ){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(pass(s)){
            System.out.println("valid pass");
        }
        else{
            System.out.println("invalid");
        }
    }
}
