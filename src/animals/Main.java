package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<Animals> animals = new ArrayList<>();
        while (true) {
            String input = console.readLine();
            if ("Beast!".equals(input)) {
                break;
            }
            String[] secondInput = console.readLine().split("\\s+");
            String name = secondInput[0];
            int age = Integer.parseInt(secondInput[1]);
            String gender = secondInput[2];

            try {
                switch (input) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animals.add(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animals.add(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animals.add(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age, gender);
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age, gender);
                        animals.add(tomcat);
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        for (Animals animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
