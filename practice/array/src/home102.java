package array.src;

import java.util.Scanner;

public class home102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N= ");
        int len = sc.nextInt();
        int [] arr = new int[len];
        for (int i =0 ; i < arr.length ; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targeted number ");
        int find = sc.nextInt();
        boolean flag =true;
        for (int i =0 ; i< arr.length ; i++){
            if( find== arr[i]){
                System.out.println( find + "  is at index  "+ i);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Element not found");
        }
    }
}
