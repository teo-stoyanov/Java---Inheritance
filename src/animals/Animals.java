package animals;

public class Animals {
    String name;
    int age;
    String gender;

    Animals(String name, int age, String gender) {
        this.name = name;
        this.setAge(age);
        this.setGender(gender);
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String produceSound() {
        return "Not implemented!";
    }
}
