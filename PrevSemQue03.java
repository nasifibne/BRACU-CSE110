import java.util.Scanner;
public class PrevSemQue03
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
    double[] x_coordinates = {0.39, 0.72, 1.00, 1.52, -5.20};
    double[] y_coordinates = {0.24, 0.00, 0.00, 0.99, 2.86};
    double[] z_coordinates = {-0.10, 0.44, -0.02, 0.21, 0.42};

    String s = sc.nextLine();
    int index =0;
    for(int i=0;i<planets.length;i++)
    {
      if(s.equals(planets[i]))
        index = i;
    }
    if(index!=0)
    {
      double distance=0.0,min=0.0;
      int min_i=0;
      for(int i=0;i<planets.length;i++)
      {
        if(i==index)
          continue;
        distance = Math.pow(x_coordinates[i]-x_coordinates[index],2)
          + Math.pow(y_coordinates[i]-y_coordinates[index],2)
          + Math.pow(z_coordinates[i]-z_coordinates[index],2);
        if(distance < min || i ==0)
        {
          min = distance;
          min_i=i;
        }
      }
      System.out.println("Closest Planet : "+planets[min_i]);
      System.out.println("Distance : "+min);
    }
    else
    {
      System.out.println("Invalid Input");
    }
  }
}