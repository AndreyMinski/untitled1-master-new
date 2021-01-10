public class Main1 {
    public static void main(String[] args) {
        Car car = new Car(); //создание нового объекта
        car.setMark("BMW "); //сеттер назначает марку
        car.setModel(" E70"); // cеттер назначает модель
        System.out.println("Автомобиль " + car.getMark() + car.getModel() + " был создан"); // вывод в консоль

        Car car1 = new Car();
        car1.setMark("Audi ");
        car1.setModel(" Q7");
        System.out.println("Автомобиль " + car1.getMark() + car1.getModel() + " был создан");

        Car car2 = new Car();
        car2.setMark("Mercedes ");
        car2.setModel(" S500");
        System.out.println("Автомобиль " + car2.getMark() + car2.getModel() + " был создан");

        System.out.println();
        car.carBuy(); // у объекта через точку вызыается метод
        car1.carBuy();
        car2.carBuy();
        System.out.println();

        System.out.println();
        System.out.println(car.getMark() + car.getModel() + " поехала со скоростью " + car.carDrive() + " км/ч");
        System.out.println(car1.getMark() + car1.getModel() + " поехала со скоростью " + car1.carDrive() + " км/ч");
        System.out.println(car2.getMark() + car2.getModel() + " поехал со скоростью " + car2.carDrive() + " км/ч");// в консоль выводиться марка и модель машины + передается значение переменной, кторая была расчитатана в методе

        int speed = car.carDrive(); // можно присвоить значение переменной, котрое было расчитано в методе
        int speed1 = car.carDrive();
        int speed2 = car.carDrive();

        System.out.println();
        car.maxSpeed(240, " км/ч"); // вызов у объекта метода, в скобках указываются значения из метода
        car1.maxSpeed(230, " км/ч");
        car2.maxSpeed(250, " км/ч");

        Car car4 = new Car();


    }
}

class Car { // класс
    private String mark; // приватное поле тип стринг
    private String model; // приватное поле тип стринг

    // методы

    public String getMark() { // геттер возвращает название марки объекту Car
        return mark;
    }

    public void setMark(String mark) { // сеттер назначет марку
        this.mark = mark;
    }

    public String getModel() { // геттер возвращает название модели
        return model;
    }

    public void setModel(String model) { // сеттер назначает название модели
        this.model = model;
    }

    void carBuy() {
        for (int i = 0; i < 3; i++)// создание метода void - ничего не возвращвет,то что в () скобках, называется парамет метода то, что метод принимает на вход.Можно использовать с циклами, например for, метод быудет круться три раза, пока в скобках верное условие
            System.out.println("Автомобиль " + getMark() + getModel() + " купили в салоне"); // вывод в консоль тела метода, можно использовать геттеры
    }

    int carDrive() { // создание метода с возвращаемым заначением
        int speed = 10 * 4; // в методе создается переменная, и расчитавается её значаение
        return speed; // метод возвражает значение переменной
    }

    void maxSpeed(int speed, String speedOnHours) {
        System.out.println("Mаксимальная  скорость " + speed + speedOnHours);// создание метода, который на вход принимает парамет тип int, и String
    }



}
