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
        for (int i = 0; i < list1.size(); i++
        ) {
            if (list1.get(i).length() != longestString.length() && ConverterOfString(list1).get(i).length() != longestString.length()) {
                String padded = String.format("%-" + longestString.length() + "s", list1.get(i));
                String padded2 = String.format("%" + longestString.length() + "s", ConverterOfString(list1).get(i));
                System.out.println(padded + " | " + padded2);
            } else {
                System.out.println(list1.get(i) + " | " + ConverterOfString(list1).get(i));
            }
        }
    }
    public static char[] ConverterOfChar(char[] listOfChar) {
        for (int i = 0; i < listOfChar.length; i++) {
            if (listOfChar[i] == '<') {
                listOfChar[i] = '>';
            } else if (listOfChar[i] == '>') {
                listOfChar[i] = '<';
            } else if (listOfChar[i] == '[') {
                listOfChar[i] = ']';
            } else if (listOfChar[i] == ']') {
                listOfChar[i] = '[';
            } else if (listOfChar[i] == '{') {
                listOfChar[i] = '}';
            } else if (listOfChar[i] == '}') {
                listOfChar[i] = '{';
            } else if (listOfChar[i] == '(') {
                listOfChar[i] = ')';
            } else if (listOfChar[i] == ')') {
                listOfChar[i] = '(';
            } else if (listOfChar[i] == '/') {
                listOfChar[i] = '\\';
            } else if (listOfChar[i] == '\\') {
                listOfChar[i] = '/';
            }
        }
        return listOfChar;
    }
    public static List<String> ConverterOfString(List<String> list1) {
        List<String> list = new ArrayList<>();
        for (String variable : list1
             ) {
            char[] listOfChar = variable.toCharArray();
            List<Character> arrayList = new ArrayList<>();
            for (int i = 0; i < listOfChar.length; i++) {
                arrayList.add(listOfChar[listOfChar.length - 1 - i]);
            }
            for (int i = 0; i < listOfChar.length; i++) {
                listOfChar[i] = arrayList.get(i);
            }
            list.add(String.valueOf(ConverterOfChar(listOfChar)));
        }
        return list;

        }
    public static void Reader(String path1) throws FileNotFoundException {
        List<String> list1 = new ArrayList<>();
        File file = new File(path1);
        Scanner scannerReader = new Scanner(file);
        while (scannerReader.hasNext()) {
            String input2 = scannerReader.nextLine();
            list1.add(input2);
        }
        ConverterOfString(list1);
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
