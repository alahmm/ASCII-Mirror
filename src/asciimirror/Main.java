package asciimirror;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(Arrays.asList(
                "                    _______ ",
                "                   < hello >",
                "                    ------- ",
                "            ^__^   /        ",
                "    _______/(oo)  /         ",
                "/\\/(       /(__)            ",
                "   | w----||                ",
                "   ||     ||                "
        ));
        for (String variable : list
        ) {
            System.out.println(variable);
        }
    }
}
