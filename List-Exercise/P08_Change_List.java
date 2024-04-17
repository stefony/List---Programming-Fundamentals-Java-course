package List_1410_ok;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_Change_List {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String comand = scanner.nextLine();
        while (!comand.equals("end")){

            if (comand.contains("Delete ")){
                int numberToRemove = Integer.parseInt(comand.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberToRemove));
            }else if (comand.contains("Insert")){
                int element =Integer.parseInt(comand.split(" ")[1]);
                int index = Integer.parseInt(comand.split(" ")[2]);
                    numbers.add(index,element);
            }

            comand= scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number +" ");

        }



    }
}
