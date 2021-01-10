public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog is bark...");
    }

    @Override
    public void eat(String s) {
        System.out.println("Dog eats dusk");
        super.eat(s);
    }
}
