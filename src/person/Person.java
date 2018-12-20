package person;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    void setName(String name) {
        if (name.trim().length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public String toString() {

        return String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge());

    }

}
