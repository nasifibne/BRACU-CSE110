public class sifat{
  public static void main(String [] args){
      String st = "Hello world"; //hWLLO wORLD
      st = " "+st;
      String ns ="";
      for (int i=1; i<st.length() ; i++){
      char c =st.charAt(i);
      if (i>=1 && st.charAt(i-1)==' ' && (c>='A' && c<='Z')){
        c +=32;
      }
      else if (st.charAt(i-1)!=' ' && (c>='a' && c<='z')){
          c-=32;
      }
       ns+=c;
     }
      System.out.println(ns);
  }
}