//ans to the ques no 1
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int len = sc.nextInt();
         int [] arrInt = new int [len];
         for (int i =0; i<arrInt.length ; i++){
                int num = sc.nextInt();
                arrInt[i] = num;

         }
         for (int i =0; i<arrInt.length ;i++){
             System.out.println( i + " : " + arrInt[i]);
         }
         // new array
         int [] arr1 = new int [len+1];
            for (int i=0 ; i<arrInt.length ; i++){
                arr1[i] = arrInt[i];
            }
            arr1[len]= sc.nextInt();
            for (int i =0; i<arr1.length ; i++){
                System.out.println( i + " : " + arr1[i]);
            }

    }
}
