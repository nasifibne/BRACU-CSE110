public class mau5alt {
    public static void main(String[] args) {
        String st="nasif is nas if ni nas ie nasif nus nasef.";
        String fi="nas";
        int find=0;
        for(int i =0 ; i<st.length() ; i++){
            boolean flag = true;
            int index=i;
            for (int j =0 ; j<fi.length() ; j++){
                if(st.charAt(index++) != fi.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                find++;
            }
        }
        System.out.println(find);
    }
}
