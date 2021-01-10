package Main9;

public class List <T>{ // определение типа и его параметиризация (Стринг, инт и т.д.)
    private T[] objects; // массив типа объект в который можно помезать любой объект
    private int size; // значение где будет храниться количество елементов в массиве объект

    public List(int initialSize) { // конструктор, который на вход принимает значение initialSize, и создает массив равен указанному зачению
        this.objects =(T[]) new Object[initialSize]; // приведение типов

    }

    public void add(T element) { // метод добавляющий элемент в массив и инкриментирующий значение
        objects[size++] = element;
    }

    public T get(int index) { // метод возвращающий значение элемента по заяению
        return objects[index];

    }

    public int getSize() { // метод возвращающий размер массива
        return size;
    }
}
