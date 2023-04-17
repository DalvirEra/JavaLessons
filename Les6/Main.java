import java.util.*;
import Tasks.Laptop;

// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - бренд
// 2 -цвет
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// СПОЙЛЕР:

// 1) создаете класс ноутбук (equals, hashCode)
// 2) создаете сет ноутбукоа
// 3) создаете и заполняете Map<Integer, Laptop>
// 4) запрашиваете через сканнер у пользователя критерий фильтрации
// 5) циклом проходите по Map.Entry<Integer, Laptop> entry: entries
// 6) В результирующий Set<Laptop> складываете ноутбуки entry.getValue() у которых
// равны критерию пользователя

public class Main {
    public static void main(String[] args) {
        Map<Integer,Laptop> ListOfTops = new HashMap<>();
        Laptop Lap1 = new Laptop("Samsung", "Black", 9999);
        Laptop Lap2 = new Laptop("Apple", "Black", 666);
        Laptop Lap3 = new Laptop("Samsung", "White", 100);
        Laptop Lap4 = new Laptop("Samsung", "Green", 3462);
        ListOfTops.put(1, Lap1);
        ListOfTops.put(2, Lap2);
        ListOfTops.put(3, Lap3);
        ListOfTops.put(4, Lap4);

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter filter criteria: ");
        System.out.println("1 - Brand ");
        System.out.println("2 - Color ");
        System.out.println("3 - PowerRating ");
        System.out.println("4 - exit ");

        // PowerRating - условно мощность
        // Показывает просто >= введенной мощности
        // не парился с реальным отображением информации о каждом ноутбуке в итоге, просто вывожу set

        int action = 0;
        while (action != 4){
            action = Integer.parseInt(in.nextLine());
            Set<Laptop> ShowList = new HashSet<Laptop>();
            switch (action){
                case 1:
                    System.out.println("Please enter criteria: ");
                    String Seeked = in.nextLine(); // Samsung 
                    for (Map.Entry<Integer,Laptop> Lap : ListOfTops.entrySet()) {
                        System.out.println(Lap.getValue().GetBrand());
                        if (Lap.getValue().GetBrand().equals(Seeked)){
                            ShowList.add(Lap.getValue());
                        }
                    }
                    System.out.println(ShowList);
                    break;
                case 2:
                    System.out.println("Please enter criteria: ");
                    String Seeked2 = in.nextLine();
                    for (Map.Entry<Integer,Laptop> Lap : ListOfTops.entrySet()) {
                        if (Lap.getValue().GetColor().equals(Seeked2)){
                            ShowList.add(Lap.getValue());
                        }
                    }
                    System.out.println(ShowList);
                    break;
                case 3:
                    System.out.println("Please enter criteria: ");
                    int Seeked3 = Integer.parseInt(in.nextLine());
                    for (Map.Entry<Integer,Laptop> Lap : ListOfTops.entrySet()) {
                        if (Lap.getValue().GetPowerRating() >= Seeked3){
                            ShowList.add(Lap.getValue());
                        }
                    }
                    System.out.println(ShowList);
                    break;
                default:
                    action = 4;
            }
        }

    }
}