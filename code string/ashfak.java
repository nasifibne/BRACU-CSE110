public class ashfak{
  public static void main (String [] args){
 /*Apple 
  Ape 
  Apu*/ 
    String st1 = "Aiple";
    String st2 = "Aype";
    String st3 = "Aupu";
    String ns ="";
    int count=0;
    
    
    
    
    for (int i =0 ; i<st2.length() ; i++){
      
      char s1 = st1.charAt(i);
      char s2 = st2.charAt(i);
      char s3 = st3.charAt(i);
      if (s1==s2 && s2==s3){
        ns +=s1;
        count++;
       }
      else {
        if(count==0){
          System.out.println("no pre");
          break;
        }
        else {
          System.out.println(ns);
          break;
        } 
      } 
    }
  }
}