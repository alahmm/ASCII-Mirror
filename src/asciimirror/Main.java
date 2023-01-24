package asciimirror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList(
                "            ^__^",
                "    _______/(oo)",
                "/\\/(       /(__)",
                "   | w----||     ",
                "   ||     ||     "));
        System.out.println(input);
        for (String variable : list
        ) {
            System.out.println(variable);
        }
    }
}
