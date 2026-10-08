import java.util.Scanner;
public class lab103{
  public static void main (String [] args){
  Scanner sc = new Scanner (System.in);
  //int len = sc.nextInt();
  int [] arr = {9,-5,7,9,-5,5,7};
//  for (int i =0 ; i<7 ; i++){
//    arr [i] = sc.nextInt();
//  }

  for (int i =0 ; i<arr.length ; i++){
    System.out.print (arr [i] + " ");
  }
  
  System.out.println();
  
  int [] arrN = new int [6];
  
  for (int i=0; i<arr.length ; i++){
    for (int j=0 ; j<arrN.length ;j++){
      if (arr[i] == arrN[j+i]){
        arr[i]=0;
      }
      arrN[i] = arr[i];
    }
  }
  
  for (int i =0; i<arrN.length ; i++){
    System.out.print (arrN [i] + " ");
  }
  
  }
}