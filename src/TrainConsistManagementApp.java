import java.util.*;

 class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println(" Train Consist Management App ");

        List<String> passengerBogies = new ArrayList<>();


        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");


        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        System.out.println("Final Bogie List: " + passengerBogies);
    }
}