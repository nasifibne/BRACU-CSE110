public class mau8 {
    public static void main(String[] args) {
        String st ="kennv@fastmail.com,bennvlia@yahoo.com,nasif@gmail.com";
        st+=",";
        String ns="";
        int ind=0, ind1=0;
        for(int k=0 ; k<st.length() ; k++) {
            char d =st.charAt(k);
            if(d!=','){
                ns+=d;
            }
            else {
                for (int i = 0; i < ns.length(); i++) {
                    char c = ns.charAt(i);
                    if (c == '@') {
                        ind = i;
                    }
                    if (c == '.') {
                        ind1 = i;
                    }
                }
                String name="";
                String mail="";
                for (int i = 0; i < ind; i++) {
                    char c = ns.charAt(i);
                    name += c;
                }
                for (int i = ind + 1; i < ind1; i++) {
                    mail += ns.charAt(i);
                }
                System.out.printf("%s is a \'%s\' user\n",name , mail);
                ns="";
            }
        }
    }
}
