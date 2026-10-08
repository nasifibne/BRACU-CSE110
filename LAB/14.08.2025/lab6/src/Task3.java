import java.util.Scanner;
public class Task3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0;;
        System.out.println("Please enter a String:");
        String s1="hello world";
        String 
        for(int n1=0;n1<s1.length();n1++){
            char c1=s1.charAt(n1);
            if((c1>='a' && c1<='z') || (c1>='A' && c1<='Z')){
                if(count%2==0 && (c1>='A' && c1<='Z') ){
                  c1 +=32;
                    System.out.print(c1);
                }
                else if(count%2==1 && (c1>='a' && c1<='z')){
                  c1 -= 32;
                    System.out.print(c1);
                }
                count++;   
            }
            else{
              c1
                System.out.print(c1);
            }
        }
    }
}