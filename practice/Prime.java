import java.util.*;
public class Prime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid number");
        }
        else{
        int i=0;
        int j=2;
        while(i<n){
            boolean found=true;
            for(int k=2; k<j; k++){
                if(j%k==0){
                    found=false;
                    break;
                }
            }
            if(found){
                System.out.println(j);
                i++;
            }
            j++;
        }
        }
    }
}