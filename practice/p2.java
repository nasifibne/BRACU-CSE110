import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        for(int i=0; i<s1.length(); i++){
            char a=s1.charAt(i);
            String s3="";
            boolean found=false;
            for(int j=i; j<s1.length(); j++){
                if(a==s1.charAt(j)){
                    s3+=a;
                }
            }
            for(int k=i-1; k>=0; k--){
                if(a==s1.charAt(k)){
                    found=true;
                    break;
                }
            }
            if(found){
                s3="";
            }
            if(s3.length()==1){
                s2+=s3;
            }
            else{
                for(int l=1; l<s3.length()-1; l++){
                    s2+=s3.charAt(l);
                }
            }
        }
        if(s2.length()==0){
            System.out.println("No Characters Left!");
        }
        else{
            System.out.println(s2);
        }
    }
}