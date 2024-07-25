import java.util.Scanner;

public class _02_StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("String Operations Menu:");
            System.out.println("1. Concatenate Strings");
            System.out.println("2. Find Length of a String");
            System.out.println("3. Convert to Uppercase and Lowercase");
            System.out.println("4. Extract Substring");
            System.out.println("5. Split a Sentence");
            System.out.println("6. Reverse a String");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Concatenated String: " + str1 + str2);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String strLength = scanner.nextLine();
                    System.out.println("Length of the string: " + strLength.length());
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    String strCase = scanner.nextLine();
                    System.out.println("Uppercase: " + strCase.toUpperCase());
                    System.out.println("Lowercase: " + strCase.toLowerCase());
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    String strSub = scanner.nextLine();
                    System.out.print("Enter the starting index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter the ending index: ");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    if (startIndex >= 0 && endIndex <= strSub.length() && startIndex < endIndex) {
                        System.out.println("Substring: " + strSub.substring(startIndex, endIndex));
                    } else {
                        System.out.println("Invalid indices.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a sentence: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.split(" ");
                    System.out.println("Words in the sentence:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    String strRev = scanner.nextLine();
                    String reversedString = new StringBuilder(strRev).reverse().toString();
                    System.out.println("Reversed String: " + reversedString);
                    break;
                case 7:
                    continueProgram = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-7).");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
