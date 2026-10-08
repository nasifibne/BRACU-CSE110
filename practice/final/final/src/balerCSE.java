public class balerCSE {
    public static void main(String[] args) {
        String st = "aabbcc";
        String ns ="", fin="";
        for (int i =0 ; i<st.length() ; i++){
            char c = st.charAt(i);
            boolean flag = true;
            for (int j =0 ; j<ns.length() ; j++){
                if(c==ns.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ns+=c;
            }
        }
        for (int i =0 ; i<ns.length() ; i++){
            int count =0;
            for (int j =0 ; j<st.length() ; j++){
                if (ns.charAt(i) == st.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                fin +=ns.charAt(i);
            }
            else if (count>=2){
                for (int j=0 ; j<count-2 ; j++){
                    fin +=ns.charAt(i);
                }
            }
            else {
                fin +=ns.charAt(i);
            }

        }
        if(fin.length()==0){
            System.out.println("no valid char");
        }
        else {
            System.out.println(fin);
        }
    }
}
