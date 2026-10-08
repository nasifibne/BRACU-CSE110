public class sifatcdi {
    public static void main(String[] args) {
        String st = "hellz";
        String ns="";
        int k =3;
        for (int i=0 ; i<st.length(); i++){
            char c = st.charAt(i);
            int j = (int) c;
            j+=k;
            if(j>122){
                j =(j%123)+97;
            }
            ns +=(char)j;
        }
        System.out.println(ns);
    }
}
