import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainStrategy {

    private static List<Integer> generateList(Integer size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 100));
        }

        return list;
    }

    private static void measureSortTime(SortContext strategy, List<Integer> list, String strategyName) {
        List<Integer> copy = new ArrayList<>(list);
        long startTime = System.nanoTime();
        strategy.doSort(copy);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println(strategyName + " took " + duration + " ms");
    }



    public static void main(String[] args) {

        List<Integer> shortList = generateList(30);
        List<Integer> longList = generateList(100000);
        SortContext context = new SortContext(new QuickSort());

        System.out.println("Sorting short list:");
        measureSortTime(context, shortList, "Quick Sort");
        context.setStrategy(new PancakeSort());
        measureSortTime(context, shortList, "Pancake Sort");
        context.setStrategy(new CombSort());
        measureSortTime(context, shortList, "Comb Sort");



        System.out.println("\nSorting long list:");
        context.setStrategy(new QuickSort());
        measureSortTime(context, longList, "Quick Sort");
        context.setStrategy(new PancakeSort());
        measureSortTime(context, longList, "Pancake Sort");
        context.setStrategy(new CombSort());
        measureSortTime(context, longList, "Comb Sort");



    }
}
