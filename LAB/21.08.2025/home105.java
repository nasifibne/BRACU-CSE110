//ans to the ques no 5
import java.util.Scanner;
public class home105{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int [] num = {85, 90, 75, 44, 99};
    String [] name = {"Bob", "Alice", "Max", "Marry", "Rosy"};

    //sort array 
    for(int i =0; i<num.length ; i++){
      for(int j = 0 ; j<num.length-1-i ; j++){
        if(num[j]>num[j+1]){
          int temp = num[j];
          num[j] = num[j+1];
          num[j+1]= temp;
          
          String t= name[j];
          name[j]= name[j+1];
          name[j+1]= t;
          
        }
      }
    }
    //printing sorted array
    for(int i =0; i<num.length ; i++){
    System.out.printf( name[i] +" " +num[i]+"\n");
    }
  sc.close();
  }
}