// ans to the ques no 3
import java.util.Scanner;
public class task3{
  public static void main(String [] args){
  
    Scanner sc=new Scanner (System.in);
    double x1= sc.nextDouble();
    double x2= sc.nextDouble();
    double x3= sc.nextDouble();
    
    double maxVal;
    double minVal;
    
    if (x1>x2 && x1>x3){
    maxVal= x1;
    }
    else if (x2>x1 && x2>x3){
    maxVal= x2;
    }
    else {
    maxVal= x3;
    }
    if(x1<x2 && x1<x3) {
    minVal= x1;
    }
    else if (x2<x1 && x2<x3){
    minVal= x2;
    }
    else {
    minVal= x3;
    }
    System.out.println("Maximum number is "+ maxVal);
    System.out.println("Minimum number is "+minVal);
  }
}