// ans to the ques no 3
import java.util.Scanner;
public class hometask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Give me your sentece");
        String in = sc.nextLine();
        String ns="";
        int count=0;
        
        for(int i =0 ; i<in.length() ; i++){
          char c = in.charAt(i);
          int d = (int)c;
          if((d>=97 && d<=122) || (d>=65 && d<=90) ){
            if(count %2==0 && (d>=65 && d<=90)){
              d+=32;
              c = (char)d;
            }
            else if (count %2==1 && (d>=97 && d<=122)){
              d-=32;
              c = (char)d;
            }
            count++;
          }
          ns +=c;
        }
        System.out.println(ns);
        sc.close();
    }
}