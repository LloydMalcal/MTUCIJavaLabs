package Task6;

import java.util.Arrays;

//1. Число Белла - это количество способов, которыми массив из n элементов может
//быть разбит на непустые подмножества. Создайте функцию, которая принимает
//число n и возвращает соответствующее число Белла.

public class Main {

    public static void main(String[] args)
    {
        System.out.println(bell(3));
    }

    public static int bell(int num)
    {
        int[][] mass = new int[num + 1][num + 1];
        int sum = 0;
        mass[0][0] = 1;
        mass[num][num] = 1;
        int i;
        for(i = 1; i <= num; ++i)
        {
            for(int j = 1; j < num; ++j)
            {
                mass[i][j] = mass[i - 1][j - 1] + j * mass[i - 1][j];
            }
        }
        for(i = 0; i <= num; ++i) {
            sum += mass[num][i];
        }
        return sum;
    }
}

//2. В «поросячей латыни» (свинский латинский) есть два очень простых правила:
//– Если слово начинается с согласного, переместите первую букву (буквы) слова до
//гласного до конца слова и добавьте «ay» в конец.
//have ➞ avehay
//cram ➞ amcray
//take ➞ aketay
//cat ➞ atcay
//shrimp ➞ impshray
//trebuchet ➞ ebuchettray
//– Если слово начинается с гласной, добавьте "yay" в конце слова.
//ate ➞ ateyay
//apple ➞ appleyay
//oaken ➞ oakenyay
//eagle ➞ eagleyay
//Напишите две функции, чтобы сделать переводчик с английского на свинский латинский.
//Первая функция translateWord (word) получает слово на английском и возвращает это
//слово, переведенное на латинский язык. Вторая функция translateSentence (предложение)
//берет английское предложение и возвращает это предложение, переведенное на латинский
//язык.

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(translateWord("trebuchet"));
        System.out.println(translateSentence("I like to eat honey waffles."));
    }

    public static String translateWord(String word) {
        if (word.matches("[aeiouy]")) {
            word = word + "yay";
        } else {
            String newWord = word.split("[aeiouy]")[0];
            String var = word.replaceFirst(newWord, "");
            word = var + newWord + "ay";
        }
        return word;
    }

    public static String translateSentence(String word) {
        String vow = "aeiouyAEIOUY";
        String[] newword = word.substring(0, word.length() - 1).split(" ");
        word = "";

        for(int i = 0; i < newword.length; ++i) {
            int j = 0;
            if (j < vow.length()) {
                if (vow.indexOf(newword[i].charAt(j)) != -1) {
                    word = word + newword[i] + "yay ";
                } else {
                    String newWord = newword[i].split("[aeiyouAEIYOU]")[0];
                    word = word + newword[i].replaceFirst(newWord, "") + newWord + "ay ";
                }
            }
        }
        return word + ".";
    }
}*/

//3. Учитывая параметры RGB (A) CSS, определите, является ли формат принимаемых
//значений допустимым или нет. Создайте функцию, которая принимает строку
//(например, " rgb(0, 0, 0)") и возвращает true, если ее формат правильный, в
//противном случае возвращает false.

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
    }

    public static boolean validColor(String rgb) {
        int num = rgb.indexOf(40);
        if (rgb.contains(" "))
        {
            return false;
        } else {
            String[] newrgb = rgb.substring(rgb.indexOf(40) + 1, rgb.indexOf(41)).split(",");
            double[] n = new double[num];

            for(int i = 0; i < num; ++i) {
                n[i] = Double.parseDouble(newrgb[i]);
                System.out.println(newrgb[i]);
            }

            int i = 0;
            if (i < num) {
                return n[i] >= 0.0D && n[i] <= 255.0D && num == newrgb.length;
            } else {
                return false;
            }
        }
    }
}*/

//4. Создайте функцию, которая принимает URL (строку), удаляет дублирующиеся
//параметры запроса и параметры, указанные во втором аргументе (который будет
//необязательным массивом).

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));
    }

    public static String stripUrlParams (String url, String ... paramsToStrip) {
        String str = "";
        if (!url.contains("?"))
            return url;
        else {
            str = url.substring(url.indexOf("?") + 1);
            url = url.substring(0, url.indexOf("?") + 1);
        }
        char[] params = str.toCharArray();

        StringBuilder print = new StringBuilder();
        for (char param : params) {
            if (Character.isLetter(param))
                if (!(print.toString().contains(String.valueOf(param)))) {
                    if (paramsToStrip.length > 0) {
                        for (String arg : paramsToStrip) {
                            if (!(arg.contains(String.valueOf(param))))
                                print.append(str.substring(str.lastIndexOf(param), str.lastIndexOf(param) + 3)).append("&");
                        }
                    }
                    else
                        print.append(str.substring(str.lastIndexOf(param), str.lastIndexOf(param) + 3)).append("&");
                }
        }
        return url + print.substring(0, print.length()-1);
    }
}*/

//5. Напишите функцию, которая извлекает три самых длинных слова из заголовка
//газеты и преобразует их в хэштеги. Если несколько слов одинаковой длины,
//найдите слово, которое встречается первым

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(getHashTags("How the Avocado Became the Fruit of the Global Trade"));
    }

    public static String getHashTags(String str){
        String[] hashtags = new String[]{" ", " ", " "};
        StringBuilder buf = new StringBuilder();
        for (int i = 0 ; i<str.length();i++){
            if (str.charAt(i) != ' ')
                buf.append(str.charAt(i));
            else if (buf.length() > hashtags[0].length()) {
                hashtags[0] = buf.toString();
                buf = new StringBuilder();
            }
            else if (buf.length() > hashtags[1].length()) {
                hashtags[1] = buf.toString();
                buf = new StringBuilder();
            }
            else if (buf.length() > hashtags[2].length()) {
                hashtags[2] = buf.toString();
                buf = new StringBuilder();
            }
            else
                buf = new StringBuilder();
        }
        for (int i = 0; i < hashtags.length; i++)
        {
            hashtags[i] = "#" + hashtags[i].toLowerCase();
        }
        return Arrays.toString(hashtags);
    }
}*/

//6. Создайте функцию, которая принимает число n и возвращает n-е число в
//последовательности Улама.

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(ulam(9));
    }

    public static int ulam (int n)
    {
        int[] mas = new int[n];
        mas[0]=1;
        mas[1]=2;
        int len=2, next=3;
        while (next < Integer.MAX_VALUE && len < n)
        {
            int count =0;
            for (int i=0;i<len;i++)
            {
                for (int j=len-1; j>i; j--){
                    if (mas[i]+mas[j]==next && mas[i]!=mas[j])
                        count++;
                    else if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1)
            {
                mas[len]=next;
                len++;
            }
            next++;
        }
        return mas[n-1];
    }
}*/

//7. Напишите функцию, которая возвращает самую длинную неповторяющуюся
//подстроку для строкового ввода.

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(longestNonrepeatingSubstring("abcabcbb"));
    }

    public static String longestNonrepeatingSubstring(String str){
        String podstr = "";
        char [] mass = str.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c : mass)
        {
            if (!strBuilder.toString().contains(String.valueOf(c)))
                strBuilder.append(c);
            else {
                if (strBuilder.length() > podstr.length())
                    podstr = strBuilder.toString();
                strBuilder = new StringBuilder("" + c);
            }
        }
        str = strBuilder.toString();
        if (str.length()>podstr.length())
            podstr=str;
        return podstr;
    }
}*/

//8. Создайте функцию, которая принимает арабское число и преобразует его в римское
//число.

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(convertToRoman(12));
    }

    public static String convertToRoman (int num)
    {
        StringBuilder roman = new StringBuilder();
        if (num < 1)
            return "Введите число побольше. ";
        if (num > 3999)
            return "Введите число поменьше. ";
        while (num >= 1000) {
            roman.append("M");
            num -= 1000;        }
        while (num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }
        while (num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }
        while (num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }
        while (num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }
        while (num >= 9) {
            roman.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }
        while (num >= 4) {
            roman.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            roman.append("I");
            num -= 1;
        }
        return roman.toString();
    }
}*/

//9. Создайте функцию, которая принимает строку и возвращает true или false в
//зависимости от того, является ли формула правильной или нет.

/*public class Main {

    public static void main(String[] args)
    {
        System.out.println(formula("18 / 17 = 2"));
    }

    public static boolean formula(String formula){
        String[] mass = formula.split(" ");
        int ans = 0;
        int expectedResult = 0;
        if (!Character.isDigit(mass[0].charAt(0))) return false;
        else ans = Integer.parseInt(mass[0]);
        int i = 1;
        while (!mass[i].equals("="))
        {
            if (mass[i].equals("+")){
                ans += Integer.parseInt(mass[i + 1]);
            }
            if (mass[i].equals("-")){
                ans -= Integer.parseInt(mass[i + 1]);
            }
            if (mass[i].equals("*")){
                ans *= Integer.parseInt(mass[i + 1]);
            }
            if (mass[i].equals("/")){
                ans /= Integer.parseInt(mass[i + 1]);
            }
            i += 2;
        }
        i = formula.indexOf('=');
        String check = formula.substring(i + 1, formula.length());
        if (check.contains("=")) return false;
        else expectedResult = Integer.parseInt(mass[mass.length - 1]);
        return ans == expectedResult;
    }
}*/

//10. Создайте функцию, которая возвращает значение true, если само число является
//палиндромом или любой из его потомков вплоть до 2 цифр (однозначное число -
//тривиально палиндром).

/*
public class Main {

    public static void main(String[] args)
    {
        System.out.println(palindromedescendant(11211230));
    }

    public static boolean palindromedescendant(int num){
        boolean bul = false;
        StringBuffer num1 =new StringBuffer(num);
        StringBuffer num2 =new StringBuffer(num);
        if (num1.length()%2!=0)
            return false;
        else{
            while (!bul){
                if(num1 != num1.reverse()){
                    for(int i=0; i<num1.length();i+=2){
                        int a = Integer.parseInt(String.valueOf(num1.charAt(i)));
                        int b = Integer.parseInt(String.valueOf(num1.charAt(i+1)));
                        num2.append(a+b);
                    }
                }
                else
                    bul = true;
            }
        }
        return bul;
    }
}*/
