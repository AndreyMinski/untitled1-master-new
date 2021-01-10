public class Main4 {
    public static void main(String[] args) {
        Human h1 = new Human("Sam", 20);
        System.out.println(h1);

    }
}


class Human {
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String toString(){ // переопреледеленный метод toString, если его не переопределить, то при вызове h1 в констоль быдет хэш код, потому,что всеоюъесты наследжеютмя от класс Object
        return name+ ", " + age;

    }

}
