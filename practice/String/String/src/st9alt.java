public class st9alt {
    public static void main(String[] args) {
        String st = "banana";
        String ns="";
        for (int i =0 ; i<st.length() ; i++){
            char c=st.charAt(i);
            boolean flag =false;
            for (int j =0 ; j<ns.length() ; j++){
                char d =ns.charAt(j);
                if (c == d) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ns = ns + c;
            }
        }
        //System.out.println(ns);

        for (int i =0; i<ns.length() ; i++){
            char c = ns.charAt(i);
            int count =0;
            for (int j =0 ; j<st.length() ; j++){
                char d = st.charAt(j);

                if (c==d){
                    count++;
                }
            }
            System.out.printf("the letter %c is %d times \n" ,c,count);

        }
    }
}
