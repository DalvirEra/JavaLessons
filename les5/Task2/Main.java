import java.util.*;


//Пусть дан список сотрудников
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


public class Main {
    public static void main(String[] args) {
        ArrayList<String> Persons = new ArrayList<String>();
        Persons.add("Иван Иванов");
        Persons.add("Кристина Белова");
        Persons.add("Анна Мусина");
        Persons.add("Анна Крутова");
        Persons.add("Иван Юрин");
        Persons.add("Петр Лыков");
        Persons.add("Павел Чернов");
        Persons.add("Иван Иванов");
        Persons.add("Петр Чернышов");
        Persons.add("Мария Федорова");
        Persons.add("Марина Светлова");
        Persons.add("Мария Савина");
        Persons.add("Иван Иванов");
        Persons.add("Мария Рыкова");
        Persons.add("Анна Крутова");
        Persons.add("Марина Лугова");
        Persons.add("Анна Владимирова");
        Persons.add("Петр Лыков");
        Persons.add("Иван Мечников");
        Persons.add("Петр Петин");
        Persons.add("Петр Лыков");
        Persons.add("Иван Ежов");
        Persons.add("Светлана Петрова");
        HashMap<String,Integer> Counter = new HashMap<>();
        for (String string : Persons) {
            String name = string.split(" ")[0];
            if (Counter.containsKey(name)){
                Counter.put(name,Counter.get(name)+1);
            }
            else{
                Counter.put(name,1);
            }
        }
        Counter.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
    }
}