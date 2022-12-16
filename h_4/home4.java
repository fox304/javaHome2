//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

package home_task_2.h_4;

import java.util.Scanner;

public class home4 {
    public static void main(String[] args) {
        int temp = 0,n = 0, min = 0;
        Boolean whichOf = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину последовательности ");
        n = sc.nextInt();
        System.out.print("Введите элемент последовательности номер 1: ");
        min = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.printf("Введите элемент последовательности номер %s: ",i);
            temp = sc.nextInt();
            if (min < temp) min = temp;
            else whichOf = false;                         // проверка на возрастание
        }
        sc.close();
        if (whichOf) System.out.println("Это возрастающая последовательность ");
        else System.out.println("Эта последовательность не  является возрастающей ");
    }
}
