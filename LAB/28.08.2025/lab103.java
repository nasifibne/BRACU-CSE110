public class lab103{
  public static void main (String [] args){
  
    boolean res = isTri(7,5,10);
    System.out.println( res );
    triArea(3,2,1);
    triArea(7,5,10);

  }
  public static boolean isTri (int a , int b , int c){
    boolean flag = false;
    if(a+b>c && b+c>a && c+a>b){
      flag =true;
    }
    return flag;
  }
  public static void triArea(int a , int b ,int c ){
    boolean flag = isTri(a,b,c);
    if(flag){
      int s = (a+b+c)/2;
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.printf("%.2f\n" ,area);
    }
    else{
      System.out.println("can't form triangle");
    }
  }
}