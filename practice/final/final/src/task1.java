public class task1 {
    public static void main(String[] args) {
        String S = "abababa";
        String S1 = "aba";
        String S2 = "a";
        String temp="";
        String ns="";
        for (int i =0 ; i<S.length() ; i++){
            char c1 = S.charAt(i);
            char c2 = S1.charAt(0);
            if (c1==c2){
                for (int j =i ; j <S1.length()+i ; j++){
                    temp +=S.charAt(j);
                }
            }
            if(temp.equals(S1)){
                ns +=S2;
                temp="";
                i+=S1.length()-1;
            }
            else {
                temp="";
                ns+=c1;
            }
        }
        System.out.println(ns);
    }
}
