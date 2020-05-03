package stack;

import java.util.Stack;
import java.util.TreeSet;

public class PreviousGreater {

    //Method 1:Naive Solution
    // Prints greater elements on left side
    // of every element
    static void printPrevGreaterNaive(int[] arr, int n)
    {
        for(int i=0;i<n;i++){
            int j;
            for( j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
            if(j==-1){
                System.out.println("count "+ -1);
            }
        }
    }
    //M2:Best Solution O(n)
    // Prints greater elements on left side
    // of every element
    static void printPrevGreater2(int[] arr, int n)
    {
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        System.out.println("for first element prev greater is -1");

        for (int i=1;i<n;i++){
            //once we get the greater from right side then push that current element
            // i.e first print current prev greater first then push the element
                while(s.empty()==false && s.peek()<=arr[i]){
                    s.pop();
                }
                int prevGreater=(s.empty())?-1:s.peek();
            System.out.print(" "+prevGreater);
            s.push(arr[i]);
        }
    }

    //M3: using tree set
    static void printPrevGreater(int[] arr, int n){
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i=0;i<n;i++){
           Integer ceiling= ts.ceiling(arr[i]);
           if (ceiling==null){
               //if no greater is found then -1
               System.out.print(-1+" ");
           }else {
               System.out.print(ceiling+" ");
           }
            //then insert
            ts.add(arr[i]);
        }

    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 5, 11, 10, 20, 12 };
        int n = arr.length;
        printPrevGreater(arr, n);
    }
}

