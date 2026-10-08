public class mau1 {
    public static int upper(String s){
        int upper=0;
        int i;
        for(i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                upper++;
            }
        }
        return upper;
    }
    public static int lower(String s){
        int lower =0;
        int i;
        for(i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                lower++;
            }
        }
        return lower;
    }
    public static int digit(String s ){
        int digit =0;
        int i;
        for(i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                digit++;
            }
        }
        return digit;
    }

    public static void main(String[] args) {
        String s = "HelLo WorLD I stuDY CSE100";
        System.out.println("Uppercase char "+ upper(s));
        System.out.println("lowercase char " + lower(s));
        System.out.println("digit " + digit(s));
    }
}
