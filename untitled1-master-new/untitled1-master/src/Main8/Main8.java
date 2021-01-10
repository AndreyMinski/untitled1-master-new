package Main8;

import java.util.Objects;

public class Main8 {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1 == animal2); // сравнение двух обхектов одного класса Анимал, с одинаковыми парамерами. Результат сравнения будет false, потому, что сравниваются две ссылки которые указываю на разные области памяти.
        System.out.println();
        System.out.println(animal1.equals(animal2)); // метод сравнивает объекты
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());


    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override // переопределение метода иквался,который сравнивает объекты по значению
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}