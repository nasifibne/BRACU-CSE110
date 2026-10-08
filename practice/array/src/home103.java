package array.src;

import java.util.Scanner;

public class home103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        double [] arr = new double[len];
        double sum=0;
        for (int i =0 ; i<arr.length ; i++){
            arr[i]= sc.nextDouble();
            sum +=arr[i];
        }
        //avg
        double avg = sum/len;
        double max = arr[0];
        double min = arr[0];
        //max
        int maxind= 0;
        for (int i =1 ; i<arr.length ; i++){
            if (max<arr[i]){
                max = arr[i];
                maxind=i;
            }
        }
        //min
        int minind = 0;
        for (int i =1 ; i<arr.length ; i++){
            if (min>arr[i]){
                min = arr[i];
                minind=i;
            }
        }
        System.out.println( "Maximum element " + max + " found at index " + maxind);
        System.out.println( "Minimum element " + min + " found at index " + minind);
        System.out.printf( "Summation: %.2f\n" ,sum);
        System.out.printf( "Average: %.2f\n" , avg);
    }
}
