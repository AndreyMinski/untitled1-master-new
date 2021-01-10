package Main7;

public class Computer {
    private Ram ram;
    private Ssd ssd;


    public Computer(Ram ram, Ssd ssd) { // конструктор, на вход принимает RAM,SSD
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState(){ // метод который выводит RAM и SSD, в консоль

        System.out.println("Computer: ram "+ ram.getValue()+ ", ssd "+ ssd.getValue());
    }
}
