package animals;

public class Cat extends Animals {

    Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "MiauMiau";
    }

    @Override
    public String toString() {
        return "Cat" + System.lineSeparator() +
                super.name + " " + super.age + " " + super.gender + System.lineSeparator() +
                produceSound();
    }
}
