package animals;

public class Dog extends Animals {
    Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "BauBau";
    }

    @Override
    public String toString() {
        return "Dog" + System.lineSeparator() +
                super.name + " " + super.age + " " + super.gender + System.lineSeparator() +
                produceSound();
    }
}
