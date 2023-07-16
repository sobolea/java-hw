// 2) Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.util.logging.Logger;

public class task2 {
    public static void main(String[] args) {
        int [] array = {11, 3, 14, 16, 7};
        System.out.println(bubleSorted(array));
    }
    static String bubleSorted(int[] mas) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
            Logger log = Logger.getLogger(task2.class.getName());
            log.info(Arrays.toString(mas));
        }
        return Arrays.toString(mas);
    }
}
