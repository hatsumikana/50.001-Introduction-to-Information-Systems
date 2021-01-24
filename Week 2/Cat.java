abstract class Animal {
    abstract void makeSound();

}

class Dog extends Animal {

    // implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark.");
    }
}

class Cat extends Animal {

    // implementation of abstract method
    public void makeSound() {
        System.out.println("Meows ");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();

        Cat c1 = new Cat();
        c1.makeSound();
    }
}
