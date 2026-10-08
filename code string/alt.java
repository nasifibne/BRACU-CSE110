public class alt {
    public static void main(String[] args) {
        String st = "Hello World!";
        String ns ="";
        int count =0;
        for (int i =0; i<st.length() ; i++){
            char c =st.charAt(i);
            if(count%2 ==0 && ((c >='a' && c <='z') || (c >='A' && c <='Z'))){
                c -=32;
            }
            else if (count%2 ==1 && ((c >='a' && c <='z') ||( c >='A' && c <='Z'))){
                c +=32;
            }

//            else if ( st.charAt(0) >='A' && st.charAt(0) <='Z'){
//                c +=32;
//                ns +=c;
//            }
            ns+=c;
            count++;

        }
        System.out.println(ns);

    }
}
