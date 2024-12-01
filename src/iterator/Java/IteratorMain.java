import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Sequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> iterator = fibonacciSequence.iterator();

        for (int i = 0; i < 10; i++) {
            System.out.println(iterator.next());
        }
    }
}