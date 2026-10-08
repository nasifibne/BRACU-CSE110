public class mat12 {
    public static String hyper (String s ){
        String ns="";
        for (int i=0; i<s.length() ; i++){
            char c = s.charAt(i);
            if (c==' '){
                ns +='-';
                continue;
            }
            ns +=c;
        }
        return ns;
    }

    public static void main(String[] args) {
        String st = "i am nasif ibne";
        System.out.println(hyper(st));
    }
}
