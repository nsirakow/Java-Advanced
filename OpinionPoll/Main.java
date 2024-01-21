import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person currentPerson = new Person(name, age);

            if (currentPerson.getAge() > 30) {
                people.add(currentPerson);
            }
        }
        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(person -> {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        });
    }
}


