import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        for(int i=0; i<s1.length(); i++){
            char a=s1.charAt(i);
            int first =-1;
            int last =-1;
            int count =0;
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(j)==a){
                    count++;
                    if(first ==-1){
                        first =j;
                    }
                    last =j;
                }
            }
            if(count ==1 || (i> first && i< last)){
                s2+=a;
            }
        }
        if(s2.length()==0){
            System.out.println("No characters left!");
        }
        else{
            System.out.println(s2);
        }
    }
}