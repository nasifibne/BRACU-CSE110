public class met11 {
    public static boolean palindrome(String s){
        String ns ="";
        for (int i= s.length()-1 ; i>=0 ; i--){
            char c = s.charAt(i);
            ns +=c;
        }
        boolean flag = false;
        if(ns.equals(s)){
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        String st = "madam";
        System.out.println(palindrome(st));
    }
}
