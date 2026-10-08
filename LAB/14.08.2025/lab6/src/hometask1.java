//ans to the ques no 1
import java.util.Scanner;
public class hometask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Give me your phrase.");
        String in = sc.nextLine();
        String temp = "";
        
        for(int i =0 ; i<in.length() ; i++){
          char c = in.charAt(i);
          if(c>='A' && c<='Z'){
            c +=32;
          }
          temp +=c;
        }
        
        int cons=0, vow =0;
        boolean flag = false;
        
        for (int i =0; i<temp.length() ; i++){
            char c = temp.charAt(i);
            
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
                vow++;
            }
            else if ((c>='a' && c<='z') || (c>='A' && c<='Z')){
                cons ++;
            }
        }
        
        if(vow>0 && cons>0) {
            if (vow % 3 == 0 && cons % 5 == 0) {
                flag = true;
            }
        }
        
        if (flag){
            System.out.println("Aaarr! Me Plunder!!");
        }
        
        else {
            System.out.println("Blimey! No Plunder!!");
        }
        
        sc.close();
    } 
}
