package Main6;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        Type type = Type.BIT_32; // ораащение к енаму в класее
        Type type1 = Type.BIT_64;
        System.out.println(type); // вывывод значения в консоль
        System.out.println(type.name());// метод найм также выводит значаение в консоль
        System.out.println(type.valueOf("BIT_32")); // поиск значанеия по имени, в констоль возвразается имя
        System.out.println(Arrays.toString(Type.values())); // вывод в консоль всех енамов, с использованием метода арайс(массивы)
        System.out.println(Type.BIT_32.ordinal()); // получения значания, под каким находитьсся енам, начинаетмя как в масиве с 0
        System.out.println(type1.getName()); // обращение к енаму, и вывод в консоль имени, которое пришло из конструктора
        System.out.println(type.getDiscription()); // вызов переопределенного метода
        System.out.println(type1.getDiscription());


    }
}
