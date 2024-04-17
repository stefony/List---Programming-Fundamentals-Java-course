package List_1210_ok;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_Remove_Negatives_and_Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(e -> e<0);
        Collections.reverse(numbers);
        if (numbers.size()==0){
            System.out.println("empty");
        }else {
            System.out.print(numbers.toString().replaceAll("[\\[\\],]",  ""));
        }


    }
}
