//ans to the ques no 4
import java.util.Scanner;
public class home104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int len1 = sc.nextInt();
        int firArr [] = new int[len1];
        System.out.println("Please enter the elements of the arr1" );
        for (int i =0 ; i<firArr.length ; i++){
            firArr[i]= sc.nextInt();
        }
        //2nd array
        System.out.print( "Please enter the length of array 2: ");
        int len2= sc.nextInt();
        int [] secArr = new int [len2];
        System.out.println("Please enter the elements of the arr2: ");
        for (int i =0 ; i<secArr.length ; i++){
            secArr[i] = sc.nextInt();
        }
        
        int find =0;
        for (int i =0 ; i< secArr.length ; i++){
            for (int j =0 ; j< firArr.length ; j++){
                if (secArr[i] == firArr[j]){
                    find++;
                    break;
                }
            }
        }
        if(find == secArr.length){
            System.out.println("Array 2 is a subset of Array 1 ");
        }
        else {
            System.out.println("Array 2 is not a subset of Array 1 ");
        }
        sc.close();
    }
}
