package List_1410_ok;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String comand = scanner.nextLine();

        while (!comand.equals("end")){

            String[]commonandData = comand.split(" ");

        if (commonandData[0].equals("Add")){
            int addNumber = Integer.parseInt(commonandData[1]);
            wagons.add(addNumber);
        }else {
            int passengerToAdd = Integer.parseInt(commonandData[0]);
            for (int index = 0; index < wagons.size(); index++) {
                int currentWagon = wagons.get(index);

                if (currentWagon + passengerToAdd<=maxCapacity){
                wagons.set(index,currentWagon + passengerToAdd);
                break;
                }

            }
        }
            comand= scanner.nextLine();
        }
        for (int wagon: wagons) {
            System.out.print(wagon + " ");
        }
    }
}

