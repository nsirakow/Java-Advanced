public class Person implements Comparable<Person> {
  
    private String name;
    private int age;
  
    public Person (String name, int age){
        this.name=name;
        this.age=age;
    }
  
    public int compareNames(Person other) {
        if (this.name.length() == other.name.length()){
            for (int i = 0; i < this.name.length() ; i++) {
                
                String ThisNameLetter = String.valueOf(this.name.toLowerCase().charAt(i));
                String OtherNameLetter = String.valueOf(other.name.toLowerCase().charAt(i));
                
                if (ThisNameLetter.compareTo(OtherNameLetter) > 0){
                    return 1;
                }
                else if (ThisNameLetter.compareTo(OtherNameLetter) < 0){
                    return -1;
                }
            }
        }
          
        else if (this.name.length() > other.name.length()){
            return 1;
        }
        return -1;
    }
  
    @Override
    public int compareTo(Person o) {
        return 0;
    }
  
    public int compareAge (Person other){
        if (this.age == other.age){
            return 0;
        }
        else if (this.age>other.age){
            return 1;
        }
        return -1;
    }
  
    public String getName() {
        return name;
    }
  
    public int getAge() {
        return age;
    }
}
