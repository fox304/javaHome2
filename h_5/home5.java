//Дан массив целых чисел. Найти сумму элементов, у которых последняя и предпоследняя цифры равны.

package home_task_2.h_5;

public class home5 {
    public static void main(String[] args){
        String str;
        int sum = 0;
        int [] arr = {3456,3274,344,811,398485,675767,66,88,101};                   // данный массив
        System.out.println(
            "Сумму элементов, у которых последняя и предпоследняя цифры данного массива равны :");
        for (int i = 0; i < arr.length; i++) {
            str = Integer.toString(arr[i]);                                         // преобразуем к строке
            if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)){      // сравниваем 2 последних значения
                if (sum == 0) System.out.printf("  %d ",arr[i]);            // печать при сумме 0
                else System.out.printf(" + %d ",arr[i]);                    // остальной вывод
                sum += arr[i];
            }
        }
        System.out.printf(" = %d",sum);  
    }
}
