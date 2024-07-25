import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class _03_FileOperations {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("File Operations Menu:");
            System.out.println("1. Create a new directory");
            System.out.println("2. Create a new text file and write content to it");
            System.out.println("3. Read the content from an existing text file");
            System.out.println("4. Append new content to an existing text file");
            System.out.println("5. Copy the content from one text file to another");
            System.out.println("6. Delete a text file");
            System.out.println("7. List all files and directories in a given directory");
            System.out.println("8. Search for a specific file in a directory and its subdirectories");
            System.out.println("9. Rename a file");
            System.out.println("10. Get information about a file");
            System.out.println("11. Exit");
            System.out.print("Choose an option (1-11): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    createDirectory();
                    break;
                case 2:
                    createAndWriteFile();
                    break;
                case 3:
                    readFile();
                    break;
                case 4:
                    appendToFile();
                    break;
                case 5:
                    copyFile();
                    break;
                case 6:
                    deleteFile();
                    break;
                case 7:
                    listFilesInDirectory();
                    break;
                case 8:
                    searchFile();
                    break;
                case 9:
                    renameFile();
                    break;
                case 10:
                    getFileInformation();
                    break;
                case 11:
                    continueProgram = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-11).");
                    break;
            }

            System.out.println();
        }
    }

    private static void createDirectory() {
        System.out.print("Enter the path for the new directory: ");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);
        if (dir.mkdirs()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create directory. It may already exist.");
        }
    }

    private static void createAndWriteFile() {
        System.out.print("Enter the path for the new text file: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter the content to write to the file: ");
        String content = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    private static void readFile() {
        System.out.print("Enter the path of the text file to read: ");
        String filePath = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Content of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    private static void appendToFile() {
        System.out.print("Enter the path of the text file to append to: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter the content to append to the file: ");
        String content = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }

    private static void copyFile() {
        System.out.print("Enter the source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter the destination file path: ");
        String destinationPath = scanner.nextLine();
        try {
            Files.copy(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }

    private static void deleteFile() {
        System.out.print("Enter the path of the text file to delete: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file. It may not exist.");
        }
    }

    private static void listFilesInDirectory() {
        System.out.print("Enter the path of the directory: ");
        String dirPath = scanner.nextLine();
        File dir = new File(dirPath);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null && files.length > 0) {
                System.out.println("Files and directories in " + dirPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The directory does not exist.");
        }
    }

    private static void searchFile() {
        System.out.print("Enter the directory path to search in: ");
        String dirPath = scanner.nextLine();
        System.out.print("Enter the name of the file to search for: ");
        String fileName = scanner.nextLine();
        File dir = new File(dirPath);
        if (dir.exists() && dir.isDirectory()) {
            try {
                boolean found = Files.walk(Paths.get(dirPath))
                        .filter(p -> p.getFileName().toString().equals(fileName))
                        .peek(p -> System.out.println("File found: " + p.toString()))
                        .findFirst()
                        .isPresent();
                if (!found) {
                    System.out.println("File not found.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while searching for the file: " + e.getMessage());
            }
        } else {
            System.out.println("The directory does not exist.");
        }
    }

    private static void renameFile() {
        System.out.print("Enter the current file path: ");
        String currentPath = scanner.nextLine();
        System.out.print("Enter the new file name: ");
        String newName = scanner.nextLine();
        File file = new File(currentPath);
        File newFile = new File(file.getParent(), newName);
        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }

    private static void getFileInformation() {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Last modified: " + sdf.format(file.lastModified()));
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
