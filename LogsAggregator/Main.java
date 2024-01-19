import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, TreeMap<String, Integer>> people = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String ip = input[0];
            String name = input[1];
            int time = Integer.parseInt(input[2]);

            if (people.containsKey(name)) {
                if (people.get(name).containsKey(ip)) {
                    int newTime = people.get(name).get(ip) + time;
                    people.get(name).put(ip, newTime);
                } else {
                    people.get(name).put(ip, time);
                }
            } else {
                TreeMap<String, Integer> current = new TreeMap<>();
                current.put(ip, time);
                people.put(name, current);
            }
        }
        for (Map.Entry<String, TreeMap<String, Integer>> entry : people.entrySet()) {
            int sum = 0;
            StringBuilder ipTS = new StringBuilder();
            for (Map.Entry<String, Integer> entrys : entry.getValue().entrySet()) {
                sum += entrys.getValue();
                ;
                ipTS.append(entrys.getKey()).append(", ");
            }
            ipTS.delete(ipTS.length() - 2, ipTS.length() - 1);
            ipTS.insert(0, "[");
            ipTS.insert(ipTS.length() - 1, "]");
            System.out.printf("%s: %d %s%n", entry.getKey(), sum, ipTS);
        }
    }
}
