public class stringShifat {
    public static void main(String[] args) {
        String st = "i am nasif. i read in bracu. programming in my passion.";
        String ns="";
        for (int i =0 ; i< st.length() ; i++){
            char c = st.charAt(i);
            if (i==0 && c>='a' && c<='z'){
                c-=32;
            }
//            else if(c== 'i'){
//                c-=32;
//            }
            else if(c>='a' && c<='z' && (st.charAt(i-2)=='.' || st.charAt(i-2)=='!' ) ){
                c-=32;
            }
            ns+=c;
        }
        System.out.println(ns);
    }
}
