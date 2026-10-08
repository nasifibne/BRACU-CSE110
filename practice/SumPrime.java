import java.util.*;
public class SumPrime{
  public static void main (String [] args){
  Scanner sc =new Scanner (System.in );
  int u = sc.nextInt();
  int l = sc.nextInt();
  int min = Math.min(u,l);
  int max = Math.max(u,l);
  for (int i = min ; i<=max ; i++){
  int x = i%10;
  i = i/10;
  int sum = x+i;
  System.out.println(sum);
//  if ()
  }
  
  
  
  
  }}