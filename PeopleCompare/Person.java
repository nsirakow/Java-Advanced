public class Person implements Comparable<Person> {
  
    private String name;
    private int age;
    private String town;
  
    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }
    @Override
    public int compareTo(Person other) {
        // Compare names
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        // Compare ages
        if (this.age != other.age) {
            return Integer.compare(this.age, other.age);
        }
        // Compare towns
        return this.town.compareTo(other.town);
    }
}

