import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ListyIterator listyIterator = new ListyIterator();
        while (!input.equals("END")){
            String [] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case ("Create") -> {
                    listyIterator.Create();
                    if (tokens.length > 1) {
                        for (int i = 1; i < tokens.length; i++) {
                            listyIterator.setStringList(tokens[i]);
                        }
                    }
                }
                case ("HasNext") -> System.out.println(listyIterator.HasNext());
                case ("Move") -> System.out.println(listyIterator.Move());
                case ("Print") -> listyIterator.Print();
                case ("PrintAll") -> listyIterator.PrintAll();
            }
            input = scanner.nextLine();
        }
    }
}
