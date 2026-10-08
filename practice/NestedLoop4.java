public class NestedLoop4 {
public static void main(String[] args) {


  int n= 32768;
  int dig = n;
  int x=0;
  int dig_count=0;
  
  while (n!=0){
    dig_count++;
    n /=10;
  }
  double div = Math.pow(10, dig_count-1);
  while (dig !=0){
    
    if (dig <10){
      x= dig /(int )div;
      dig %= div;
      div /=10;
      System.out.print(x + " ");
    
    }
    else {
    x = dig/(int)div;
    dig %=div;
    div /=10;
    System.out.print(x+ " , ");
    }
    
    }
  }
  

  
}

