package Main9;

public class ListRanner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);// в скобках указывается размер массива, который приходит из констурктора
        list.add("String1");
        list.add("String2");
        list.add("String3");

        String element = list.get(1);
        System.out.println(element);


    }
}
