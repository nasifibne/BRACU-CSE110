public class anagrams{
  public static void main (String [] args){

    String st1 ="listen";
    String st2 = "silont";
    int count=0;
    
    if(st1.length() == st2.length()){
    for (int i =0 ; i<st1.length() ; i++){
      boolean flag = false;
      for (int j =0 ; j<st2.length() ; j++){
        if (st1.charAt(i)== st2.charAt(j)){
          flag = true;
          break;
        }
        
      }
      if(flag){
      count++;
      }
    }
      if(count == st1.length()){
        System.out.println("anagrams");
      }
      else {
      System.out.println("not");
      }
    }
    else {
      System.out.println("not");
    }
  
  
  
  }
}