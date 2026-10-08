public class longest {
  public static void main (String [] args){

   String st = "i am programmer nasif ";
    st = st+" ";
    String ns ="";
    String word ="";
    for (int i =0; i<st.length() ; i++){
      char c = st.charAt(i);
      if (c!=' '){
        ns+=c;
      }
      else {
        if (ns.length() > word.length() ){
          word = ns;
        }
        ns="";
      }
    }
  
    System.out.println("longest word is " +word);
  }
}