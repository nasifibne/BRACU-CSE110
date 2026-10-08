import java.util.Scanner;
    public class home103{

        public static void main (String [] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("give age");
            int age = sc.nextInt();
            System.out.println("give the amount of salary");
            int salary = sc.nextInt();
            //A
            double tax = calcTax(age,salary);
            System.out.printf("the amount of tax is %.2f\n",tax);
            //B
            calcYearlyTax ();

        }

        //A
        public static double calcTax(int a , int b){
            double tax=0.0;
            if(a<18){
                tax =0.0;
            }
            else {
                if(b<10000){
                    tax =0.0;
                }
                else if(b>=10000 && b<=20000){
                    tax = b*.07;
                }
                else if(b>20000){
                    tax =b*.14;
                }
            }
            return tax;
        }

        //B

        public static void calcYearlyTax (){
            Scanner sc = new Scanner (System.in);
            System.out.println("give age");
            int age = sc.nextInt();
            double totaltax =0.0;
            double tax=0.0;
            if(age<18){
                System.out.println("the amount of tax is "+tax);
            }
            else{
                for (int i =1; i<=12 ; i++){
                    System.out.println("enter your salary");
                    int sal = sc.nextInt();
                    double taxMon = calcTax(age, sal);
                    totaltax +=taxMon;
                    System.out.printf("month %d tax %.2f\n",i, taxMon);

                }

            }
            System.out.println("Total Yearly Tax: " + totaltax);
        }
    }

