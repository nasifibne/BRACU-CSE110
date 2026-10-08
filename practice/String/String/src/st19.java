public class st19 {
    public static void main(String[] args) {
        String st = "i love java";
        String ns ="";
        for (int i =0 ; i<st.length() ; i++){
            char c = st.charAt(i);
            if(st.charAt(0) >=97 && st.charAt(0) <=122) {
                int x = (int)c -32;
                ns += (char)x;
            }
            if (c ==' '){
                i++;
                char d = st.charAt(i);
                int x = (int)d;
                if(x >=97 && x <=122) {
                    x = (int)d -32;
                }
                ns =ns + " " +(char)x;

            }
            else {
                ns +=c;
            }

        }
        System.out.println(ns);

    }
}
