public class eachWord{
  public static void main (String [] args){

    String st = "nasif ibne mohiuddin";
    st = " "+ st;
    String ns ="";
    
    for (int i =0 ; i<st.length() ; i++){
      char c = st.charAt(i);
      if(i>=1){
        if (st.charAt(i-1)==' '){
        c-=32;
        
      }
      ns+=c;
      }
    }
    System.out.println(ns);
  }
}