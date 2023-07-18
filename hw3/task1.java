package hw3;

import java.util.ArrayList;
import java.util.Scanner;

//   1.   Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
//   2.   Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.


public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = readList();
        for (Integer element : list) System.out.printf("%s ", element);
        System.out.println();
        delEven(list);
        System.out.println();
        System.out.printf("Minimal element is %s\n", findMin(list));
        System.out.printf("Maximum element is %s\n", findMax(list));
        System.out.printf("Middle element is %s\n", findSred(list));

    }
    static ArrayList<Integer> readList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input number of elements: ");
        String number = sc.nextLine();
        int n = Integer.parseInt(number);
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("input number:");
            String element = sc.nextLine();
            int elem = Integer.parseInt(element);
            list.add(elem);
        }
        sc.close();
        return list;
    }

    static void delEven(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) newList.add(list.get(i));
        }
        for (Integer elem : newList) System.out.printf("%s ", elem);
    }
    
    static Integer findMin(ArrayList<Integer> list){
        int min = list.get(0);
        for (Integer element : list) {
            if(element < min) min = element;
        }
        return min;
    }

    static Integer findMax(ArrayList<Integer> list){
        int max = list.get(0);
        for (Integer element : list) {
            if(element > max) max = element;
        }
        return max;
    }

    static Float findSred(ArrayList<Integer> list){
        float sum = 0;
        int size = list.size();
        for (Integer element : list) sum += element;
        return sum / size;
    }
}

