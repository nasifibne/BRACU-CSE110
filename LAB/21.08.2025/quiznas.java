//x9y865z32  output 600
import java.util.Scanner;
public class quiznas{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine();
    st +="a";
    String ns="";
    double sum=0;
    for(int i =0 ; i<st.length() ; i++){
      char c = st.charAt(i);
      if(c>='0' && c<='9'){
        ns +=c;
      }
      else{
        for(int j =ns.length()-1 ; j>=0 ; j--){
          double pow = Math.pow(10,j);
          char e = ns.charAt(j);
          int d = e-'0';
          double dig = d*pow;
          sum +=dig;
        }
        ns="";
      }
    }
    System.out.println(sum);
  }
}