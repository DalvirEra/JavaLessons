import java.util.*;
import java.util.Map.Entry;


//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
// Map содержащий ключ-имя и Map номеров с ID и номером. 
// Не делал проверок на ввод не того типа данных ибо долго
// удалять тоже нельзя, потому что мяу, вот почему.  

public class Main {
    public static void main(String[] args) {
        Map<String,Map> Book = new HashMap<String,Map>();
        Scanner in = new Scanner(System.in);
        int action = 0;
        while (action != 3){
            System.out.println();
            System.out.println("1 - add ");
            System.out.println("2 - print book ");
            System.out.println("3 - exit ");
            action = Integer.parseInt(in.nextLine());
            switch (action) {
                case 1:
                // Не проверяю впринципе на наличие номера, хочешь добавить - добавляй хоть сто одинаковых.
                    System.out.println("Enter a person ");
                    String name = in.nextLine();
                    System.out.println("-"+name);
                    if (Book.containsKey(name)){
                        // добавить еще номер со след. ID
                        System.out.println("Adding a new number ");
                        System.out.println("Enter a number ");
                        int num = Integer.parseInt(in.nextLine());
                        Book.get(name).put(Book.get(name).size()+1, num);
                    }
                    else {
                        // добавить первый номер с ID 1
                        System.out.println("Enter a number ");
                        int num = Integer.parseInt(in.nextLine());
                        Map<Integer,Integer> number = new HashMap<Integer,Integer>();
                        number.put(1,num);
                        Book.put(name, number);
                    }
                    break;
                case 2:
                    for (Map.Entry<String, Map> item : Book.entrySet()) {
                        System.out.printf("Person: %s \n", item.getKey());
                        for (Object num : item.getValue().entrySet()){
                            System.out.println();
                            System.out.printf("ID: %s \n Number: %s \n", ((Entry<String, Map>) num).getKey() ,  ((Entry<String, Map>) num).getValue());
                        }
                    }
                    break;
                default:
                    action = 3;
                    break;
            }
        }


    }
}