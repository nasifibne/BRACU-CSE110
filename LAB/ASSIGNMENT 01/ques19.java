// ans to the ques no 19
public class ques19{
  public static void main (String [] args){
    
    int a= 8;
    int b= 3;
    int x= a/2;
    int y;
    y=x*x+b*b;
    double c;
    c= Math.sqrt(y);
   System.out.println("one side of the hexagon " +c);
   double circumference;
   circumference= 6*c;
   System.out.println("the circumference of the hexagon " + circumference);
   double area;
   area= ((3* Math.sqrt(3))/2)*c*c;
   System.out.println("the area of the hexagon " + area);
  
  
  
  
  
  }


}