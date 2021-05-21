package Task2;
import java.util.Arrays;

import java.util.Scanner;

//1 Создайте функцию, которая повторяет каждый символ в строке n раз

public class Main {

    public static void main(String[] args)
    {
        String str;
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println("Введите количество повторений b :");
        n = next.nextInt();
        System.out.println(repeat(str, n));
    }

    public static String repeat(String str, int n)
    {
        String newWord = " ";
        for (int i = 0; i < str.length() ; i++)
        {
            for (int j = 0; j<n; j++){
                newWord+= str.charAt(i);
            }
        }
        return newWord;
    }
}

//Создайте функцию, которая принимает массив и возвращает разницу между
//самыми большими и самыми маленькими числами.


/*
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = next.nextInt();
        }
        System.out.println(differenceMaxMin(arr));
    }

    public static int differenceMaxMin(int[] mass) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : mass) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        return max - min;
    }
}*/

//Создайте функцию, которая принимает массив в качестве аргумента и возвращает
//true или false в зависимости от того, является ли среднее значение всех элементов
//массива целым числом или нет.

/*
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner next = new Scanner(System.in);
        System.out.println("Введите массив:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = next.nextInt();
        }
        System.out.println(isAvgWhole(arr));
    }

    public static boolean isAvgWhole(int mass[])
    {
        double sum=0;
        for (int value : mass)
        {
            sum += value;
        }
        if ((sum % mass.length) % 100 < 1)
            return true;
        else
            return false;

    }
}*/

//Создайте метод, который берет массив целых чисел и возвращает массив, в
//котором каждое целое число является суммой самого себя + всех предыдущих
//чисел в массиве.

/*
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        Scanner next = new Scanner(System.in);
        System.out.println("Введите массив:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = next.nextInt();
        }
        arr2 = cumulativeSum(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr2[i]);
        }
    }

    public static int[] cumulativeSum( int [] mass){

        for (int i = 1; i < mass.length; i++)
        {
            mass[i] = mass[i] + mass[i-1];
        }
        return mass;
    }
}*/

//Создайте функцию, которая возвращает число десятичных знаков, которое имеет
//число (заданное в виде строки). Любые нули после десятичной точки
//отсчитываются в сторону количества десятичных знаков.

/*
public class Main {

    public static void main(String[] args)
    {
        String str;
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println(getDecimalPlaces(str));
    }

    public static int getDecimalPlaces(String str)
    {
        if (str.indexOf(',')!= -1)
        {
            return str.length() - str.indexOf(',') - 1;
        }
        else
            return 0;
    }
}*/

//Создайте функцию, которая при заданном числе возвращает соответствующее
//число Фибоначчи.

/*
public class Main {

    public static void main(String[] args)
    {
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число :");
        n = next.nextInt();
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci (int n)
    {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }
}*/

//Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
//напишите функцию, чтобы определить, является ли вход действительным
//почтовым индексом. Действительный почтовый индекс выглядит следующим
//образом:
//– Должно содержать только цифры (не допускается использование нецифровых цифр).
//– Не должно содержать никаких пробелов.
//– Длина не должна превышать 5 цифр.

/*public class Main {

    public static void main(String[] args)
    {
        String str;
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String index){
        int buf = 0;
        for (int i = 0; i < index.length(); i++)
        {
            if (!Character.isDigit(index.charAt(i)))
                buf++;
            else if (index.charAt(i) == ' ')
                buf++;
            else if (index.length() > 5)
                buf++;
        }
        if (buf == 0) return true;
        else return false;
    }
}*/

//Пара строк образует странную пару, если оба из следующих условий истинны:
//– Первая буква 1-й строки = последняя буква 2-й строки.
//– Последняя буква 1-й строки = первая буква 2-й строки.
//– Создайте функцию, которая возвращает true, если пара строк представляет собой
//странную пару, и false в противном случае.

/*public class Main {

    public static void main(String[] args)
    {
        String str,str2;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите 1 строку :");
        str = next.nextLine();
        System.out.println("Введите 2 строку :");
        str2 = next.nextLine();
        System.out.println(isStrangePair(str,str2));
    }

    public static boolean isStrangePair (String word1, String word2)
    {
        return word1.charAt(0) == word2.charAt(word2.length() - 1) &&
                word2.charAt(0) == word1.charAt(word1.length() - 1);
    }
}*/

//Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
//– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
//– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
//– В противном случае верните false.

/*
public class Main {

    public static void main(String[] args)
    {
        String str,str2;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите 1 строку :");
        str = next.nextLine();
        System.out.println("Введите 2 строку :");
        str2 = next.nextLine();
        System.out.println(isPrefix(str,str2));
        System.out.println(isSuffix(str,str2));
    }

    public static boolean isPrefix(String word, String pref){
        pref =  pref.substring(0,  pref.length()-1);
        return word.startsWith(pref);
    }

    public static boolean isSuffix(String word, String suf){
        suf = suf.substring(1);
        return word.endsWith(suf);
    }

}*/

//Создайте функцию, которая принимает число (шаг) в качестве аргумента и
//возвращает количество полей на этом шаге последовательности.
//Шаг 0: начните с 0
//Шаг 1: Добавьте 3
//Шаг 2: Вычтите 1
//Повторите Шаги 1 И 2 ...

/*public class Main {

    public static void main(String[] args)
    {
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите шаг :");
        n = next.nextInt();
        System.out.println(boxSeq(n));
    }

    public static int boxSeq(int shag){
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++) {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }
}*/

