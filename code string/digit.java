public class digit{
  public static void main (String [] args){

    String st ="f3f3n43k52";
    String ns ="";
    for (int i =0; i <st.length() ; i++){
      char c = st.charAt(i);
      if (c>='0' && c<='9'){
        ns+=c;
      }
    }
    System.out.println(ns);
  }
}