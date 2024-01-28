import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int lines = Integer.parseInt(sc.nextLine());
        Box <Double> box = new Box<>();
        for (int i = 0; i < lines ; i++) {
            Double input = Double.parseDouble(sc.nextLine());
            box.list.add(input);
        }

        Double specialElement= Double.parseDouble(sc.nextLine());

        System.out.println(box.comparator(box.getList(), specialElement));
    }
}
