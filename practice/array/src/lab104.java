package array.src;

import java.util.Scanner;

public class lab104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int [] newArr = new int [arr.length];
        for (int i =0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        newArr[0] = arr[0];
        int size =1;
        for (int i =1 ; i< arr.length ; i++){
            boolean uniq = true;
            for (int j =0 ; j< newArr.length ; j++){
                if (arr[i] == newArr[j]){
                    uniq = false;
                    break;
                }
            }
            if(uniq){
                newArr[size++]= arr[i];
            }
        }
        for (int i =0 ; i<size ; i++){
            System.out.print(newArr[i] + " ");
        }




    }
}
