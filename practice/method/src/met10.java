public class met10 {
    public static void main(String[] args) {
        String st = "i am nasif ibne mohiudduin";
        System.out.println(vowel(st));
    }
    public static int vowel (String s){
        int count=0;
            for(int i =0 ; i<s.length() ; i++){
                char c = s.charAt(i);
                if( c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    count++;
                }
            }
        return count;
    }
}
