package HW_3103;

/*
Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.

 */

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int[] arr3 = addArr(arr,arr2);
        arr3= sortArr(arr3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Какой элемент массива желаете?: ");
        int k = sc.nextInt()-1;
        System.out.println(arr3[k]);
        System.out.println(Arrays.toString(arr3));
        sc.close();
    }
    public static int[] addArr(int[]arr,int[] arr2){
        //int temp =(arr.length<arr2.length)?arr.length:arr2.length;
        int[] arr3 = new int[arr.length + arr2.length];
        for(int i =0;i<arr.length;i++){
            arr3[i]=arr[i];
        }
        int a=0;
        for(int y=arr.length;y<arr3.length;y++){
            arr3[y]=arr2[a];
            a++;
        }
        return arr3;
    }
    public static int[] sortArr(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j = arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
}
