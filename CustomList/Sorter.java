public class Sorter {
    public static <T extends Comparable <T>> void sort(CustomList<T> list) {
      
        for (int i = 0; i < list.size()  ; i++) {
            T current = list.getValueOnIndex(i);
            for (int j = 0; j < list.size(); j++) {
                T target = list.getValueOnIndex(j);
                if (current.compareTo(target) < 0){
                    list.swap(i,j);
                }
            }
        }
    }
}
