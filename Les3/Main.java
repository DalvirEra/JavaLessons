
// Реализовать алгоритм сортировки слиянием

public class Main {
    public static void main(String[] args) {
        int[] a2 = new int[] {4,5,6,1,7,2,8,3,9};        

        System.out.println("Входной массив:");
        for (int i : a2) {
            System.out.print(i + " ");
        }

        Main sorter = new Main();
        a2 = sorter.SplitNSort(a2);
        
        System.out.println("");
        System.out.println("Итоговый массив:");
        for (int i : a2) {
            System.out.print(i + " ");
        }
    }

    private int[] SplitNSort(int[] a1){
        if (a1.length > 2){ // Когда больше двух элементов разбить на два массива
            int[] a3 = new int[a1.length/2];
            int[] a4 = new int[a1.length - a1.length/2];
            int[] a5 = new int[a1.length];
            System.arraycopy(a1, 0, a3, 0, a1.length/2); 
            //Тут мини-расчет для правильного деления пополам нечетных массивов
            int rest = a1.length%2 >0 ? a1.length - a1.length/2 -1 : a1.length - a1.length/2 ;
            System.arraycopy(a1, rest, a4, 0, a1.length - a1.length/2);

            //После рекурсии массивы будут отсортированы (из-за else в самом низу)
            a3 = SplitNSort(a3);
            a4 = SplitNSort(a4);

            //отсортированные массивы склеиваются вместе (сравнивает наименьшие (первые) элементы и выбирает наименьший и сдвигает дальше индекс этого массива)

            int i=0, j=0, k=0;
            while(i < a3.length && j < a4.length) {
                if (a3[i] < a4[j]){

                    a5[k] = a3[i];
                    k++;i++;
                }
                else{
                    a5[k++] = a4[j++];
                }
            }
            //если остались неиспользованные элементы а один из массивов закончился, просто закинь остаток второго в конец (он же отсортирован уже)
            if(i< a3.length) {
                System.arraycopy(a3, i, a5, k, a3.length - i);
              } else if(j< a4.length) {
                System.arraycopy(a4, j, a5, k, a4.length - j);
              }
            // верни отсоритированный массив
            return a5;
        }

        else { //Если два элемента массива отсортируй их
            if (a1.length > 1 && a1[0]>a1[1]){
                int temp = a1[0];
                a1[0] = a1[1];
                a1[1] = temp; 
            }
            //верни массив
            return a1;
        }
        
    }
}
