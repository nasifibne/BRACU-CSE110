public class mat14 {
    public static String longWord(String s ){
        s +=" ";
        String ns="", ws="";
        for (int i =0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if (c==' '){
                if(ns.length()>ws.length()){
                    ws = ns;
                }
                ns ="";
            }
            else {
                ns+=c;
            }
        }
        return ws;
    }

    public static void main(String[] args) {
        String st = "i am nasif ibne mohiudduin";
        System.out.println(longWord(st));
    }
}
