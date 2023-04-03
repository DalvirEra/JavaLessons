package Tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task1 {
    private static final Logger LOG = Log.log(Tasks.Task1.class.getName());

    public static void BubbleSorter(int[] array) {

        try (FileWriter in = new FileWriter("task1.txt")) {
            int temp = 0;
            String Logmsg;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > array[i]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    Logmsg = Arrays.toString(array);
                    LOG.log(Level.INFO, Logmsg);
                }
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
