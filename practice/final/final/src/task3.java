public class task3 {
    public static void main(String[] args) {
        String [] email={"cse110@gmail.com","government@cv.","eee@bracu.ac.bd"};
        int valid=0;
        for (int i =0 ; i< email.length ; i++){
            String temp = email[i];
            int ind=0;
            int dot=0;
            boolean flag1 = false, flag2= false, flag3= false, flag4= false, flag5=false;
            char c= temp.charAt(0);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                flag1 = true;
            }
            for (int j =1 ; j<temp.length() ; j++){
                if(temp.charAt(j) =='@'){
                    flag2= true;
                    ind = j;
                }
                if (temp.charAt(j) == '.') {
                    flag3 = true;
                    dot = j;
                }
            }

            char d = temp.charAt(ind+1);
            char e = temp.charAt(ind-1);
            if(dot+1<temp.length()) {
                char f = temp.charAt(dot+1);
                if ((f>='a' && f<='z') || (f>='A' && f<='Z')){
                    flag5=true;
                }
            }
            if(((d>='a' && d<='z') || (d>='A' && d<='Z') ) && ((e>='a' && e<='z') || (e>='A' && e<='Z') || (e>='0' && e<='9')) ){
                flag4 = true;
            }
            if(flag4 && flag2 && flag1 && flag3 &&flag5){
                valid++;
            }

        }
        System.out.println(valid);

    }

}
