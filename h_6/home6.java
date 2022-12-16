//Дан массив целых чисел. 
// Заменить отрицательные элементы на сумму индексов двузначных элементов массива

package home_task_2.h_6;

import java.util.ArrayList;

public class home6 {
    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        int [] arr = {23,4567,-3,6,123,-12,34,900,-9,345,65,47};      // данный массив
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && (arr[i] > 9 && arr[i] < 100)) sum += i;  // выборка двузначных положительных чисел и их сумма
        }
        for (int i : arr) {
            if (i > 0) {
                array.add(i);
            }
            else array.add(sum);
        }
        System.out.println(array);
    }
}
