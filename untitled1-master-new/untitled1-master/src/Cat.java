public class Cat extends Animal {
    @Override // переопределенный абстрактныйметод из класса Анимал
    public void makeSound() { // при наследоваении абстактного класа реализуются все абстрактные методы
        System.out.println("Cat is meow...");
    }

    @Override // переопределенный метод из класса Анимал
    public void eat(String s) {

        System.out.println("Cat eat mouse... " + " but "+ s);
    }
}

