public class task9 {
    public static void main(String[] args) {
        char[] studentGrades = new char[]{'A', 'A', 'A', 'B', 'C', 'U', 'Z'};
        score(studentGrades);
    }
    public static void score(char[] grade){
        for (int i =0 ; i< grade.length ; i++){
            char c = grade[i];
            int mark=0;
            if (c=='A'){
                mark=100;
            }
            else if(c=='B'){
                mark=90;
            }
            else if (c=='C'){
                mark =70;
            }
            System.out.println(mark);
        }
    }
}
