public class stringconcate {
    public static void main(String[] args) {
        String st= "java";
        String st2 = "cse110";
        for (int i=0; i<st2.length() ; i++){
            char c = st2.charAt(i);
            st +=c;
        }
        System.out.println(st);
    }
}
