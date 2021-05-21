package Lab1;

public class Palindrome {
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            String s = args[i];
            if (isPalindrome(s))
                System.out.println(s + " - является палиндромом");
            else System.out.println(s + " - не является палиндромом");
        }
    }
    public static String reverseString(String s)
    {
        String str = "";
        for (int i = 0; i < s.length(); i++)
        {
            str = s.charAt(i) + str;
        }
        return str;
    }
    public static boolean isPalindrome(String s)
    {
        String str = reverseString(s);
        if (s.equals(str)) return true;
        else return false;
    }
}
