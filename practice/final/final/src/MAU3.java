public class MAU3 {
    public static String rev(String s){
        String ns="";
        for(int i =s.length()-1;  i>=0 ; i--){
            char c =s.charAt(i);
            ns += c;
        }
        return ns;
    }

    public static void main(String[] args) {
        String s =" i am a programmer";
        System.out.println(rev(s));
    }
}
