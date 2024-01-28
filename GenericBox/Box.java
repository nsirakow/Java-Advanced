import java.util.ArrayList;
import java.util.List;

public class  Box <T> {
    private T element;
    private List<T> list;
  
    public String toString(int i) {
        return this.list.get(i).getClass().getName() + ": " + this.list.get(i);
    }
    public Box (T value){
        this.element = value;
    }
    public Box (){
        this.list= new ArrayList<>();
    }
    public void setList(List<T> list) {
        this.list = list;
    }
    public List<T> getList() {
        return list;
    }
    public void swapper (int position1, int position2) {
        T keeper = this.list.get(position1);

        list.set(position1, list.get(position2));
        list.set(position2, keeper);
    }
    public <T extends Comparable<T>> Integer comparator  (List <T> list, T specialElement)  {
        int greaterElements=0;
        for (int i = 0; i < this.list.size() ; i++) {
            if (list.get(i).compareTo(specialElement)>0) {
                greaterElements++;
            }
        }
        return greaterElements;
    }
}
