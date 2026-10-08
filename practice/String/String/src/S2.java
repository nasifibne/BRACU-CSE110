public class S2 {
    public static void main(String[] args) {
        String st = "Hello World!";
        int i =0;
        int count=0;
        while (true){
            char c = st.charAt(i);
            if ((int)c<=127){
                count++;
            }
            else {
                break;
            }
            i++;
        }
        System.out.println(count);
    }
}
