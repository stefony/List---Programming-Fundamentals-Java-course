package List_1210_ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_Merging_Lists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> numberOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> numberTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List <Integer> numberThree = new ArrayList<>();
        int min = Math.min(numberOne.size(),numberTwo.size());
        for (int i = 0; i < min ; i++) {
            int firstInt= numberOne.get(i);
            int secondInt = numberTwo.get(i);

            numberThree.add(firstInt);
            numberThree.add(secondInt);
        }
        if (numberOne.size()>numberTwo.size()){
            numberThree.addAll(numberOne.subList(min,numberOne.size()));

        }else if (numberTwo.size()>numberOne.size()){
            numberThree.addAll(numberTwo.subList(min,numberTwo.size()));
        }
        System.out.println(numberThree.toString().replaceAll("[\\[\\],]", "" ));
    }

}
