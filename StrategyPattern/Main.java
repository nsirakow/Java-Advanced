import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
      
        TreeSet<Person> comparedByName = new TreeSet<>(Person::compareNames);
        TreeSet<Person> comparedByAge = new TreeSet<>(Person::compareAge);

        for (int i = 0; i < lines; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person currentPerson = new Person(name, age);

            comparedByName.add(currentPerson);
            comparedByAge.add(currentPerson);
        }

        for (Person person : comparedByName) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        for (Person person : comparedByAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
