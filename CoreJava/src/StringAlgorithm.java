import java.util.SortedMap;

/**
 * created by James Vincent Escartin on 5/25/23
 **/
public class StringAlgorithm {

    public static void main(String[] args) {
        //Validation
        System.out.println(isUppercase("JAMES"));
        System.out.println(isUppercase("james"));

        //Validation with specific properties
        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("helo"));

        //normalizing string
        System.out.println(normalizedString("Hey there, Buddy!"));

        //Basic parsing and searching in strings
        String y = "HeLLo";
        System.out.println(y.contains("LL"));

        //Custome Parsing
        parseContents(y);
        System.out.println(isAtEvenIndex(y,'L'));

        //Reverse
        System.out.println(reverse("James"));

        //Reverse using built-in tools
        System.out.println(reverse2("James"));

        //Challenge
        sentenceReverse("Hello James");

    }

    public static boolean isUppercase(String s){
        return s.chars().allMatch(Character :: isUpperCase);
    }

    public static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character :: isUpperCase) &&
                s.chars().anyMatch(Character :: isLowerCase) &&
                s.chars().anyMatch(Character :: isDigit);
    }

    public static String normalizedString(String s){
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void parseContents(String s){
        System.out.println("=====Option 1=====");
        for(char c : s.toCharArray()){
            System.out.println(c);
        };
        System.out.println();
        System.out.println("=====Option 2 ======");
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    public static boolean isAtEvenIndex(String s, char item){
        if( s == null || s.isEmpty()){
            return false;
        }

        for(int i = 0; i < s.length() / 2 + 1; i += 2){
            if(s.charAt(i) == item){
                return true;
            }
        }
        return false;
    }

    public static String reverse(String s){
        if(s == null || s.isEmpty()){
            return s;
        }

        StringBuilder reversed = new StringBuilder();

        for(int i = s.length() - 1; i >=0; i--){
            reversed.append(s.charAt(i));
        }

        return reversed.toString();
    }

    public static String reverse2(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String reverseWord(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void sentenceReverse(String sentence){
        String[] words = sentence.split("\\s+");
        String[] reverseW = new String[words.length];

        for(int i = 0; i < words.length; i++){
            reverseW[i] = reverseWord(words[i]);
        }

        for(String word : reverseW){
            System.out.print(word + " ");
        }
    }

}
