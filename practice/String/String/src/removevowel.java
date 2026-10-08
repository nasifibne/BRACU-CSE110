public class removevowel {
    public static void main(String[] args) {
        String st = "aeiounasif";
        String ns="";
        for (int i =0; i<st.length() ; i++){
            char c = st.charAt(i);
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                continue;
            }
            else{
                ns +=c;
            }
        }
        System.out.println(ns);
    }
}
