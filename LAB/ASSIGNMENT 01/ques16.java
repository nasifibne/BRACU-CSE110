// ans to the ques no 16
public class ques16{
  public static void main (String [] args){
  
    int a= 586214792;
    int year;
    year = a/525600;
    System.out.println("approximately it is " +year +" years" );
    int b;
    b= a%525600;
    int day;
    day= b/1440;
    System.out.println("approximately it is " +day +" days" );
    System.out.println (a + " minutes is approximately " +year + " year and " + day + " days" );
  
  
  }
}