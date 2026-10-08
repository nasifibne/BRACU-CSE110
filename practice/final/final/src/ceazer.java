public class ceazer {
    public static void main(String[] args) {
        String st = "hello world";
        int k =7;
        String ns="";
        for (int i =0 ; i<st.length(); i++){
            char c = st.charAt(i);
            if((c>='a' && c<='z')){
                int j = (int)c;
                j-=k;
                if(j<97){
                    j= 122-(97-j-1);
                }
                c = (char)j;
            }
            ns+=c;
        }
        System.out.println(ns);

    }
}
