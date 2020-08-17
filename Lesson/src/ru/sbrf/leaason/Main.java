package ru.sbrf.leaason;
// todo: dsaf
public class Main {
    public static void main(String[] args) {
        String bob = "Хелло Боб";
        System.out.println(bob);
        byte a1 = 12;
        short b1 = 21;
        int a2 = 1;
        long b2 = 2;
        int a3 = 101;
        int b3 = 99;
        char i = 'X';
        char i1 = '6';

        System.out.println("Задание 4: "+sum(a1, b1));
        System.out.println("Задание 5: "+proizv(a2, b2));
        System.out.println("Задание 6: "+getMaxNumber(a3, b3));
        System.out.println("Задание 7: "+isCharA(i));
        System.out.println("Задание 8: "+isCharNumber(i1));
    }

    public static byte sum(byte a1, short b1) {
        byte c1 = (byte) (a1 + b1);
        return c1;
    }
    public static int proizv(int a2, long b2) {
        int c2 = (int) (a2 * b2);
        return c2;
    }
    public static int getMaxNumber(int a3, int b3) {
        return a3>b3? a3:b3;

    }
    public static boolean isCharA(char i) {
        return i=='A'? true:false;

    }
    public static boolean isCharNumber(char i1) {
        return Character.isDigit(i1);

    }
}