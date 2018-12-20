package animals;

public class Frog extends Animals {
    Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
        return "Frogggg";
    }

    @Override
    public String toString() {
        return "Frog" + System.lineSeparator() +
                super.name + " " + super.age + " " + super.gender + System.lineSeparator() +
                produceSound();
    }
}
