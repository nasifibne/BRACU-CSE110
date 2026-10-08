public class mat13 {
    public  static int wordCount(String s){
        int count =0;
        s +=" ";
        for (int i=0 ; i<s.length() ; i++){
            char c =s.charAt(i);
            if(c==' '){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        String st = "i am nasif ibne mohiudduin";
        System.out.println(wordCount(st));
    }
}
