import java.util.ArrayList;
import java.util.Scanner;

public class work {
    static void main() {
        Scanner input =new Scanner(System.in);
        ArrayList<Delivery> deliveries = new ArrayList<>();
        String again = "yes";
        while (again.equals("yes")) {
            System.out.print("How many deliveries: ");
            int enter = input.nextInt();
            if (enter >= 1 && enter <= 100){

                for (int i = 1; i <= enter; i++){
                    System.out.print("Delivery "+ i + " type (R/E) : ");
                    String type = input.next();
                    while (!type.equalsIgnoreCase("R") && !type.equalsIgnoreCase("E")){
                        System.out.print("Delivery "+ i + " type (R/E) : ");
                        type = input.next();
                    }
                    System.out.print("Delivery "+ i + " distance (KM) : ");
                    int distance = input.nextInt();
                    System.out.print("Delivery "+ i + " weight (Kg) : ");
                    int weight = input.nextInt();
                    if (type.equalsIgnoreCase("R")){
                        regularDelivery regular = new regularDelivery(distance,weight);
                        deliveries.add(regular);
                    }
                    else if (type.equalsIgnoreCase("E")) {
                        expressDelivery express = new expressDelivery(distance,weight);
                        deliveries.add(express);
                    }
                    else {
                        System.out.println("enter only R/E, try again.");
                    }

                }
            }

            System.out.print("enter yes or no to try again: ");
            again = input.next();
        }
        long totalFee = 0;
        System.out.println("==== Delivery Management ====");
        for (int i = 0; i < deliveries.size();i++){
            long fee = deliveries.get(i).CalculateFee();
            totalFee += fee;
            System.out.println("Delivery " + (i + 1) + " = " + fee + " units");
        }
        System.out.println("Total delivery fee: " + totalFee + " units");
    }
}
