public class arr15 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        int max =a[0];
        int secmax=a[0];
        for (int i =1 ; i<a.length ; i++){
            if (max<a[i]){
                max = a[i];
            }
        }
        for (int i=1 ; i<a.length ; i++){
            if(a[i] > secmax &&  a[i]!= max){
                secmax = a[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
