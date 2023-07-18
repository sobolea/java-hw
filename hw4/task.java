package hw4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//Задание
// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

public class task {
    public static void main(String[] args) {
        Deque<Integer> number1 = new LinkedList<>();
        Deque<Integer> number2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number: ");
        String number = sc.nextLine();
        Integer n = Integer.parseInt(number);
        for (int i = 0; i < number.length(); i++) {
            number1.addLast(n % 10);
            n /= 10;
        }

        System.out.println("input second number: ");
        number = sc.nextLine();
        n = Integer.parseInt(number);
        for (int i = 0; i < number.length(); i++) {
            number2.addLast(n % 10);
            n /= 10;
        }
        sc.close();

        // mult(number1, number2);
        summ(number1, number2);
    }

    static void mult(Deque<Integer> number1, Deque<Integer>  number2){
        int n1 = 0;
        int n2 = 0;
        int size =  number1.size();
        for (int i = 0; i < size; i++) {
            n1 +=  number1.getFirst() *(int) Math.pow(10, i);
            number1.removeFirst();
}                        

        size =  number2.size();
        for (int i = 0; i < size; i++) {
            n2 += number2.getFirst() *(int) Math.pow(10, i);
            number2.removeFirst();
}       
        int multn = n1 * n2;    
        size = Integer.toString(multn).length();
        LinkedList<Integer> multipl = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            multipl.addFirst(multn % 10);
            multn /= 10;
        }
        System.out.println(multipl);
    }

    static void summ(Deque<Integer> number1, Deque<Integer>  number2){
        int n1 = 0;
        int n2 = 0;
        int size =  number1.size();
        for (int i = 0; i < size; i++) {
            n1 +=  number1.getFirst() *(int) Math.pow(10, i);
            number1.removeFirst();
}                   
        size =  number2.size();
        for (int i = 0; i < size; i++) {
            n2 += number2.getFirst() *(int) Math.pow(10, i);
            number2.removeFirst();
}       
        int summn = n1 + n2;   
        size = Integer.toString(summn).length();
        LinkedList<Integer> summa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            summa.addFirst(summn % 10);
            summn /= 10;
        }
        System.out.println(summa);

    }
}