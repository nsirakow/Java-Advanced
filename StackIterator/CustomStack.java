import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomStack implements Iterable<Integer> {
  
    ArrayDeque <Integer> stack;
  
    public Iterator<Integer> iterator(){
        List <Integer> list = new ArrayList<>(stack);
        return new Iterator<>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                if (i<list.size()){
                    return true;
                }
                return false;
            }
            @Override
            public Integer next() {
                if (hasNext()) {
                    return list.get(i++);
                } else {
                    throw new IllegalStateException("No more elements in the stack.");
                }
            }
        };
    }
    public CustomStack(){
        stack = new ArrayDeque<>();
    }
    public ArrayDeque<Integer> getStack() {
        return stack;
    }
}
