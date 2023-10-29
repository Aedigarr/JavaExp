class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating a new instance of Dog
        Dog myDog = new Dog();

        // Using the instance to access properties and methods
        myDog.eat();
        myDog.bark();
    }
}

