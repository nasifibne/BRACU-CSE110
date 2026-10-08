import java.util.Scanner ;
public class lab102{
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    int len = sc.nextInt();
    int [] arrInt = new int [len];
    for (int i=0 ; i<len ; i++){
      int d = sc.nextInt();
      arrInt[i] = d;
    }
    /*
    //reverse array
    int [] arrRev = new int [len];
    for (int i =0 ; i<arrInt.length ; i++){
      arrRev [i] = arrInt[len-1-i];
    }
    for (int i =0 ; i<arrRev.length ; i++){
      System.out.println(arrRev[i]);
    }
    */
    for (int i =0 ; i<arrInt.length ; i++){
      System.out.print(arrInt[i] + " ");
    }
    System.out.println();
    // reverse without new array
    
    for(int i =0 ; i<arrInt.length/2 ;i++){
      int temp = arrInt[i];
      arrInt[i] = arrInt[len-1-i];
      arrInt[len-1-i] = temp;
      
    }
    for (int i =0 ; i<arrInt.length ; i++){
      System.out.print(arrInt[i] + " ");
    }
    
  }
}