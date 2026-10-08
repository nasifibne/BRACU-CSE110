// 3 6 1 2 8 5
//output 8 6 5 3 2 1
import java.util.Scanner;
public class lab105{
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    System.out.print("N= ");
    int len = sc.nextInt();
    int [] arr = new int [len];
    
    for(int i=0 ; i<len ; i++){
      arr[i] = sc.nextInt();
    }
    //original array
    for(int i =0; i<arr.length ; i++){
    System.out.printf(arr[i] +" ");
    }
    System.out.println();
    //sort array 
    for(int i =0; i<arr.length ; i++){
      for(int j = 0 ; j<len-1-i ; j++){
        if(arr[j]<arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1]= temp;   
        }
      }
    }
    //printing sorted array
    for(int i =0; i<arr.length ; i++){
    System.out.printf( arr[i] +" ");
    }
  
  
  }
}