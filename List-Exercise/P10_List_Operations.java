package List_1410_ok;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_List_Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String comand = scanner.nextLine();

        while (!comand.equals("End")){

            if (comand.contains("Add")){
                int addNumber = Integer.parseInt(comand.split("\\s+")[1]);
                    numbers.add(addNumber);
            }else if (comand.contains("Insert")){
                    int  insertNumber=Integer.parseInt(comand.split("\\s+")[1]);
                     int index =  Integer.parseInt(comand.split("\\s+")[2]);
                     if (isTrue(index,numbers)){
                         numbers.add(index,insertNumber);
                     }else {
                         System.out.println("Invalid index");
                     }

            }else if (comand.contains("Remove")){
                int indexRemove= Integer.parseInt(comand.split("\\s+")[1]);
                if (isTrue(indexRemove,numbers)) {
                    numbers.remove(indexRemove);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (comand.contains("Shift left")){
                int leftShift = Integer.parseInt(comand.split("\\s+")[2]);
                for (int times = 1; times <=leftShift ; times++) {
                int firstNumber = numbers.get(0);
                numbers.remove(0);
                numbers.add(firstNumber);
                }
            }else if (comand.contains("Shift right")){
                int rightShift = Integer.parseInt(comand.split("\\s+")[2]);
                for (int times = 1; times <=rightShift; times++) {
                    int lastNumber = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,lastNumber);
                }

            }

            comand= scanner.nextLine();
        }
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
    public static boolean isTrue(int index,List<Integer> numbers){

        return index>=0 && index<=numbers.size()-1;
    }

}
