package array;

/**
 * // Java program to implement linear
 *
 */
public class ArrayOperationUnsortedArray {

    // search in unsorted arrays
    private static int findElement(int[] arr, int n, int key) {
        // Function to implement
        // search operation
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    //Insert operation
    static int insertSorted(int arr[], int n,
                            int key,
                            int capacity){
        if(n>=capacity){
            return n;
        }
        arr[n]=key;
        return n;
    }

    public static void main(String[] args) {

        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;

        // Using a last element as search element
        int key = 40;
        int position = findElement(arr, n, key);

        if (position == - 1)
            System.out.println("Element not found");
        else
            System.out.println("Element Found at Position: "
                    + (position + 1));


        System.out.println("========== Insert operation  start==========");

        int[] arr1= new int[20];
        arr1[0] = 12;
        arr1[1] = 16;
        arr1[2] = 20;
        arr1[3] = 40;
        arr1[4] = 50;
        arr1[5] = 70;
        int capacity = 20;
        int n1 = 6;
        int i, key1 = 26;

        System.out.print("Before Insertion: ");
        for (i = 0; i < n1; i++)
            System.out.print(arr1[i]+" ");

        // Inserting key
        n = insertSorted(arr1, n1, key1, capacity);

        System.out.print("\n After Insertion: ");
        for (i = 0; i < n; i++)
            System.out.print(arr1[i]+" ");


        System.out.println(" \n ====== Insert operation End =============");
    }


}
