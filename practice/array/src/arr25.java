public class arr25 {
    public static void main(String[] args) {
        int [] a = {2,5,8,4,9,3,88};
        int [] b = {2,55,22,44,3,9,88};
        int maxlength=a.length;
        if (maxlength<b.length){
            maxlength= b.length;
        }
        for (int i =0 ; i<maxlength ; i++){
            for (int j =0 ; j<a.length ; j++){
                if(b[i] == a[j] ){
                    System.out.println( b[i]);
                }
            }
        }
    }
}
