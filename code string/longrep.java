public class longrep{
  public static void main (String [] args){
  String st = "i am ifred";
  st += " ";
  String ns ="";
  String word="";
  String temp="";
   boolean flag = false;
  for (int i =0; i<st.length() ; i++){
    char c= st.charAt(i);
    if (c !=' '){
      ns+=c;
    }
    else {
      if (ns.length()>word.length()){
        word = ns;
      }
      ns="";
    }
    for (int j =0 ; j<ns.length() ; j++){
      char c1 = ns.charAt(j);
       flag = false;
      for (int k =0 ; k <temp.length() ; k++){
        if (c1 == temp.charAt(k)){
          flag = true;
          continue;
        }
      }

      }
    }
  
  
        if(!flag){
        System.out.println(ns);
        }
  
  }
}