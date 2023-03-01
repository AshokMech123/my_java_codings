/*
 * Write a java program to display only digits in an alpha numeric string
 * (Input:75#41 Output:7541)
 */
// import java.lang.reflect.Array;

// public class challenges3 {

// public static void main(String[] args) {
// String input = "421@$233";
// System.out.println(input);
// System.out.println(input.replaceAll("[!@#$%^&*()_+=-]", ""));

// }
// }

// /*
//  * write a program to convert given string onto uppercase and lowercase without
//  * using string method
//  */
// import java.util.Scanner;

// public class challenges3 {
//     public static void main(String[] args) {
//         System.out.println("Enter the string to using uppercase and lowercase: ");
//         Scanner str = new Scanner(System.in);
//         String st = str.nextLine();
//         System.out.println(st.toLowerCase());
//         System.out.println(st.toUpperCase());
//     }
// }

// /*
// * Write a program to print reverse a of a string word by word
// */
// public class challenges3 {
//     public static void main(String[] args) {
//         String str = "I am a developer";
//         String st[] = str.split(" ");
//         System.out.println(str);
//         for (int i = st.length - 1; i >= 0; i--) {
//             String stt = st[i];
//             System.out.print(stt);
//         }
//     }
// }

// /*
// * Write a program to print repeated characters from a given string
// */
// public class challenges3 {
//     public static void main(String[] args) {
//         String str = "Dharmapuri";
//         int in;
//         char string[] = str.toCharArray();
//         for (int i = 0; i < string.length; i++) {
//             in = 0;
//             for (int j = i + 1; j < string.length; j++) {
//                 if (string[i] == string[j] && string[i] != '0') {
//                     in++;
//                 }
//             }
//             if (in > 0 && string[i] != '0')
//                 System.out.println(string[i]);
//         }

//     }
// }

// /*
// * Java program to remove agiven word from a string
// */
// import java.io.*;
// import java.util.Scanner;

// public class challenges3 {
//     static void remove(String str, String word) {

//         String stt[] = str.split(" ");
//         String new_str = "";
//         for (String words : stt) {
//             if (!words.equals(word)) {
//                 new_str += words + " ";
//             }
//         }
//         System.out.println(new_str);
//     }

//     public static void main(String[] args) {
//         System.out.println("Enter the sentence: ");
//         Scanner given = new Scanner(System.in);
//         String str = given.nextLine();
//         System.out.println("Enter to remove the word of a sentence: ");
//         Scanner rm = new Scanner(System.in);
//         String word = rm.nextLine();
//         System.out.println(str);
//         remove(str, word);
//     }
// }

/*
 * Write a program to count number of vowels in a given string
 */
import java.io.*;

public class challenges3 {

    public static void main(String[] args) {
        String str = "Beautiful";
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total number of vowels in string are: " + count);
    }
}
