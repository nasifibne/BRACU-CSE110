public class st12 {
    public static void main(String[] args) {
        String st = "hello world";
        String ns ="";
        for (int i =0 ; i<st.length() ; i++){
            char c =st.charAt(i);
            if (c==' '){
                ns +='-';
            }
            else {
                ns +=c;
            }
        }
        System.out.println(ns);
    }
}
