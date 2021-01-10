package Main7;

public class Ram { // класс
    private int value; // приватная переменная

    public Ram(int value) { // конструкто в параметрах которого назначается значание value
        this.value = value;
    }

    public int getValue() { // геттер возвращает значение
        return value;
    }

    public void setValue(int value) { // сеттер назначает значение
        this.value = value;
    }
}
