public class Anagram 
{
    public static boolean checkAnagram(String str1, String str2) 
    {
        int count1 = 0, count2 = 0;
        char c;
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == c)
                    count1++;
            }
            for (int k = 0; k < str1.length(); k++) {
                if (str2.charAt(k) == c)
                    count2++;
            }
            if (count1 != count2)
                return false;
            count1 = 0;
            count2 = 0;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = args[0];
        String str2 = args[1];
        System.out.println(checkAnagram(str1, str2));
    }
}