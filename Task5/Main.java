package Task5;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
// 1. Пришло время отправлять и получать секретные сообщения.
//Создайте две функции, которые принимают строку и массив и возвращают
//закодированное или декодированное сообщение.
//Первая буква строки или первый элемент массива представляет собой символьный код
//этой буквы. Следующие элементы-это различия между символами: например, A +3 --> C
//или z -1 --> y.

public class Main {

    public static void main(String[] args) {
        System.out.println(encrypt("Hello"));
        int[] mas = new int[]{72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(dycrypt(mas));
    }

    public static String encrypt(String str) {
        int[] mass = new int[str.length()];
        for (int i = 0; i < str.length(); ++i) {
            if (i == 0) {
                mass[i] = str.charAt(i);
            } else {
                mass[i] += str.charAt(i) - str.charAt(i - 1);
            }
        }
        return Arrays.toString(mass);
    }

    public static String dycrypt(int[] mass) {
        char[] str = new char[mass.length];
        for (int i = 0; i < mass.length; ++i) {
            if (i == 0) {
                str[i] = (char) mass[i];
            } else {
                str[i] = (char) (mass[i - 1] + mass[i]);
                mass[i] += mass[i - 1];
            }
        }
        return new String(str);
    }
}

//2. Создайте функцию, которая принимает имя шахматной фигуры, ее положение и
//целевую позицию. Функция должна возвращать true, если фигура может двигаться
//к цели, и false, если она не может этого сделать

/*
public class Main {

    public static void main(String[] args) {
        System.out.println(canMove("Rook", "A8", "H8"));
    }

    public static boolean canMove(String name, String start, String end) {
        char start1 = start.charAt(0);
        int start2 = Integer.parseInt(String.valueOf(start.charAt(1)));
        char end1 = end.charAt(0);
        int end2 = Integer.parseInt(String.valueOf(end.charAt(1)));
        if (start1 == end1 && start2 == end2) {
            return false;
        }
        else {
            byte var8 = -1;
            switch(name.hashCode()) {
                case -2042963283:
                    if (name.equals("Knight")) {
                        var8 = 1;
                    }
                    break;
                case 2338743:
                    if (name.equals("King")) {
                        var8 = 5;
                    }
                    break;
                case 2480296:
                    if (name.equals("Pawn")) {
                        var8 = 0;
                    }
                    break;
                case 2553081:
                    if (name.equals("Rook")) {
                        var8 = 3;
                    }
                    break;
                case 78391050:
                    if (name.equals("Queen")) {
                        var8 = 4;
                    }
                    break;
                case 1990023133:
                    if (name.equals("Bishop")) {
                        var8 = 2;
                    }
            }

            switch(var8) {
                case 0:
                    if (start1 == end1 && start2 == 2 && end2 == 4) {
                        return true;
                    }
                    return start1 == end1 && end2 == start2 + 1;
                case 1:
                    return Math.abs(start1 - end1) == 2 && Math.abs(start2 - end2) == 1 || Math.abs(start1 - end1) == 1 && Math.abs(start2 - end2) == 2;
                case 2:
                    return Math.abs(start1 - end1) == Math.abs(start2 - end2);
                case 3:
                    return start1 == end1 && start2 != end2 || start1 != end1 && start2 == end2;
                case 4:
                    if ((start1 != end1 || start2 == end2) && (start1 == end1 || start2 != end2))
                    {
                        if (Math.abs(start1 - end1) == Math.abs(start2 - end2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                case 5:
                    return Math.abs(start1 - end1) < 2 && Math.abs(start2 - end2) < 2;
                default:
                    return false;
            }
        }
    }
}*/

//3. Входная строка может быть завершена, если можно добавить дополнительные
//буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову.
//Кроме того, порядок букв во входной строке должен быть таким же, как и порядок
//букв в последнем слове.
//Создайте функцию, которая, учитывая входную строку, определяет, может ли слово быть
//завершено.

/*
public class Main {

    public static void main(String[] args) {
        System.out.println(canComplite("buthl", "beautiful"));
    }

public static boolean canComplite(String str1, String str2) {
        char[] massstr1 = str1.toCharArray();
        int num = 0;
        char[] var4 = massstr1;
        int var5 = massstr1.length;

        for(int var6 = 0; var6 < var5; ++var6) {
        char c = var4[var6];
        if (str2.indexOf(String.valueOf(c), num) == -1) {
        return false;
        }
        num = str2.indexOf(String.valueOf(c), num) + 1;
        }
        return true;
        }
}*/

//4. Создайте функцию, которая принимает числа в качестве аргументов, складывает их
//вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной
//всего в 1 цифру.

/*
public class Main {

    public static void main(String[] args) {
        int[] var = new int[]{16,28};
        System.out.println(sumDigProd(var));
    }

    public static int sumDigProd(int[] mass) {
        int sum = 0;
        int[] var = mass;
        int len = mass.length;
        for(int i = 0; i < len; ++i) {
            int value = var[i];
            sum += value;
        }
        while(sum > 9) {
            int mult;
            for(mult = 1; sum > 0; sum /= 10) {
                mult *= sum % 10;
            }
            sum = mult;
        }
        return sum;
    }
}*/

//5. Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в
//любом порядке и / или количестве), что и первое слово, включая первое слово.

/*
public class Main {

    public static void main(String[] args) {
        String[] var1 = new String[]{"toe", "ocelot", "maniac"};;
        System.out.println(sameVowelGroup(var1));
    }

    public static String sameVowelGroup(String[] str) {
        String vowel = "aeiouyAEIOUY";
        StringBuilder first = new StringBuilder();
        String second = "";
        ArrayList<String> words = new ArrayList();
        Collections.addAll(words, str);

        int i;
        for(i = 0; i < ((String)words.get(0)).length(); ++i) {
            if (vowel.indexOf(((String)words.get(0)).charAt(i)) != -1) {
                first.append(((String)words.get(0)).charAt(i));
            }
        }

        for(i = words.size() - 1; i >= 0; --i) {
            int k;
            for(k = 0; k < ((String)words.get(i)).length(); ++k) {
                if (vowel.indexOf(((String)words.get(i)).charAt(k)) != -1) {
                    second = second + ((String)words.get(i)).charAt(k);
                }
            }

            k = 0;
            while(k < second.length()) {
                if (first.toString().indexOf(second.charAt(k)) != -1) {
                    ++k;
                } else {
                    words.remove(i);
                    second = "";
                }
            }
        }
        return String.valueOf(words);
    }
}*/

//6. . Создайте функцию, которая принимает число в качестве аргумента и возвращает
//true, если это число является действительным номером кредитной карты, а в
//противном случае-false.
/*Номера кредитных карт должны быть длиной от 14 до 19 цифр и проходить тест Луна,
        описанный ниже:
        – Удалите последнюю цифру (это"контрольная цифра").
        – Переверните число.
        – Удвойте значение каждой цифры в нечетных позициях. Если удвоенное значение имеет
        более 1 цифры, сложите цифры вместе (например, 8 x 2 = 16 ➞ 1 + 6 = 7).
        – Добавьте все цифры.
        – Вычтите последнюю цифру суммы (из шага 4) из 10. Результат должен быть равен
        контрольной цифре из Шага 1.*/



/*
public class Main {

    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
    }

    public static boolean validateCard(long cardNum) {
        String str = "";
        if (Long.toString(cardNum).length() >= 14 && Long.toString(cardNum).length() <= 19) {
            long lastNum = cardNum % 10L;
            StringBuffer cardNumStr = new StringBuffer(Long.toString(cardNum /= 10L));
            cardNumStr.reverse();
            int sum;
            int c;
            for(sum = 0; sum < cardNumStr.length(); ++sum) {
                if (sum % 2 == 0) {
                    c = Character.getNumericValue(cardNumStr.charAt(sum)) * 2;
                    if (c > 9) {
                        String buf = Integer.toString(c);
                        str = str + (Character.getNumericValue(buf.charAt(0)) + Character.getNumericValue(buf.charAt(1)));
                    } else {
                        str = str + c;
                    }
                } else {
                    str = str + cardNumStr.charAt(sum);
                }
            }
            System.out.println(str);
            sum = 0;
            for(c = 0; c < str.length(); ++c) {
                sum += Character.getNumericValue(str.charAt(c));
            }
            System.out.println(sum);
            System.out.println(lastNum);
            if (lastNum == (long)(10 - sum % 10)) {
                return true;
            }
        }
        return false;
    }
}*/

//7. Напишите функцию, которая принимает положительное целое число от 0 до 999
//включительно и возвращает строковое представление этого целого числа,
//написанное на английском языке.
//Тоже самое нужно сделать и для русского языка.

/*
public class Main {

    public static void main(String[] args) {
        System.out.println(numToEng(108));
        System.out.println(numToRus(108));
    }

    public static String numToEng(int num) {
        String strnum = "";
        if (num == 0) {
            return "zero";
        } else {
            switch(num / 100) {
                case 1:
                    strnum = strnum + "one hundred ";
                    break;
                case 2:
                    strnum = strnum + "two hundred ";
                    break;
                case 3:
                    strnum = strnum + "three hundred ";
                    break;
                case 4:
                    strnum = strnum + "four hundred ";
                    break;
                case 5:
                    strnum = strnum + "five hundred ";
                    break;
                case 6:
                    strnum = strnum + "six hundred ";
                    break;
                case 7:
                    strnum = strnum + "seven hundred ";
                    break;
                case 8:
                    strnum = strnum + "eight hundred ";
                    break;
                case 9:
                    strnum = strnum + "nine hundred ";
            }

            switch(num / 10 % 10) {
                case 1:
                    switch(num % 10) {
                        case 0:
                            strnum = strnum + "ten";
                            return strnum;
                        case 1:
                            strnum = strnum + "eleven";
                            return strnum;
                        case 2:
                            strnum = strnum + "twelve";
                            return strnum;
                        case 3:
                            strnum = strnum + "thirteen";
                            return strnum;
                        case 4:
                            strnum = strnum + "fourteen";
                            return strnum;
                        case 5:
                            strnum = strnum + "fifteen";
                            return strnum;
                        case 6:
                            strnum = strnum + "sixteen";
                            return strnum;
                        case 7:
                            strnum = strnum + "seventeen";
                            return strnum;
                        case 8:
                            strnum = strnum + "eighteen";
                            return strnum;
                        case 9:
                            strnum = strnum + "nineteen";
                            return strnum;
                    }
                case 2:
                    strnum = strnum + "twenty ";
                    break;
                case 3:
                    strnum = strnum + "thirty ";
                    break;
                case 4:
                    strnum = strnum + "forty ";
                    break;
                case 5:
                    strnum = strnum + "fifty ";
                    break;
                case 6:
                    strnum = strnum + "sixty ";
                    break;
                case 7:
                    strnum = strnum + "seventy ";
                    break;
                case 8:
                    strnum = strnum + "eighty ";
                    break;
                case 9:
                    strnum = strnum + "ninety ";
            }

            switch(num % 10) {
                case 1:
                    strnum = strnum + "one";
                    break;
                case 2:
                    strnum = strnum + "two";
                    break;
                case 3:
                    strnum = strnum + "three";
                    break;
                case 4:
                    strnum = strnum + "four";
                    break;
                case 5:
                    strnum = strnum + "five";
                    break;
                case 6:
                    strnum = strnum + "six";
                    break;
                case 7:
                    strnum = strnum + "seven";
                    break;
                case 8:
                    strnum = strnum + "eight";
                    break;
                case 9:
                    strnum = strnum + "nine";
            }

            return strnum;
        }
    }

    public static String numToRus(int num) {
        String strnum = "";
        if (num == 0) {
            return "ноль";
        } else {
            switch(num / 100) {
                case 1:
                    strnum = strnum + "сто ";
                    break;
                case 2:
                    strnum = strnum + "двести ";
                    break;
                case 3:
                    strnum = strnum + "триста ";
                    break;
                case 4:
                    strnum = strnum + "четыреста ";
                    break;
                case 5:
                    strnum = strnum + "пятьсот ";
                    break;
                case 6:
                    strnum = strnum + "шестьсот ";
                    break;
                case 7:
                    strnum = strnum + "семьсот ";
                    break;
                case 8:
                    strnum = strnum + "восемьсот ";
                    break;
                case 9:
                    strnum = strnum + "девятьсот ";
            }

            switch(num / 10 % 10) {
                case 1:
                    switch(num % 10) {
                        case 0:
                            strnum = strnum + "десять";
                            return strnum;
                        case 1:
                            strnum = strnum + "одиннадцать";
                            return strnum;
                        case 2:
                            strnum = strnum + "двенадцать";
                            return strnum;
                        case 3:
                            strnum = strnum + "тринадцать";
                            return strnum;
                        case 4:
                            strnum = strnum + "четырнадцать";
                            return strnum;
                        case 5:
                            strnum = strnum + "пятнадцать";
                            return strnum;
                        case 6:
                            strnum = strnum + "шестнадцать";
                            return strnum;
                        case 7:
                            strnum = strnum + "семнадцать";
                            return strnum;
                        case 8:
                            strnum = strnum + "восемьнадцать";
                            return strnum;
                        case 9:
                            strnum = strnum + "двадцать";
                            return strnum;
                    }
                case 2:
                    strnum = strnum + "двадцать ";
                    break;
                case 3:
                    strnum = strnum + "тридцать ";
                    break;
                case 4:
                    strnum = strnum + "сорок ";
                    break;
                case 5:
                    strnum = strnum + "пятьдесят ";
                    break;
                case 6:
                    strnum = strnum + "шестьдесят ";
                    break;
                case 7:
                    strnum = strnum + "семьдесят ";
                    break;
                case 8:
                    strnum = strnum + "восемьдесят ";
                    break;
                case 9:
                    strnum = strnum + "девяносто ";
            }

            switch(num % 10) {
                case 1:
                    strnum = strnum + "один";
                    break;
                case 2:
                    strnum = strnum + "два";
                    break;
                case 3:
                    strnum = strnum + "три";
                    break;
                case 4:
                    strnum = strnum + "четыре";
                    break;
                case 5:
                    strnum = strnum + "пять";
                    break;
                case 6:
                    strnum = strnum + "шесть";
                    break;
                case 7:
                    strnum = strnum + "семь";
                    break;
                case 8:
                    strnum = strnum + "восемь";
                    break;
                case 9:
                    strnum = strnum + "девять";
            }

            return strnum;
        }
    }
}*/

//8. Хеш-алгоритмы легко сделать одним способом, но по существу невозможно
//сделать наоборот. Например, если вы хешируете что-то простое, например,
//password123, это даст вам длинный код, уникальный для этого слова или фразы. В
//идеале, нет способа сделать это в обратном порядке. Вы не можете взять хеш-код и
//вернуться к слову или фразе, с которых вы начали.
//Создайте функцию, которая возвращает безопасный хеш SHA-256 для данной строки.
//Хеш должен быть отформатирован в виде шестнадцатеричной цифры.

/*
public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(getSha256Hash("password123"));
    }

    public static String getSha256Hash(String str) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] text = digest.digest(str.getBytes(StandardCharsets.UTF_8));
        return HexBin.encode(text).toLowerCase();
    }
}*/

//9. Напишите функцию, которая принимает строку и возвращает строку с правильным
//регистром для заголовков символов в серии "Игра престолов".
//Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь
//первый символ в верхнем регистре, а остальные-в Нижнем.

/*
public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }

    public static String correctTitle(String title) {
        String[] text = title.toLowerCase().split(" ");
        title = "";
        String pos = "";

        for(int i = 0; i < text.length; ++i) {
            while(text[i].contains("-")) {
                pos = pos + text[i].indexOf("-") + " ";
                String var10002 = text[i].substring(0, text[i].indexOf("-"));
                text[i] = var10002 + " " + text[i].substring(text[i].indexOf("-") + 1);
                System.out.println(text[i].substring(text[i].indexOf("-") + 1));
            }

            if (!text[i].equals("in") && !text[i].equals("of") && !text[i].equals("and") && !text[i].equals("the")) {
                title = title + text[i].substring(0, 1).toUpperCase() + text[i].substring(1) + " ";
            } else {
                title = title + text[i].toLowerCase() + " ";
            }
        }

        return title;
    }
}*/

//10. Как указано в онлайн-энциклопедии целочисленных последовательностей:
//Гексагональная решетка - это привычная двумерная решетка, в которой каждая точка
//имеет 6 соседей.

/*public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(haxLattice(19));
    }

    public static String haxLattice(int n) {
        int num = 1;
        int i = 1;
        String res = "";

        for(; n > num; num = 3 * i * (i - 1) + 1) {
            ++i;
        }

        int l = i;
        if (n != num) {
            res = "invalid";
            return res;
        } else {
            int b;
            while(l < i * 2 - 1) {
                for(b = 0; b < i * 2 - 1 - l; ++b) {
                    res = res + "  ";
                }

                for(b = 0; b < l; ++b) {
                    res = res + " o  ";
                }

                res = res + "\n";
                ++l;
            }

            while(l >= i) {
                for(b = 0; b < i * 2 - 1 - l; ++b) {
                    res = res + "  ";
                }

                for(b = l; b > 0; --b) {
                    res = res + " o  ";
                }

                res = res + "\n";
                --l;
            }

            return res;
        }
    }
}*/

