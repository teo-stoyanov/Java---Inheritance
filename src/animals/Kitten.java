package animals;

public class Kitten extends Animals {
    Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Miau";
    }

    @Override
    public String toString() {
        return "Kitten" + System.lineSeparator() +
                super.name + " " + super.age + " " + super.gender + System.lineSeparator() +
                produceSound();
    }
}
