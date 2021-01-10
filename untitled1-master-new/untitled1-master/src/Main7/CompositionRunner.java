package Main7;

public class CompositionRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(2000); // новый объект RAM на вход принимает значение из конструктора.
        Ssd ssd = new Ssd(1000);

        Computer computer = new Computer(ram,ssd); // содание нового объекта
        computer.printState(); // вызов метода


    }
}
