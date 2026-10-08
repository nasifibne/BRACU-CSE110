public class arr51 {
    public static void main(String[] args) {
        int [] a ={2, 3, -1, 8, 4};
        int sum=0;
        for (int i=0 ; i<a.length ;i++ ){
            sum +=a[i];
        }
        int leftsum =0;
        for (int i =0 ; i<a.length ; i++){
            sum -=a[i];
            if(leftsum== sum){
                System.out.println( i);
            }
            leftsum+=a[i];
        }
    }
}
