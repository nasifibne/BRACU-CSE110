public class st13 {
    public static void main(String[] args) {
        String st = "aaaaaaaassssssssssfdggggggggggg";
        String ns = "";
        for (int i =0 ; i<st.length() ; i++){
            char c = st.charAt(i);
            boolean flag =false;
            for (int j=0; j<ns.length() ; j++){
                char d = ns.charAt(j);
                if (c==d){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ns +=c;
            }

        }
        System.out.println(ns);

    }
}
