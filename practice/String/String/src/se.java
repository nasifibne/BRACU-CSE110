import java.util.Scanner;
public class se {
    public static void main(String[]args){
            System.out.println("input a string");
            Scanner sc=new Scanner(System.in);
            String in1=(sc.nextLine());
            String in2="";
            for(int i =0;i<in1.length();){
                char ch1=in1.charAt(i);
                int count=0;
                for(int j=0;j<in1.length();j++){
                    char ch2=in1.charAt(j);
                    if(ch1==ch2){
                        count++;
                    }
                    else{
                        in2=in2+ch2;
                    }
                }
                in1=in2;
                System.out.println(ch1+" which is "+(int)ch1+" was found "+count+" times");
//                count=0;
//                if(in2.length()==0){
//                    break;
//                }
                in2="";
            }

    }

}
