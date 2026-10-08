public class mau7 {
    public static void main(String[] args) {
        String st ="cse110 is my favourite course! programming is something i enjoy a lot.";
        st =". "+st;
        String ns="";
        for(int i =2; i<st.length()-1; i++){
            char c =st.charAt(i);
            char d = st.charAt(i-2);

            if((d=='.' || d=='?' || d=='!') && (c>='a' && c<='z')){
                c-=32;
            }
            if((st.charAt(i-1)==' ') && (st.charAt(i)=='i') && (st.charAt(i+1)==' ')){
                c-=32;
            }
            ns+=c;
        }
        System.out.println(ns);

   }
}

