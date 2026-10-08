public class st18 {
    public static void main(String[] args) {
        String st ="i-love-java-cse110";
        char del = '-';
        String ns= "";

        for (int i =0; i<st.length() ; i++){
            char c = st.charAt(i);
            if (c != '-'){
                ns +=c;
            }
            else{
                System.out.println(ns);
                ns ="";
            }
        }
        System.out.println(ns);
    }
}
