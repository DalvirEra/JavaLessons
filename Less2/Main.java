import Tasks.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[]{3,2,11,4,5,1,13,8,7};
        Task1.BubbleSorter(array);
        Task2.Parser("Tasks/TaskFile.json");
    }
}