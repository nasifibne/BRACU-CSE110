import java.util.Arrays;

public class arr19main {
    public static void main(String[] args) {
    int[] arr = {23, 0, 25, 23, 56, 56, 0, 20};
    int temp[] = new int[arr.length];
    int unique =0;
    for (int i=0 ; i<arr.length ; i++ ){
        boolean flag =false ;
        for (int j =0 ; j<unique ; j++){
            if (arr[i] == temp[j]){
                flag = true;
                break;
            }
        }
        if(!flag){
            temp[unique++] = arr[i];
        }
    }
//        System.out.println(Arrays.toString(temp));
//        System.out.println(unique);
    int finalarr [] = new int[unique];
    for (int i =0 ; i <unique ; i++){
        finalarr [i] = temp[i];
    }
    System.out.println(Arrays.toString(finalarr));
    for (int i=0 ; i<finalarr.length ; i++){
        int count =0;
        for (int j =0 ; j<arr.length ; j++){
            if (finalarr[i] == arr [j]){
                count ++;
            }
        }
        System.out.println(finalarr[i] + " is " + count +" times ");
    }







    }
}
