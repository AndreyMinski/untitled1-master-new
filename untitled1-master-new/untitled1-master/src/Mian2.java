public class Mian2 {
    public static void main(String[] args) {
        Bike bike = new Bike("Specialized",1254868);
        Bike bike1 = new Bike();
        Bike bike2 = new Bike("LTD");
    }
}


class Bike {
    private String name;
    private int serialnumders;

    public Bike() { // конструтор по умолчанию, без параметров и тела
        System.out.println("Bike из первого констурктора");
    }

    public Bike(String name) { // конструктор с параметром стринг
        System.out.println("Bike из второго конструктора");
        this.name = name; // слово this. назначает поле нэим значением, котрое поступает в параметры
    }
    public Bike (String name, int serialnumders){ // нащвание конструктора начинает с больщой буквы
        System.out.println("Bike из третьего конструктора");
        this.name = name;
        this.serialnumders = serialnumders;

    }
}

