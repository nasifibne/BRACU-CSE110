import java.util.Scanner;

public class finalSpring {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String s = "+7x+3x+2y-1y+4x";
        char [] c = new char[s.length()];
        for (int i =0 ; i<s.length() ; i++){
            c[i] = s.charAt(i);
        }
        String x="", y="", ns="";
        int sumX = 0;
        for(int i=2; i<c.length ;i++) {
            if (c[i] == 'x') {
                int co = c[i - 1] - '0';
                char sym = c[i - 2];
                if (sym == '+') {
                    sumX += co;
                }
                if (sym == '-') {
                    sumX -= co;
                }
            }
        }
        x += (sumX+"x");
        int sumY=0;
        for(int i=2; i<c.length ;i++) {
            if (c[i] == 'y') {
                int co = c[i - 1] - '0';
                char sym = c[i - 2];
                if (sym == '+') {
                    sumY += co;
                }
                if (sym == '-') {
                    sumY -= co;
                }
            }
        }
        if(sumY>=0){
            x +=" + ";
        }
        y += (sumY+"y");
        ns= x+y;
        System.out.println(ns);
    }
}
