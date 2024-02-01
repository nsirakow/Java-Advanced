import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        CustomStack stack = new CustomStack();
        String input = scanner.nextLine();

        while (!input.equals("END")){
            String [] tokens = input.split(" ");
            String command = tokens[0];
            String [] numbers = new String[tokens.length-1];

            for (int i = 0; i < numbers.length ; i++) {
                numbers[i] = tokens[i+1].replaceAll(",", "");
            }
            switch (command) {
                case ("Push") -> {
                    for (int i = 0; i < numbers.length; i++) {
                        stack.getStack().push(Integer.parseInt(numbers[i]));
                    }
                }
                case ("Pop") -> {
                    if (stack.getStack().isEmpty()) {
                        System.out.println("No elements");
                    } else {
                        stack.getStack().pop();
                    }
                }
            }
            input = scanner.nextLine();
        }
        Iterator <Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator <Integer> iterator2 = stack.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
