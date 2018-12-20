package animals;

public class Tomcat extends Animals {
    Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Give me one million b***h";
    }

    @Override
    public String toString() {
        return "Tomcat" + System.lineSeparator() +
                super.name + " " + super.age + " " + super.gender + System.lineSeparator() +
                produceSound();
    }
}
