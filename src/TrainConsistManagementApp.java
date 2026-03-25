import java.util.*;

class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        train.add(2, "Pantry");

        System.out.println("After adding Pantry: " + train);

        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train Consist: " + train);
    }
}