package example.org.HmwrkTask1;

public class Dog extends Animal {

    private final String dogBreed;
    public Dog(String name, int age, String dogBreed) {
        super(name, age);
        this.dogBreed = dogBreed;
    }


    public void run() {
        System.out.println("Dog is running");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof-woof!...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBreed: " + dogBreed;
    }
}
