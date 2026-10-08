public class SA {
    public static void main(String[] args) {
        String st = "programing";
        String ns ="";
        for (int i =st.length()-1; i>=0 ; i--){
            char c = st.charAt(i);
            ns +=c;
        }
        System.out.println(ns);
    }
}
