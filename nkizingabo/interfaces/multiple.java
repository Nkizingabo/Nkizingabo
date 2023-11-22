public class minterface {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();  // Outputs "Bird is flying"
        myBird.swim(); // Outputs "Bird is swimming"
    }
}
// Define multiple interfaces
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Implement multiple interfaces in a class
class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }
}

// Usage of the class
