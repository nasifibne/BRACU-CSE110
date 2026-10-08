public class T6{
 public static void main(String[] args) {
  int x = 1;
  int y = 3;
  int sum = 0;
  boolean flag = false;
  while (x < 10) {
  if (flag == true) {
  for (int i = 1; i <= 10; i += 2) {
  sum += i * (++y) ;
  }
  System.out.println(sum);
  flag = false;
  }
  else {
  sum += (x % 3) + (sum/2) + y-2;
  System.out.println(sum);
  y += 3;
  flag = true;
  }
  x += 1;
  }
  System.out.println(y);
 }
  }