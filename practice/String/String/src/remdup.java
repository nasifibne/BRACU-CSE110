public class remdup{
  public static void main (String [] args){
  
    String st = "naasiif";
    String ns="";
    for (int i =0 ; i<st.length() ; i++){
      char c = st.charAt(i);
      for (int j =0; j<st.length() ;j++){
        if(c == st.charAt(j)){
          break;
        }
        else {
          ns +=c;
        }
      }
    }
    System.out.println(ns);
  }}