package Task3;
import java.util.Scanner;
import java.util.Arrays;

//1 Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2 различных
//решения для действительных значений x. учитывая a, b и c, вы должны вернуть
//число решений в уравнение.

public class Main {

    public static void main(String[] args)
    {
        int a, b, c ;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите значение числа a :");
        a = next.nextInt();
        System.out.println("Введите значение числа b :");
        b = next.nextInt();
        System.out.println("Введите значение числа c :");
        c = next.nextInt();
        System.out.println("Количестов корней этого уравнения = " + solutions(a, b, c));
    }

    public static int solutions(int a, int b, int c)
    {
        int D=b*b-4*a*c;
        if (D>0)
            return 2;
        else if (D==0)
            return 1;
        else
            return 0;
    }
}


//2 Напишите функцию, которая возвращает позицию второго вхождения " zip " в
//строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
//быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
//произойти в строке.

/*
public class Main {

    public static void main(String[] args)
    {
        String str;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println(findZip(str));
    }

    public static int findZip(String str)
    {
        int n = -1;
        for (int i = 0; i < str.length() - 1; i++)
        {
            if (str.charAt(i) == 'z' && str.charAt(i+1) == 'i' && str.charAt(i+2) == 'p' && n == 1)
                n = i;
            if (str.charAt(i) == 'z' && str.charAt(i+1) == 'i' && str.charAt(i+2) == 'p' && n == -1)
                n = 1;
        }
        if (n == 1)
            n = -1;
        return n;
    }
}*/

//3 Создайте функцию, которая проверяет, является ли целое число совершенным
//числом или нет. Совершенное число - это число, которое можно записать как
//сумму его множителей, исключая само число.

/*public class Main {

    public static void main(String[] args)
    {
        int a;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число :");
        a = next.nextInt();
        if (checkPerfect(a) == true)
            System.out.println("Число является совершенным");
        else System.out.println("Число не является совершенным");
    }

    public static boolean checkPerfect(int a)
    {
        int sum=0;
        for (int i = 1; i < a - 1; i++)
        {
            if ( a % i == 0)
                sum += i;
        }
        if ( a == sum)
            return true;
        else return false;
    }
}*/

//4 Создайте функцию, которая принимает строку и возвращает новую строку с
//заменой ее первого и последнего символов, за исключением трех условий:
//– Если длина строки меньше двух, верните "несовместимо".".
//– Если первый и последний символы совпадают, верните "два-это пара.".

/*public class Main {

    public static void main(String[] args)
    {
        String str;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println(flipEndChars(str));
    }

    public static String flipEndChars(String str)
    {
        char [] buf;
        if( str.length() < 2)
            str = "Два - это пара";
        else if ( str.charAt(0) == str.charAt(str.length()-1))
        {
            str = "Несовместимо";
        }
        else
        {
            buf = str.toCharArray();
            buf[0] = str.charAt(str.length()-1);
            buf[str.length()-1] = str.charAt(0);
            str = new String (buf);
        }
        return str;
    }
}*/

//5 Создайте функцию, которая определяет, является ли строка допустимым
//шестнадцатеричным кодом.
//Шестнадцатеричный код должен начинаться с фунтового ключа # и иметь длину ровно 6
//символов. Каждый символ должен быть цифрой от 0-9 или буквенным символом от A-F.
//все буквенные символы могут быть прописными или строчными.

/*public class Main {

    public static void main(String[] args)
    {
        String str;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println(isValidHexCode(str));
    }

    public static boolean isValidHexCode(String str)
    {

        if (str.length() > 7) return false;

        else if (str.matches("#[a-fA-F0-9]+")) return true;

        else return false;
    }
}*/


//6 Напишите функцию, которая возвращает true, если два массива имеют одинаковое
//количество уникальных элементов, и false в противном случае.

/*
public class Main {

    public static void main(String[] args) {
        int n, n1;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите размер 1 массива:");
        n = next.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите массив:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = next.nextInt();
        }
        System.out.println("Введите размер 2 массива:");
        n1 = next.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Введите массив:");
        for (int i = 0; i < n1; i++)
        {
            arr1[i] = next.nextInt();
        }
        System.out.println(same(arr, arr1));
    }

    public static boolean same(int [] arr, int[] arr1)
    {
        int count = 0;
        int count1 = 0;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] != arr[i+1])
                count++;
        }
        for (int i = 0; i < arr1.length - 1; i++)
        {
            if (arr1[i] != arr1[i+1])
                count1++;
        }
        if (count == count1)
            return true;
        else return false;
    }
}*/

//7 Число Капрекара-это положительное целое число, которое после возведения в
//квадрат и разбиения на две лексикографические части равно сумме двух
//полученных новых чисел:
//– Если количество цифр квадратного числа четное, то левая и правая части будут иметь
//одинаковую длину.
//– Если количество цифр квадратного числа нечетно, то правая часть будет самой длинной
//половиной, а левая-самой маленькой или равной нулю, если количество цифр равно 1.
//– Учитывая положительное целое число n, реализуйте функцию, которая возвращает true,
//если это число Капрекара, и false, если это не так.

/*
public class Main {

    public static void main(String[] args)
    {
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число :");
        n = next.nextInt();
        System.out.println(isKaprekar(n));

    }

    public static boolean isKaprekar(int n)
    {
        int c = n * n;
        String nstr = String.valueOf(c);
        if (nstr.length() == 1)
            return n == c;
        else
            return Integer.parseInt(nstr.substring(0, nstr.length()/2)) + //преобразует строку в число, возвращает подстроку
                    Integer.parseInt(nstr.substring(nstr.length()/2)) == n;
    }

}*/

//8 Напишите функцию, которая возвращает самую длинную последовательность
//последовательных нулей в двоичной строке.

/*public class Main {

    public static void main(String[] args)
    {
        String str;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите строку :");
        str = next.nextLine();
        System.out.println(longestZero(str));
    }

    public static String longestZero(String n)
    {
        String sum = "";
        String count = "";
        for (int i = 0; i < n.length()-1; i++)
        {
            if(n.charAt(i) == '0')
                sum += "0";
            else {
                if (count.length() < sum.length())
                    count = sum;
                sum = "";
            }
        }
        if (count.length() < sum.length())
            count = sum;
        return count;
    }
}*/

//9 Если задано целое число, создайте функцию, которая возвращает следующее
//простое число. Если число простое, верните само число.

/*
public class Main {

    public static void main(String[] args)
    {
        int n;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число :");
        n = next.nextInt();
        System.out.println(nextPrime(n));

    }

    public static int nextPrime(int num)
    {
        while(true)
        {
            boolean check = true;
            for(int i = 2; i <= num/2; i++)
            {
                if (num % i == 0)
                {
                    num++;
                    check = false;
                }
            }
            if (check) break;
        }
        return num;
    }
}*/

//10 Учитывая три числа, x, y и z, определите, являются ли они ребрами
//прямоугольного треугольника.

/*
public class Main {

    public static void main(String[] args)
    {
        int x, y, z ;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите значение числа x :");
        x = next.nextInt();
        System.out.println("Введите значение числа y :");
        y = next.nextInt();
        System.out.println("Введите значение числа z :");
        z = next.nextInt();
        if (rigthTriangle(x, y, z) == true)
        System.out.println("Являются ребрами прямоугольного треугольника ");
        else
        System.out.println("Не являются ребрами прямоугольного треугольника ");
    }

    public static boolean rigthTriangle( int x, int y, int z)
    {
        if ( x == 0 || y == 0 || z == 0 )
            return false;
        return  ( x*x+y*y==z*z || x*x==y*y+z*z || x*x+z*z == y*y);

    }
}*/
