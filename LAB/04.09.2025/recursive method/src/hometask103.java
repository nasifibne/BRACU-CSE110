public class hometask103 {
    public static void main(String[] args) {
        int[] arr = {13,12,19,21,31,55};
        int index = 2;
        print ( arr, index);
    }
    public static void print(int[] array, int ind){
        if(ind>=array.length){
            return;
        }
        System.out.println(array[ind]);
        print(array, ind+1);
    }
}
