package Task4;
import java.io.PrintStream;
import java.util.*;

//1 Бесси работает над сочинением для своего класса писателей. Поскольку ее почерк
//довольно плох, она решает напечатать эссе с помощью текстового процессора.
//Эссе содержит N слов (1≤N≤100), разделенных пробелами. Каждое слово имеет
//длину от 1 до 15 символов включительно и состоит только из прописных или
//строчных букв. Согласно инструкции к заданию, эссе должно быть
//отформатировано очень специфическим образом: каждая строка должна содержать
//не более K (1≤K≤80) символов, не считая пробелов. К счастью, текстовый
//процессор Бесси может справиться с этим требованием, используя следующую
//стратегию:
//– Если Бесси набирает Слово, и это слово может поместиться в текущей строке, поместите
//его в эту строку. В противном случае поместите слово на следующую строку и
//продолжайте добавлять к этой строке. Конечно, последовательные слова в одной строке
//все равно должны быть разделены одним пробелом. В конце любой строки не должно
//быть места.
//– К сожалению, текстовый процессор Бесси только что сломался. Пожалуйста,
//помогите ей правильно оформить свое эссе!

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Bessy(10, 7, "hello my name is Bessie and this is my essay"));
    }
    public static String Bessy(int n, int k , String str)
    {
        String[] text = str.split(" "); //разделяет строку на массив до пробелов
        str = "";
        String finaltxt = "";
        for (int i = 0; i < n; i++)
        {
            if (str.length() + text[i].length() > k)
            {
                finaltxt = finaltxt.trim() + "\r\n" + text[i] + " "; //удаляет пробелы в начале и в конце строки
                str = text[i];
            } else
                {
                finaltxt += text[i] + " ";
                str += text[i];
                }
        }
        return finaltxt.trim();
    }
}

//2 Напишите функцию, которая группирует строку в кластер скобок. Каждый кластер
//должен быть сбалансирован

/*
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(split("((()))(())()()(()())")));
    }
    public static String[] split(String str)
    {
        List<String> list = new ArrayList();
        int f = 0;
        int i = 0;

        while(str.length() > 0)
        {
            if (str.charAt(i) == '(')
            {
                ++f;
            } else
                {
                --f;
                }

            if (f == 0)
            {
                list.add(str.substring(0, i + 1)); //добавление элемента в начало списка
                str = str.substring(i + 1);
                i = 0;
            } else {
                ++i;
            }
        }

        return (String[])list.toArray(new String[list.size()]);
    }
}*/

//3 Создайте две функции toCamelCase () и toSnakeCase (), каждая из которых берет
//одну строку и преобразует ее либо в camelCase, либо в snake_case.

/*
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toCamelCase("isModalOpen"));
    }
    public static String toCamelCase(String str)
    {
        for(int i = 0; i < str.length(); ++i)
        {
            if (str.charAt(i) == '_')
            {
                str = str.substring(0, i) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2, str.length()); //Извлекает подстроку
                // из данного экземпляра. Подстрока начинается с указанной позиции знака и имеет указанную длину.
            }
        }

        return str;
    }
}*/

//4  Напишите функцию, которая вычисляет сверхурочную работу и оплату, связанную
//с сверхурочной работой.
//Работа с 9 до 5: обычные часы работы
//После 5 вечера это сверхурочная работа
//Ваша функция получает массив с 4 значениями:
//– Начало рабочего дня, в десятичном формате, (24-часовая дневная нотация)
//– Конец рабочего дня. (Тот же формат)
//– Почасовая ставка
//– Множитель сверхурочных работ

/*
public class Main
{
    public static void main(String[] args)
    {
        double[] var = new double[]{16.0D, 18.0D, 30.0D, 1.8D};
        System.out.println(overTime(var));
    }
    public static String overTime(double[] work)
    {
        double sum = 0;
        if (17 - work[0] >= 0)
            sum += (17 - work[0]) * work[2];
        if (work[1] - 17 >= 0)
            sum += (work[1] - 17) * work[2] * work[3];
        return ('$' + String.valueOf(sum));
    }

}*/

//5 Индекс массы тела (ИМТ) определяется путем измерения вашего веса в
//килограммах и деления на квадрат вашего роста в метрах. Категории ИМТ таковы:
//Недостаточный вес: <18,5
//Нормальный вес: 18.5-24.9
//Избыточный вес: 25 и более
//Создайте функцию, которая будет принимать вес и рост (в килограммах, фунтах,
//метрах или дюймах) и возвращать ИМТ и связанную с ним категорию. Округлите
//ИМТ до ближайшей десятой.

/*
public class Main
{
    public static void main(String[] args)
    {
        String[] fat = new String[]{"55 kilos", "1.65 meters"};
        System.out.println(BMI(fat));
    }
    public static String BMI(String[] fat)
    {
        double ves = Double.parseDouble(fat[0].split(" ")[0]);
        double rost = Double.parseDouble(fat[1].split(" ")[0]);
        String out = " ";
        if (fat[0].contains("pounds"))
            ves = ves * 0.45;
        if (fat[1].contains("inches"))
            rost *= 0.0254;
        double BMI = Math.round((ves / (rost * rost)) * 10.0) / 10.0;
        if (BMI < 18.5)
            out = BMI + " Underweight";
        if (BMI >= 18.5 && BMI <= 24.9)
            out = BMI + " Normal weight";
        if (BMI > 25)
            out = BMI + " Overweight";
        return out;
    }
}*/


//6 Создайте функцию, которая принимает число и возвращает его мультипликативное
//постоянство, которое представляет собой количество раз, которое вы должны
//умножать цифры в num, пока не достигнете одной цифры.

/*
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(bugger(999));
    }
    public static int bugger(int num)
    {
    int count = 0;
    while (num > 9)
    {
        int chnum = 1;
        while (num > 0)
        {
            chnum *= num % 10;
            num /= 10;
        }
        num = chnum;
        count++;
    }
    return count;
    }
}*/

//7 Напишите функцию, которая преобразует строку в звездную стенографию. Если
//символ повторяется n раз, преобразуйте его в символ*n.

/*
public class Main {
    public static void main(String[] args) {
        System.out.println(toStarShorthand("77777geff"));
    }

    public static String toStarShorthand(String str) {
        int count = 0;
        char let = str.charAt(0);
        String newStr = "";

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != let) {
                if (count > 1) {
                    newStr = newStr + let + "*" + count;
                } else {
                    newStr = newStr + let;
                }

                let = str.charAt(i);
                count = 1;
            } else {
                ++count;
            }
        }

        if (count != 1) {
            newStr = newStr + let + "*" + count;
        } else {
            newStr = newStr + let;
        }

        return newStr;
    }
}*/

//8 Создайте функцию, которая возвращает true, если две строки рифмуются, и false в
//противном случае. Для целей этого упражнения две строки рифмуются, если
//последнее слово из каждого предложения содержит одни и те же гласные.

/*public class Main {
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
    }

    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.substring(str1.lastIndexOf(" ") + 1);
        str2 = str2.substring(str2.lastIndexOf(" ") + 1);
        String let = "aeiouyAEIOUY";
        String res1 = "";
        String res2 = "";
        int i;
        for(i = 0; i < str1.length(); ++i) {
            if (let.indexOf(str1.charAt(i)) != -1) {
                res1 = res1 + str1.charAt(i);
            }
        }

        for(i = 0; i < str2.length(); ++i) {
            if (let.indexOf(str2.charAt(i)) != -1) {
                res2 = res2 + str2.charAt(i);
            }
        }

        if (res1.toLowerCase().equals(res2.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}*/

//9 Создайте функцию, которая принимает два целых числа и возвращает true, если
//число повторяется три раза подряд в любом месте в num1 и то же самое число
//повторяется два раза подряд в num2.

/*public class Main {
    public static void main(String[] args) {
        System.out.println(trouble(666789L, 12345667L));
    }

    public static boolean trouble(long a, long b)
    {
        String aa = Long.toString(a);
        String bb = Long.toString(b);
        int num = 0;
        int i;
        for(i = 2; i < aa.length(); ++i)
        {
            if (aa.charAt(i) == aa.charAt(i - 1) && aa.charAt(i) == aa.charAt(i - 2))
            {
                num = aa.charAt(i);
            }
        }

        for(i = 0; i < bb.length(); ++i) {
            if (bb.charAt(i) == num && bb.charAt(i + 1) == num)
            {
                return true;
            }
        }
        return false;
    }
}*/

//10 Предположим, что пара одинаковых символов служит концами книги для всех
//символов между ними. Напишите функцию, которая возвращает общее количество
//уникальных символов (книг, так сказать) между всеми парами концов книги.

/*
public class Main {
    public static void main(String[] args)
    {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
    }

    public static int countUniqueBooks(String str, char c) {
        Map<Character, Integer> values = new HashMap();
        boolean start = true;

        for(int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == c && start) {
                ++i;

                for(; str.charAt(i) != c; ++i) {
                    Integer n = (Integer)values.get(str.charAt(i));
                    if (n == null) {
                        values.put(str.charAt(i), 1);
                    } else {
                        values.put(str.charAt(i), n + 1);
                    }
                }

                start = false;
            }

            if (str.charAt(i) == c) {
                start = true;
            }
        }

        return values.size();
    }
}*/
