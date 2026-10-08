public class firletterupp{
  public static void main (String [] args){
  
    String st ="this is a sentence";
    String ns="";
    String ws = " "+st;
    String fin = "";
    for (int i =0; i<ws.length() ; i++){
      char c = ws.charAt(i);
      if (c==' '){
        i =i+1;
        c = ws.charAt(i);
        int d = (int)c;
        if (d >= 97 && d<=122){
          d = d-32;
          c = (char)d;
          fin += c +" ";
        }
      }
      ns= ns+fin;
      
    }
    System.out.println(ns);
  }
}