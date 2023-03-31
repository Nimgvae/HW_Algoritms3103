package HW_3103;
/*
Даны два целых числа x и n, напишите функцию для вычисления x^nO(lon n)
     решение 1 - рекурсивно O(n)
     решение 2 - улучшить решение 1 до O(lon n)
*/


import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 5;
        System.out.println(powA(a, b));
        System.out.println(powAsec(a,b));
    }
    public static int powA(int a, int b){
        if(b ==0) return 1;
        return powA(a,b-1)*a;

    }
    public static int powAsec (int a, int b) throws Exception {
        if(a==0){
            throw new Exception("NaN");
        }
        else if(b == 0){
            return 1;
        }
        return powAsec(a,b-1)*a;
    }
}
