public class mau5 {
    public static void main(String[] args) {
        String st="nasif is nas if ni nas ie nasif nus nasef.";
        String fi="nas";
        int find=0;
        for(int i =0 ; i<st.length() ; i++){
            char c =st.charAt(i);
            if(c==(fi.charAt(0))){
                int index = i;
                boolean flag = true;
                for(int j =0 ; j<fi.length() ; j++){
                    if(fi.charAt(j) != st.charAt(index++)){
                        flag = false;
                        break;
                    }

                }
                if(flag){
                    find++;
                }
            }
        }
        System.out.println(find);
    }
}
