import java.util.List;

class PancakeSort implements SortStrategy {

    /* Reverses arr[0..i] */
    static void flip(List<Integer> arr, int i)
    {
        int temp, start = 0;
        while (start < i)
        {
            temp = arr.get(start);
            arr.set(start, arr.get(i));
            arr.set(i, temp);
            start++;
            i--;
        }
    }

    // Returns index of the 
    // maximum element in 
    // arr[0..n-1] 
    static int findMax(List<Integer> arr, int n)
    {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (arr.get(i) > arr.get(mi))
                mi = i;
        return mi;
    }

    // The main function that
    // sorts given array using 
    // flip operations
    static int pancakeSort(List<Integer> arr, int n)
    {
        // Start from the complete
        // array and one by one
        // reduce current size by one
        for (int curr_size = n; curr_size > 1;
             --curr_size)
        {
            // Find index of the
            // maximum element in
            // arr[0..curr_size-1]
            int mi = findMax(arr, curr_size);

            // Move the maximum element
            // to end of current array
            // if it's not already at 
            // the end
            if (mi != curr_size-1)
            {
                // To move at the end,
                // first move maximum
                // number to beginning
                flip(arr, mi);

                // Now move the maximum 
                // number to end by
                // reversing current array
                flip(arr, curr_size-1);
            }
        }
        return 0;
    }


    @Override
    public List<Integer> sort(List<Integer> numbers) {
        int n = numbers.size();
        pancakeSort(numbers, n);

        return numbers;
    }
}