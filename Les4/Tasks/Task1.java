// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.

package Tasks;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {

    public static void reverseList() {
        LinkedList<Integer> ll = createList();

        System.out.println("Reversed using Collections.reverse() method");
        Collections.reverse(ll);
        System.out.println(ll);
    }

    public static LinkedList<Integer> createList() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(2);
        ll.add(6);
        ll.add(1);
        System.out.println(ll);

        return ll;
    }
}