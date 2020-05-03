package stack;

import java.util.Arrays;
import java.util.Stack;

public class CalculateSpan {

    // A stack based efficient method to calculate
    // stock span values
    static void calculateSpan(int arr[], int n, int S[]) {
        // Create a stack and push index of first element
        // to it
        Stack<Integer> st = new Stack<>();
        st.push(0);

        // Span value of first element is always 1
        S[0] = 1;

        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not
            // empty and top of stack is smaller than arr[i]

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            // If stack becomes empty, then arr[i] is greater than all elements on left of it, i.e.,
            // arr[0], arr[1], ..arr[i-1]. Else arr[i]
            // is greater than elements after top of stack
            //Imp note -> stack is empty then i+1 else top-i
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }
    // A utility function to print elements of array
    static void printArray(int arr[])
    {
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        // Fill the span values in array S[]
        calculateSpan(price, n, S);

        // print the calculated span values
        printArray(S);
    }
}
