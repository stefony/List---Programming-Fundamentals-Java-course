package List_1210_ok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P05_List_of_Products {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> text = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String product = scanner.nextLine();
            text.add(product);
        }
        Collections.sort(text);
        for (int i = 0; i <text.size() ; i++) {
            System.out.println(i+1 + "." + text.get(i));
        }

    }
}
