//Дана последовательность N целых чисел. 
//Найти количество положительных чисел, после которых следует отрицательное число.

package home_task_2.h_1;

import java.util.Scanner;

public class home1 {
    
    public static void main(String[] args) {
        int a = 0,c = 0,n = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину последовательности ");
        n = sc.nextInt();
        System.out.print("Введите элемент последовательности номер 1: ");
        a = sc.nextInt();
        
        for (int i = 2; i <= n; i++) {
            System.out.printf("Введите элемент последовательности номер %s :",i);
            b = sc.nextInt();
            
            if (a >= 0 && b < 0) c++;
            a = b;

            } 
            sc.close();          
        System.out.printf("Кол-во положительных чисел, после которых следует отрицательное число равно %s",c);
    }
}
