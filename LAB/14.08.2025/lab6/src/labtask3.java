import java.util.Scanner;

public class labtask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String fin ="";
        boolean flag = false;
        for (int i =in.length()-1 ; i>=0 ; i--){
            char c = in.charAt(i);
            fin +=c;

        }
        if (fin.equals(in)){
            flag = true;
        }
        System.out.println(flag);
    }
}
