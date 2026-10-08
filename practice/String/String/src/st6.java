public class st6{
  public static void main(String [] args){
  
    String st ="cse110 is fun";
    String stcheck ="cse110";
    boolean isSame = false;
    
    for (int i=0; i<st.length() ; i++){
      char c = st.charAt(i);
      if (c == stcheck.charAt(0)){   
        boolean fullSame= true;
        int idx = i;
        for (int j=0; j<stcheck.length() ; j++){
          
          char d = stcheck.charAt(j);
          if ( st.charAt(idx) != d){
            fullSame = false;
          } 
          idx +=1;
        }
        if (fullSame){
        isSame= true;
        }
      }
    }
    
    if(isSame){
      System.out.println("find");
    }
    else {
      System.out.println("not found");
    }
  }}