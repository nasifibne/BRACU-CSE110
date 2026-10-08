public class st9 {
    public static void main(String[] args) {
        String st = "banana";
        char chk = 'b';
        int occ=0;
        for (int i=-0; i<st.length() ; i++){
            char c = st.charAt(i);
            if(c==chk){
                occ++;
            }
        }
        System.out.printf("number of occurence of %c is %d\n" , chk , occ);
    }
}
