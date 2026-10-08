public class arr19 {

    public static void main(String[] args) {
        int[] givenArray1 = {23, 100, 23, 56, 100};

        System.out.println("Input array 1:");
        printArray(givenArray1);
        int[] uniqueArray1 = getUniqueElements(givenArray1);
        System.out.println("New array:");
        printArray(uniqueArray1);
        System.out.println();

    }

    // A method to print an array
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // A method to get unique elements from an array without using any built-in data structures like Lists or Sets
    public static int[] getUniqueElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // Create a temporary array to store the unique elements.
        // We'll use a fixed-size array and track its actual size with a counter.
        // The maximum size of the unique array can't exceed the original array's length.
        int[] tempUniqueArray = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if the current element is a duplicate of any element already added to tempUniqueArray
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == tempUniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                tempUniqueArray[uniqueCount++] = arr[i];
            }
        }


        int[] finalUniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueArray[i] = tempUniqueArray[i];
        }

        return finalUniqueArray;
    }
}