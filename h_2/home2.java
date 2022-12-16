// Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.
package home_task_2.h_2;

import java.util.Scanner;

public class home2 {

    private static final boolean Boolean = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, a1 = 0,a2 = 0,n = 1;
        System.out.print("Введите элемент последовательности номер 1: ");
        a1 = sc.nextInt();
        while (a1 != 0) {
            n++;
            System.out.printf("Введите элемент последовательности номер %s: ",n);
            a2 = sc.nextInt();
            if (a1 >= 0 && a2 < 0) sum += a1;
            a1 = a2;
        }
        sc.close();
        System.out.printf("Сумма положительных чисел, после которых следует отрицательное число равна %s",sum);
                 
        
    }
}
