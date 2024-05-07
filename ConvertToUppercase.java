package logging;

public class ConvertToUppercase {

    public static void main(String[] args) {
        System.out.println("TC 1: " + tc1LowerCharacter());
        System.out.println("TC 2: " + tc2SpecialCharacterOrDigit());
        System.out.println("TC 3: " + tc3UpperCharacter());
        System.out.println("TC 4: " + tc4StringOfLowerCharacters());
        System.out.println("TC 5: " + tc5StringOfUpperCharacters());
        System.out.println("TC 6: " + tc6StringOfSpecialCharactersAndDigits());
        System.out.println("TC 7: " + tc7CombinationOfAllCharacters());
        System.out.println("TC 8: " + tc8Null());
    }

    //Method to convert lowercase characters to uppercase characters
    public static String convertToUppercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                result += (char) (str.charAt(i) - 32);
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //Method for testcase1: Passing a lower character
    public static boolean tc1LowerCharacter() {
        String input = "a";
        String expected = "A";
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

    //Method for testcase2: Passing a special character or a digit
    public static boolean tc2SpecialCharacterOrDigit() {
        String input = "*";
        String expected = "*";
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

    //Method for testcase3: Passing upper character
    public static boolean tc3UpperCharacter() {
        String input = "A";
        String expected = "A";
        String result = convertToUppercase(input);
        return result.equals(input);
    }

    //Method for testcase4: Passing a string of lower characters
    public static boolean tc4StringOfLowerCharacters() {
        String input = "abcdef";
        String expected = "ABCDEF";
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

    //Method for testcase5: Passing a string of capital characters
    public static boolean tc5StringOfUpperCharacters() {
        String input = "ABCDEF";
        String expected = "ABCDEF";
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

    //Method for testcase6: Passing a string of special characters and digits
    public static boolean tc6StringOfSpecialCharactersAndDigits() {
        String input = "!@#$%1";
        String expected = "!@#$%1";
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

    //Method for testcase7: Passing a combination of lower, upper, special characters & digits
    public static boolean tc7CombinationOfAllCharacters() {
        String input = "abAB!@12";
        String expected = "ABAB!@12";
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

    //Method for testcase8: Passing null
    public static boolean tc8Null() {
        String input = null;
        String expected = null;
        String result = convertToUppercase(input);
        return result.equals(expected);
    }

}
