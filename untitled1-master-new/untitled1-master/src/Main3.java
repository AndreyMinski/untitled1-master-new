import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // создание массива,массив из 10 ячеек
        System.out.println(numbers[0]); //обращение к элементу массива, при создани массива все эдементы в нем равны 0
        numbers[0] = 10; // инициализация эдементов массива, в [0] помещается число 10
        System.out.println(numbers[0]);
        for (int i = 0; i < numbers.length; i++) { // для заполнения элементов массива применяется цикл for( i< numbers.lenght - означает i меньше длинны массива,цикл проходит по всему массиву
            numbers[i] = i * 10; //   элемент массива умножается на 10
        }
        for (int i = 0; i < numbers.length; i++) { // цикл выводит в кнсоль все элементы массива
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 10, 4, 60};// можно инициализировать массив сразу, если известны значения
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
        System.out.println();
        String[] strings = new String[3]; // создание массива из строк
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string : strings) { //цикл for each (тип данных, имя переменной: имя массива )
            System.out.println(string);
        }
        System.out.println();

        int[] numbers2 = {1, 3, 5, 7};// создание массива в ктором находятся элементы 1.3.5.7.
        int sum = 0; // объявление переменной
        System.out.println(Arrays.toString(numbers2)); // вывод всех элементов массива в консоль
        System.out.println();

        for (int x : numbers2) {
            sum = sum + x; // // цикл считате сумму сумму элементов массива по порядку (1+3+5+7), цикл подстовляет вместо Х элементы массива, x = 1 => вывод на печать sum = 1, след. круг x = 3 => вывод на печать sum = 4 и т.д
            System.out.println(sum); // метод выводит в консоль результат, после чего цикл продолжается, пока на закончиться массив
        }
        System.out.println();
        for (int x : numbers2) {
            sum = sum + x; // цикл счтает сумму всех элементов массива и выводит результат в консоль
        }
        System.out.println(sum); // вывод в консоль суммы
        System.out.println();

        int [][]matrice={{1,2,3},// двумерный массив
                         {4,5,6},
                         {7,8,9}};

        for (int i = 0; i<matrice.length;i++){     // цикл проходит по строкам (i = 0, matrice.length = 3 )
        for (int j = 0; j<matrice[i].length;j++){ // цикл проходит по каждому элементы в строке
            System.out.print(matrice[i][j]+ " ");
        }
            System.out.println();
        }
        System.out.println();
        System.out.println(matrice[2][2]); // первое число строка, второе число столбец
        System.out.println(matrice [1][1]);
        System.out.println(matrice[0][0]);
        System.out.println();
        String [][] string3 = new String[3][3]; //двумерный массив из строк
        string3[1][1]="Hello World,Java is greate";
        System.out.println(string3 [1][1]); // образение к элементам как и в цифровом

    }

}
