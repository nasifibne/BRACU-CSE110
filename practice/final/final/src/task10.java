public class task10 {
    public static void main(String[] args) {
//        double t = convertToCm(16);
//        System.out.println(t + " cm");
        double [] cheetos_inches = new double[]{10.0, 12.0, 14.0, 16.0, 18.0};

        double averageLength = findAvgCm(cheetos_inches);

        System.out.printf("The average Cheeto length is %.2f cm",averageLength);


    }
    public static double findAvgCm(double[] arr){
        double sum=0;
        for(int i =0 ; i<arr.length ; i++){
            double x= convertToCm(arr[i]);
            sum+=x;
        }
        return sum/arr.length;
    }
    public static double convertToCm(double n){
        return n*2.54;
    }
}
