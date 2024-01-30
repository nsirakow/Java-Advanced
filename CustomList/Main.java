import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        CustomList <String> stringCustomList = new CustomList<>();
        String input = sc.nextLine();

        while (!input.equals("END")){
            String [] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case ("Add") -> stringCustomList.add(tokens[1]);
                case ("Remove") -> stringCustomList.remove(Integer.parseInt(tokens[1]));
                case ("Contains") -> {
                    if (stringCustomList.contains(tokens[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                }
                case ("Swap") -> {
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    stringCustomList.swap(index1, index2);
                }
                case ("Greater") -> System.out.println(stringCustomList.countGreaterThan(tokens[1]));
                case ("Max") -> System.out.println(stringCustomList.Max());
                case ("Min") -> System.out.println(stringCustomList.Min());
                case ("Print") -> stringCustomList.Print();
                case ("Sort") -> Sorter.sort(stringCustomList);
                default -> System.out.println("Invalid command");
            }
            input = sc.nextLine();
        }
    }
}
