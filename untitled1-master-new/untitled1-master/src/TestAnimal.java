public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat("Cat wants eat whiskas");
        System.out.println();
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat("Dog wants eat sausages ");

    }
}
