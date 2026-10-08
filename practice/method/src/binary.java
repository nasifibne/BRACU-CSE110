import java.util.Scanner;

public class binary {
    public static int toDec(int n ){
        int digit =0, temp=n;
        int i =n;
        while ( i>0 ){
            digit ++;
             i= i/10;
        }
        int sum=0;
        for (int j=0 ; j<digit ; j++){
            double  pow = Math.pow(2,j);
            double x = (temp%10)*pow;
            sum += (int) x;
            temp /=10;
        }
        return sum;

    }
    public static String toHex(int n ){
        int y =n;
        String ns ="";
        while (y !=0){
            int rem = y %16;
            y /=16;
            if(rem==10){
                ns = "A" +ns;
            }
            else if (rem==11){
                ns ="B"+ns;
            }
            else if (rem==12){
                ns ="C"+ns;
            }
            else if (rem==13){
                ns ="D"+ns;
            }
            else if (rem==14){
                ns ="E"+ns;
            }
            else if (rem==15){
                ns ="F"+ns;
            }
            else {
                ns = rem + ns;
            }
        }
        return ns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = toDec(sc.nextInt());
        System.out.println(decimal);
        String hex = toHex(decimal);
        System.out.println(hex);

    }
}
