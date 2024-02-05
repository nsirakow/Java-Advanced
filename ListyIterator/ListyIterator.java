import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<ListyIterator> {
  
    List<String> stringList;
    int index = 0;
  
    public boolean HasNext(){
        return index + 1 < stringList.size();
    }
  
    public boolean Move() {
        if (index < stringList.size()){
            index++;
            return true;
        }
        return false;
    }
  
    public void Print(){
        if (!stringList.isEmpty()){
            System.out.println(stringList.get(index));
        }
        else {
            System.out.println("Invalid operation");
        }
    }
  
    public void Create(String...strings){
        stringList= new ArrayList<>();
    }
  
    public void setStringList(String element) {
        this.stringList.add(element);
    }
  
    public Iterator<ListyIterator> iterator(){

        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }
            @Override
            public ListyIterator next() {
                return null;
            }
        };
    }
  
    public void PrintAll(){
        for (String currentElement : stringList) {
            System.out.print(currentElement + " ");
        }
        System.out.println();
    }
  
    public List<String> getStringList() {
        return stringList;
    }
}

