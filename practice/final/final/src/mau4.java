public class mau4 {
    public static boolean find(String s , char a ){
        boolean flag = false;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==a){
                flag = true;
                break;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        String st ="CSE 110 iS my favorite course!";
        char c ='M';
        if(find(st,c)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
