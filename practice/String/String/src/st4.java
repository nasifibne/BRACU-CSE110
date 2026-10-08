public class st4{
  public static void main (String [] args){

    String st1 ="i love";
    String add = "java";
    st1 +=" ";
    for (int i =0 ; i<add.length() ; i++){
      st1 +=add.charAt(i);
    }
    System.out.println(st1);
  
  }
}