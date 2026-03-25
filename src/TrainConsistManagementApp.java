import java.util.*;

class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println(" Train Consist Management App ");

        Set<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        train.add("Sleeper");

        System.out.println("Train Formation: " + train);
    }
}