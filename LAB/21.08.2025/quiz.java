import java.util.*;
public class quiz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        int sum=0;
        for(int i=0; i<s1.length(); i++){
            char a=s1.charAt(i);
            if(a>='0' && a<='9'){
                s2=a+s2;
            }
            else{
                if(s2.length()>0){
                int k=s2.length()-1;
                for(int j=0; j<s2.length(); j++){
                    char b=s2.charAt(j);
                    int c=b-'0';
                    sum+=c*Math.pow(10,k--);
                }
                s2="";
            }
            }
        }
        if(s2.length()>0){
            int k=s2.length()-1;
            for(int j=0; j<s2.length(); j++){
                char b=s2.charAt(j);
                int c=b-'0';
                sum+=c*Math.pow(10,k--);
            }
            s2="";
        }
        System.out.println(sum);
    }

}