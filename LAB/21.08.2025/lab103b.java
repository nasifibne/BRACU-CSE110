import java.util.Scanner ;
public class lab103b{
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    int [] arr = {9,-5,1,9,-5,0,7};
      
    for (int i =0 ; i<arr.length ; i++){
    System.out.print (arr [i] + ",");
    }  
    System.out.println();
    
    for (int i =0 ; i<arr.length ; i++){
      for (int j =i+1 ; j<arr.length ; j++){
        if ( arr[i] == arr[j]){
          arr[j] =0;
        }
      }
    }
    
   for (int i =0 ; i<arr.length ; i++){
    System.out.print (arr [i] + ",");
   }
  
  }
}