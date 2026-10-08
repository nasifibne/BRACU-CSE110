public class lab101{
  public static void main (String [] args){
    
    evenChecker(10);
    boolean resultEven = isEven(10);
    System.out.println( resultEven );
    boolean resultPos = isPos(-5);
    System.out.println( resultPos );
    sequence(10);
    sequence(-7);
  }
  
  public static void evenChecker (int a){
    if(a%2==0){
      System.out.println("Even! ");
    }
    else {
      System.out.println("Odd! ");
    }
  }
  
   public static boolean isEven (int a){
     boolean flag = false; 
     if(a%2==0){
       flag = true;
     }
     else {
       flag = false;
     }
     return flag;
   }
  
   public static boolean isPos (int a){
     boolean flag = false; 
     if(a>=0){
       flag = true;
     }
     else {
       flag = false;
     }
     return flag;
  }
  
   public static void sequence(int a){
   
     boolean flag = isPos(a);
     if(flag){
       for(int i=0 ; i<=a ; i++){
         if(isEven(i)){
           System.out.print( i+ " ");
         }
       }
     }
     else {
       for(int i=a ; i<0 ; i++){
         boolean flagEven = isEven(i);
         if(flagEven == false){
           System.out.print( i+ " ");
         }
       }
     }
   System.out.println();
   }
}