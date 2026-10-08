public class small {
    public static void main(String[]args){
        String s1="Nasif Ibne";
        String s2="";
        int count=0;
        for(int i=0; i<s1.length(); i++){
            char c=s1.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z')){
                if(count%2==0 && (c>='A' && c<='Z')){
                    c+=32;
                }
                else if(count%2==1 && (c>='a' && c<='z')){
                    c-=32;
                }
                count++;
            }
            s2+=c;
        }
        System.out.println(s2);
    }
}
