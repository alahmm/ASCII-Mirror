package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void Printer (List<String> list1) {
        List<String> list2 = new ArrayList<>(list1);
        String longestString = list2.get(0);
        for (String s : list2) {
            if (s.length() > list2.get(0).length()) {
                longestString = s;
                list2.set(0, s);
            }
        }
        for (String variable : list1
        ) {
            if (variable.length() != longestString.length()) {
                String padded = String.format("%-" + longestString.length() + "s", variable);
                System.out.println(padded + " | " + padded);
            } else {
                System.out.println(variable + " | " + variable);

            }
        }
    }
    public static void Reader(String path1) throws FileNotFoundException {
        List<String> list1 = new ArrayList<>();
        File file = new File(path1);
        Scanner scannerReader = new Scanner(file);
        while (scannerReader.hasNext()) {
            String input2 = scannerReader.nextLine();
            list1.add(input2);
        }
        Printer(list1);
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String path1 = "C:\\ASCII_Animals\\MooFolder\\Cow.txt";
        String path2 = "C:\\ASCII_Animals\\HumphFolder\\Camel.txt";
        String path3 = "./test/example3.txt";
        String path4 = "./test/example4.txt";
        String path5 = "./test/example5.txt";
        if (input.equals(path1)) {
            Reader(path1);
        } else if (input.equals(path2)) {
            Reader(path2);
        } else if (input.equals(path3)) {
            Reader(path3);
        } else if (input.equals(path4)) {
            Reader(path4);
        } else if (input.equals(path5)) {
            Reader(path5);
        } else {
            System.out.println("File not found!");
        }

    }
}
