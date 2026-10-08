public class st14 {
    public static void main(String[] args) {
        String st ="i love java in cse110";
        int word=0;
        for (int i=0; i<st.length() ; i++){
            char c= st.charAt(i);
            if(c==' '){
                word++;
            }
        }
        System.out.println( "word count " + (++word));
    }
}
