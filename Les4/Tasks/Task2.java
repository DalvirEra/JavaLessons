// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() — помещает элемент в конец очереди,
// dequeue() — возвращает первый элемент из очереди и удаляет его,
// first() — возвращает первый элемент из очереди, не удаляя.

package Tasks;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Task2 {

    public static void enqueue() {
        Queue<String> queue = Task2.createQueue();
        queue.add("the end");
        System.out.println(queue);
    }

    public static void dequeue() {
        Deque<String> deque = Task2.createDeque();
        System.out.println(deque.removeFirst() + "returned first removed element"); 
    }

    public static void getFirst() {
        Deque<String> deque = Task2.createDeque();
        System.out.println(deque.getFirst() + "returned first element");
        System.out.println(deque + "without removing it");


    }


    public static Deque<String> createDeque() {
        Deque<String> deque = new LinkedList<>();
        deque.add("a");
        deque.add("b");
        deque.add("c");
        deque.add("d");
        System.out.println(deque);

        return deque;
    }

    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println(queue);

        return queue;
    }

}