package iterator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Iterator {

    List<Integer> list = new LinkedList<>();
    int currentIndex = 0;

    public Iterator(int[][] arr) {
        for (int[] intArr : arr) {
            for (int finalInt : intArr) {
                list.add(finalInt);
            }
        }
        Collections.sort(list);
    }

    public boolean hasNext() {
        return currentIndex < list.size();
    }

    public int next() {
        int result = list.get(currentIndex);
        currentIndex++;
        return result;
    }
}
