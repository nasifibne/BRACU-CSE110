public class arr3 {
    public static void main(String[] args) {
        String [] st = {"a12bc3", "4d5e", "f6gh7","12345", "abc"};
        int sum=0, maxSum=0;
        String temp = st[0];
        String max="";
        for (int i =0 ; i<temp.length() ; i++){
            int d = temp.charAt(i)-'0';
            sum+=d;
            max= st[0];
        }
        for (int i =1 ; i< st.length ; i++){
            temp =st[i];
            sum=0;
            for(int j=0; j<temp.length() ; j++){
                if(temp.charAt(j)>='0' && temp.charAt(j) <='9'){
                    int d = temp.charAt(j)-'0';
                    sum+=d;
                    max= st[i];
                }
            }
            if(sum>maxSum){
                maxSum=sum;
                max =st[i];
            }

        }
        System.out.printf(" largest sum is %d and comes from %s",maxSum, max);
    }
}
