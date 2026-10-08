// coding task 4
public class ques4{
  public static void main (String [] args){
  
    double a= 8;
    double b=3;
    double h= a/2;
    double c;
    c= Math.sqrt(h*h+b*b);
    double area= ((3*Math.sqrt(3)/2)*c*c);
    System.out.println("area = "+area);
    double circumference = 6*c;
    System.out.println("circumference = "+ circumference );

  }
}