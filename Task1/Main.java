package Task1;
import java.util.Scanner;

// Задание №1

public class Main {

    public static void main(String[] args)
    {
        int a, b, c;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число a :");
        a = next.nextInt();
        System.out.println("Введите число b :");
        b = next.nextInt();
        c = remainder(a, b);
        System.out.println("Remainder = " + c);
    }

    static int remainder(int a, int b)
    {
        int result = a % b;
        return result;
    }
}

// Задание №2

/*public class Main {

    public static void main(String[] args)
    {
        int a, b;
        float c;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите основание треугольника :");
        a = next.nextInt();
        System.out.println("Введите высоту треугольника :");
        b = next.nextInt();
        c = triangle(a, b);
        System.out.println("Площадь равна = " + c);
    }

    static float triangle(int a, int b)
    {
        float result = 1/2f * a * b;
        return result;
    }
}*/

// Задание №3

/*public class Main {

    public static void main(String[] args)
    {
        int a, b, c, d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите количество куриц :");
        a = next.nextInt();
        System.out.println("Введите количество коров :");
        b = next.nextInt();
        System.out.println("Введите количество свиней :");
        c = next.nextInt();
        d = foot(a, b, c);
        System.out.println("Площадь равна = " + d);
    }

    static int foot(int a, int b, int c)
    {
        int result = a * 2 + b * 4 + c * 4;
        return result;
    }
}*/

// Задание № 4

/*public class Main {

    public static void main(String[] args)
    {
        float a, b, c;
        boolean d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите prob :");
        a = next.nextFloat();
        System.out.println("Введите prize :");
        b = next.nextFloat();
        System.out.println("Введите pay :");
        c = next.nextFloat();
        d = equation(a, b, c);
        System.out.println(d);
    }

    static boolean equation(float prob, float prize, float pay)
    {
        if (prob * prize > pay)
            return true;
        else return false;
    }
}*/

// Задание №5

/*public class Main {

    public static void main(String[] args)
    {
        int a, b, c;
        String d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число N :");
        a = next.nextInt();
        System.out.println("Введите число а :");
        b = next.nextInt();
        System.out.println("Введите число b :");
        c = next.nextInt();
        d = equation(a, b, c);
        System.out.println(d);
    }

    static String equation(int N, int a, int b)
    {
        if (a + b == N)
            return "сложить";
        else if (a - b == N)
            return "вычесть";
        else if (a * b == N)
            return "умножить";
        else if (a / b == N)
            return "разделить";
        else
            return "none";
    }
}*/

// Задание №6

/*
public class Main {

    public static void main(String[] args)
    {
        char a;
        int d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите символ :");
        a = next.next().charAt(0);
        d = ASCII(a);
        System.out.println(d);
    }

    static int ASCII(char a)
    {
        return (int)a;
    }
}*/

// Задание №7

/*
public class Main {

    public static void main(String[] args)
    {
        int a, b;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число :");
        a = next.nextInt();
        b = sum(a);
        System.out.println("Ответ : " + b);
    }

    static int sum(int a)
    {
        int rez = 0;
        for (int i = 0; i <= a; i++)
        {
            rez = rez + i;
        }
        return rez;
    }
}*/

// Задание №8

/*public class Main {

    public static void main(String[] args)
    {
        int a, b, d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите длину первой стороны :");
        a = next.nextInt();
        System.out.println("Введите длину второй стороны :");
        b = next.nextInt();
        d = triangle(a, b);
        System.out.println("Максимальное значение третьего ребра = " + d);
    }

    static int triangle(int a, int b)
    {
        int result = a + b - 1;
        return result;
    }
}*/

// Задание № 9

/*public class Main {

    public static void main(String[] args)
    {
        int a, b, d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите длину массива :");
        a = next.nextInt();
        int mas[] = new int[a];
        for (int i = 0; i < a; i++)
        {
            System.out.println("Введите "+ (i+1) +" элемент массива : ");
            mas[i] = next.nextInt();
        }
        d = sum(mas);
        System.out.println("Сумма кубов массива = " + d);
    }

    static int sum(int mas[])
    {
        int sum = 0;
        for (int i = 0; i < mas.length; i++)
            sum += mas[i] * mas[i] * mas[i];
        return sum;
    }
}*/

// Задание №10
/*public class Main {

    public static void main(String[] args)
    {
        int a, b, c;
        boolean d;
        Scanner next = new Scanner(System.in);
        System.out.println("Введите число a :");
        a = next.nextInt();
        System.out.println("Введите число b :");
        b = next.nextInt();
        System.out.println("Введите число c :");
        c = next.nextInt();
        d = equation(a, b, c);
        System.out.println(d);
    }

    static boolean equation(int a, int b, int c)
    {
        for (int i = 1; i <= b ; i++)
            a += a;
        return a % c == 0;
    }
}*/
