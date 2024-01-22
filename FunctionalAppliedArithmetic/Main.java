import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>(List.of(Arrays.asList(scanner.nextLine().split(" "))
                .stream()
                .map(Integer::parseInt)
                .toArray(Integer[]::new)));

        Map<String, Consumer<List<Integer>>> consumerMap = new HashMap<>();
        consumerMap.put("add", list -> list.replaceAll(element -> element + 1));
        consumerMap.put("multiply", list -> list.replaceAll(element -> element * 2));
        consumerMap.put("substract", list -> list.replaceAll(element -> element - 1));
        consumerMap.put("print", list -> list.forEach(System.out::println));

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            consumerMap.get(input).accept(integerList);
            input = scanner.nextLine();
        }
    }
}
