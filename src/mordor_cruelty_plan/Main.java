package mordor_cruelty_plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] allFood = console.readLine().split("\\s+");

        Gandalf gandalf = new Gandalf();
        for (String food : allFood) {
            gandalf.addFood(food);
        }

        System.out.println(gandalf);
    }
}
