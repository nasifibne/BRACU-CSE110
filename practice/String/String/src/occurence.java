public class occurence {
    public static void main(String[] args) {
        String st = "aaaiier";
        String in2 = "";
        while (true) {
            char ch1 = st.charAt(0);
            int count = 0;
            for (int j = 0; j < st.length(); j++) {
                char ch2 = st.charAt(j);
                if (ch1 == ch2) {
                    count++;
                } else {
                    in2 = in2 + ch2;
                }
            }
            st = in2;
            System.out.println(ch1 + " was found " + count + " times");

            if(in2.length()==0){
                break;
            }
            in2 = "";
        }
    }
}