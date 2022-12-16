//Дана последовательность N целых чисел. Найти сумму простых чисел.

package home_task_2.h_3;
import java.util.Scanner;
public class home3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, a1 = 0,n = 0;
        Boolean isSimple = true;
        System.out.println("Введите длину последовательности ");
        n = sc.nextInt();
        for (int i = 1;i <= n; i++) {
            System.out.printf("Введите элемент последовательности номер %s: ",i);
            a1 = sc.nextInt();
            
            for (int index = 2; index < a1 / 2 + 1; index++) { // оптимизация до половины элементов
                if (a1 % index == 0){                         // проверка на простое число
                isSimple = false;   
                break;
                }
            }
            if (isSimple == true && a1 != 1) sum += a1; // исключаем 1 
            isSimple = true;
        }
        sc.close();
        System.out.printf("Сумма простых чисел в данной последовательности равна %s ",sum);      
    }
}
