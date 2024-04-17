package List_1210_ok;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Gauss_Trick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < number.size()-1; i++) {
            int current = number.get(i);
            int next = number.get(number.size()-1);
            number.set(i,current+next);
            number.remove(number.size()-1);
        }
        for (int num:number) {
            System.out.print(num + " ");
        }
    }
}
