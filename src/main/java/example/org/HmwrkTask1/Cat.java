package example.org.HmwrkTask1;

public class Cat extends Animal {

    private final String catColor;
    public Cat(String name, int age, String catColor) {
        super(name, age);
        this.catColor = catColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow-meow!...");
    }

    public void catEat() {
        System.out.println("Cat eats");
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + catColor;
    }
}
