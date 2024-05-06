package logging;

public class ToUppercase {
    public static void main(String[] args) {
        toUppercase('a');
        toUpperCaseString("Shashank");
        toUppercase2('b');
    }

    //Method to convert Lowercase character to Uppercase character
    public static void toUppercase(char str) {
        if (isLetter(str) && isLower(str)) {
            System.out.println((char) (str - 32));
        } else {
            System.out.println("Pass a lower case character");
        }
    }

    //Method to convert Lowercase string to Uppercase string
    public static void toUpperCaseString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isLetter(str.charAt(i)) && isLower(str.charAt(i))) {
                System.out.print((char) (str.charAt(i) - 32));
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    //Another Method to convert Lowercase character to Uppercase character(by converting chat to string)
    public static void toUppercase2(char str) {
        if (isLower(str) && isLetter(str)) {
            System.out.println(Character.toString(str).toUpperCase());
        } else {
            System.out.println("pass lower case letter");
        }
    }

    //Method to check a input is a letter
    public static boolean isLetter(char str) {
        if (str >= 97 && str <= 122 || str >= 65 && str <= 90) {
            return true;
        }
        return false;
    }

    //Method to check charcater is lower or not
    public static boolean isLower(char str) {
        if (str >= 97 && str <= 122) {
            return true;
        }
        return false;
    }
}
