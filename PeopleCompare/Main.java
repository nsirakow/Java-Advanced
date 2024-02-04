import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("END")) {
            String[] personInfo = input.split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            String town = personInfo[2];
            
            Person currentPerson = new Person(name, age, town);
            people.add(currentPerson);

            input = scanner.nextLine();
        }

        int nPerson = Integer.parseInt(scanner.nextLine()) - 1;
        Person compareWith = people.get(nPerson);

        int equalPeople = 0;
        int notEqualPeople = 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).compareTo(compareWith) == 0) {
                equalPeople++;
            } else {
                notEqualPeople++;
            }
        }
        if (equalPeople == 0) {
            System.out.println("No matches");
        } else {
            System.out.print(equalPeople + " " + notEqualPeople + " " + people.size());
        }
    }
}
