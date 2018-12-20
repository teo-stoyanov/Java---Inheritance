package person;

public class Child extends Person{

    Child(String name, int age) {
        super(name, age);
    }

    @Override
    void setAge(int age) {
        if(age > 15){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        } else  if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        super.age = age;
    }
}
