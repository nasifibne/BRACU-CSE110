public class st11 {
    public static void main(String[] args) {
        String st ="moumita";
        String ns ="";
        for (int j =0; j<st.length() ; j++){
            char c = st.charAt(j);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
              continue;
            }
            ns +=c;
        }
        System.out.println(ns);
    }
}
