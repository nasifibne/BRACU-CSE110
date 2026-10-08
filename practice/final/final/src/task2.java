public class task2 {
    public static String modify(String s, String s1 , String s2){
        String ns="";
        for (int i =0 ; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==s1.charAt(0)){
                int ind=i+1;
                boolean flag = true;
                for (int j =1; j<s1.length() ; j++){
                    if(s.charAt(ind++)!=s1.charAt(j)){
                        flag = false;
                        break;
                    }

                }
                if (flag){
                    ns+= s2;
                    i +=s1.length()-1;
                }

            }
            else {
                ns += c;
            }

        }
        return ns;
    }

    public static void main(String[] args) {
       String S = "baddadda";
       String S1 = "dd";
       String S2 = "n";

        System.out.println(modify(S, S1, S2));

    }
}
