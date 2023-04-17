package Tasks;

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

public class Laptop {
    private String Brand;
    private String Color;
    private int PowerRating;

    public Laptop(String Brand, String Color, int PowerRating){
        this.Brand = Brand;
        this.Color = Color;
        this.PowerRating = PowerRating;
    }

    public String GetBrand(){
        return Brand;
    }
    public String GetColor(){
        return Color;
    }
    public int GetPowerRating(){
        return PowerRating;
    }
    
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false; 
        Laptop lap = (Laptop) o;
        if (this.Brand == lap.Brand && this.Color == lap.Color && this.PowerRating == lap.PowerRating){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int hash = Brand == null ? 0: Brand.hashCode();
        hash = hash + (Color == null ? 0: Color.hashCode());
        hash = hash + PowerRating;
        return hash;
    }
}
