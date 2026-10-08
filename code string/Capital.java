public class Capital {
    public static void main(String[]args){
        String s1="nasif ibne";
        s1=" "+s1;
        String s2="";
        for(int i=1; i<s1.length(); i++){
            char a=s1.charAt(i);
            if(s1.charAt(i-1)==' '){
                a-=32;
            }
            s2+=a;
        }
        System.out.println(s2);
    }
}
