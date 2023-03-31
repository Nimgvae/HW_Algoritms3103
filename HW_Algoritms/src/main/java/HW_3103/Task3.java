package HW_3103;
/*
Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
arr[] = {1, 1, 2, 2, 2, 2, 3,}
x = 2
Вывод: 4 раза
*/

public class Task3 {
    public static void main(String[] args) {
       int arr[] = {1, 1, 2, 2, 2, 2, 3,7,8,9};
       int x=1;
       numRep(arr,x);
    }
    public static void numRep(int[] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
            else if(arr[i]>x){

                break;
            }
         }
        System.out.println(count);
    }
}


