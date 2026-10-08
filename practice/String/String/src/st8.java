public class st8 {
    public static void main(String[] args) {
        String st = "banana";
        char chk = 'p';
        int firocc =0, lastocc =0;
        firocc = st.indexOf(chk);
        lastocc = st.lastIndexOf(chk);
        System.out.println( "first " + chk + " at index " + firocc);
        System.out.println("last " + chk + " at index  " + lastocc);

    }
}
