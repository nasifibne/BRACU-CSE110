public class mat11b {
    public static String upper(String s ){
        String ns ="";
        for (int i =0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                c -=32;
            }
            ns+=c;
        }
        return ns;
    }

    public static void main(String[] args) {
        String st = "i am Nasif Ibne Mohiuddin";
        System.out.println(upper(st));
    }
}
