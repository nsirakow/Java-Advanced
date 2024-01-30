import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
  
    private final List<T> list;

    public void add(T element) {
        this.list.add(element);
    }

    public T remove(int index) {
        this.list.remove(index);
        return this.list.get(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        T temporary = list.get(index1);

        this.list.set(index1, list.get(index2));
        list.set(index2, temporary);
    }

    public int countGreaterThan(T element) {
        int greaterElements = 0;
        for (int i = 0; i < list.size(); i++) {
            if (this.list.get(i).compareTo(element) > 0) {
                greaterElements++;
            }
        }
        return greaterElements;
    }

    public T Max() {
        T max = this.list.get(0);
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(max) == 1) {
                max = list.get(i);
            }
        }
        return max;
    }

    public T Min() {
        T min = list.get(0);
        for (int i = 0; i < this.list.size(); i++) {
            if (list.get(0).compareTo(min) < 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public void Print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }

    public int size() {
        return this.list.size();
    }

    public T getValueOnIndex(int i) {
        return this.list.get(i);
    }

    public CustomList() {
        this.list = new ArrayList<>();
    }
}
