import java.util.*;
public class Ronaldo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4-digit number:");
        int n=sc.nextInt();
        int life=3;
        int found=0;
        for(int i=0; i<4; i++){
            int x=n%10;
            n/=10;
            boolean prime=true;
            for(int j=2; j<x; j++){
                if(x%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                found+=1;
                System.out.println(x+" is prime! ("+found+"/3 found)");
            }
            else{
                life-=1;
                System.out.println(x+" is not prime. Lives left: "+life);
            }

            if(found==3){
                System.out.println("Congratulations! You won the game!");
                break;
            }
            else if(life==0 || i==3){
                System.out.println("Game over! You lost.");
                break;
            }
        }
    }
}