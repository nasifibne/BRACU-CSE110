public class design4{
  public static void main(String [] args){
  

    int n=5;
    for (int i =1; i<=n ; i++){
      
      for (int j =1; j<=n-i; j++){
        System.out.print(" ");
      }
      for (int k= 1; k<=2*i-1; k++){
        System.out.print("*");
      }      
      System.out.println();
    }
    
    for (int l=n; l>=0 ; l-- ){
    
      for (int m=n-l; m<=0; m++){
      System.out.print(" ");
      }
      for (int p=2*n-3; p>0; p--){
      System.out.print("*");
      } 
      System.out.println();
    }
  
  }
}

