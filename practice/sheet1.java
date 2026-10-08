import java.util.Scanner;
public class sheet1{
  public static void main (String [] args){
  
    Scanner sc= new Scanner (System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int self=0;
    int lastBook=0;
    int future=0;
    for (int i =1; i<=n; i++){
      if (i%k==0){
      self ++;
        if (self %3==0){
        self++;
        future++;
            } 
      }
        
    }
    int book = (self-future)*k;
    lastBook = n-book;
  System.out.println("total number of shelves used " +self);
  System.out.println("the number of books on the last non-empty shelf. "+lastBook);
  
  
  
  
  }
}