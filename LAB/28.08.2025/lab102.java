public class lab102{
  public static void main (String [] args){
  
    double area = circleArea(5);
    System.out.println(area);
    double volume = sphereVolume(5.0);
    System.out.println(volume);
    findSpace(5,"sphere");
    
  }
  
  public static double circleArea(double a ){
    double circleArea = 3.14167*a*a;
    return circleArea;
  }
  
  public static double sphereVolume (double a){
    double sphereArea = (4*3.1416*a*a*a)/3;
    return sphereArea;
  }
  
  public static void findSpace(double a , String x){
    
    if(x.equals("circle")){
      double result = circleArea(a);
      System.out.println(result);
    }
    else if (x.equals("sphere")){
      double result = sphereVolume(a);
      System.out.println(result);
    }
    else {
      System.out.println("Wrong peramiter");
    }
  }
  
}