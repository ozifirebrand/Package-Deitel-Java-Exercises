package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesManipulation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a new file or directory name");

        String pathUri = scanner.nextLine();
        Path path = takeInPathUri(pathUri);

        documentPathValues(path);
    }

    public static Path takeInPathUri(String pathUri){
        return Paths.get(pathUri);
    }

    public static void documentPathValues(Path path) throws IOException {
        if ( Files.exists(path) ){
            System.out.printf("%n%s exists %n", path.getFileName());
            System.out.printf("%s a directory %n", Files.isDirectory(path)?"Is": "Is not");
            System.out.printf("%s an absolute path %n", path.isAbsolute()?"Is": "Is not");
            System.out.printf("Was last modified in %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size is %d%n", Files.size(path));
            System.out.printf("Path is %s%n", path);
            System.out.printf("Absolute path is %s%n", path.toAbsolutePath());

            checkIfIsDirectory(path);

        }
        else System.out.printf("%s does not exist.%n", path);

    }

    private static void checkIfIsDirectory(Path path) throws IOException {
        if ( Files.isDirectory(path) ){
            System.out.printf("%nDirectory contents: %n");
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            for (Path p: directoryStream){
                System.out.println(p);
            }

        }
    }

}
