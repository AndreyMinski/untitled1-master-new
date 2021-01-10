public class Main5 {
    public static void main(String[] args) {
        Staff staff = new Staff("Bob",45);
        Staff staff1 = new Staff("Sam",35);
        Staff.discriptions = "Good work"; // общая статическая переменная для всех объектов класса
        staff.getResultWork(); // также вызывыется в методе
        staff1.getResultWork();
        System.out.println();
        Staff.discriptions = "Bad work"; // изменение статисчкой переменной для обзектов всего класса
        staff.getResultWork(); // меняется во все объектах класса
        staff1.getResultWork();




    }
}

class Staff {
    private String name;
    private int age;
    public static String discriptions; // статическая переменная общая для всего класса, одна на всех

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getResultWork(){
        System.out.println(name+ ", "+ age+ ", "+ discriptions);
    }
}
