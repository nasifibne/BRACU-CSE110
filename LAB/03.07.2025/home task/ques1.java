// coding task 1
public class ques1{
  public static void main (String [] args){
    
    int min= 3456789;
    int year = min/(365*24*60);
    int rim = min%(365*24*60);
    int day= rim/(24*60);
    System.out.println( min +" minutes is approximately " +year + " years and "+ day + " days");

  }
}