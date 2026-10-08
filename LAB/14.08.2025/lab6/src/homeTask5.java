//ans to the ques no 5
import java.util.Scanner;
public class homeTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Give the person's name");
        String name = sc.nextLine();
        System.out.println("Give me your email's password");
        String pass = sc.nextLine();
        boolean flag = true;
        
        int nam = name.length();
        int pas = pass.length();
        
        for (int i =0 ; i<=pas-nam ; i++){
            if (pass.charAt(i) == name.charAt(0)){
                int index=i;
                
                boolean word = true;
                
                for (int j =0 ; j<name.length() ; j++){
                 
                    if (name.charAt(j) != pass.charAt(index)){
                        word = false;
                        break;
                    }
                    index +=1;
                }
                if(word){
                  flag = false;
                }
            }
        }
        if (flag){
            System.out.println("valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
