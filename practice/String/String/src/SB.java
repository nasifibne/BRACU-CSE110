public class SB {
    public static void main(String[] args) {
        String st ="programming";
        String stfin = st.toLowerCase();
        int count=0;
        for (int i =0; i<stfin.length() ; i++){
            char c = stfin.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
