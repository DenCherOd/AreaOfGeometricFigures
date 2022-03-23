package iterator;

public class Main {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {1, 3, 7},
                {2, 2, 3, 6}
        };
        Iterator iterator = new Iterator(arr);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
