import java.util.List;

public class CombSort implements SortStrategy {
    // To find gap between elements
    int getNextGap(int gap)
    {
        // Shrink gap by Shrink factor
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }

    // Function to sort arr[] using Comb Sort
    List<Integer> combSort(List<Integer> arr)
    {
        int n = arr.size();

        // initialize gap
        int gap = n;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped)
        {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i=0; i<n-gap; i++)
            {
                if (arr.get(i) > arr.get(i + gap))
                {
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i + gap));
                    arr.set(i + gap, temp);

                    // Set swapped
                    swapped = true;
                }
            }
        }
        return arr;
    }


    public List<Integer> sort(List<Integer> numbers) {
        return combSort(numbers);
    }

}
