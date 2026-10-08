import java.util.Scanner;
public class q1117{
  public static void main(String [] args){
  
    Scanner sc=new Scanner (System.in);
    int x= 0;
    double sum=0.0;
    for (int l=1 ; l>0; l++){
    double grad= sc.nextDouble();
    if (grad <0 || grad >10){
    System.out.println("nota invalida");
    }
    else{
    
    sum = sum + grad;
    x++;
    if(x==2){
    double avg= sum/2;
    System.out.printf("media = %.2f\n",avg);
    break;
    }
    }
    
    
    
    }
  
  
  
  
  
  }}