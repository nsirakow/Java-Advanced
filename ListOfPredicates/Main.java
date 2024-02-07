import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int keyNumber = Integer.parseInt(scanner.nextLine());
        Integer[] intArray = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .distinct()
                .toArray(Integer[]::new);
        List<Integer> result = IntStream.rangeClosed(1, keyNumber)
                .filter(num -> Arrays.stream(intArray).allMatch(divisor -> num % divisor == 0))
                .boxed()
                .toList();

        result.forEach(num -> System.out.print(num + " "));
    }
}
