public class Length {
    public static void main(String[] argse){
        String s1="Nasif Ibne";
        s1+="#";
        int count=0;
        while(true){
            if(s1.charAt(count)=='#'){
                break;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
