package Main10;

import java.util.*;

public class Main10 {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>(); // создание коллекции
        collection.add("1"); // добавление элемента в колеекцию
        collection.add("2");
        collection.add("3");
        collection.remove("2"); // удаление элемента из колллекции
        for (Object o : collection) { // циклом форич, можно пройтись по всей коллекции
            System.out.println(o);
        }

    }
}
class Main11{
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>(); // создание коллекции List
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.set(2,"5"); // замена элемента в коллекции.
        for(int i = 0;i< collection.size();i++){ // цикл проходит по коллекции, пока индек i меньше размера коллекции
            System.out.println(collection.get(i)); // вывод в консоль элемента коллекции по значаению
        }

    }
}
class Main12{
    public static void main(String[] args) {
        Queue<String> collection = new PriorityQueue<>(); // создание коллекции Queue
        collection.offer("1"); // добавление элемента в коллекцию
        collection.offer("2");
        collection.offer("3");
        collection.offer("4");
        for (Object o:collection){
            System.out.println(o+ " num of element");
        }


    }
}
class Main13{
    public static void main(String[] args) {
        Set<String> collection = new HashSet<String>(); //колеекция сет в памяти храниться только одно уникальное значение
        collection.add("1"); // добавление элемента к коллекцию
        collection.add("1");
        collection.add("1");
        collection.add("2");
        collection.add("2");
        collection.add("3");
        collection.add("3");
        for (Object o : collection){
            System.out.println(o);
        }
    }
}
class Main14{
    public static void main(String[] args) {
        Map collection = new HashMap();
        collection.put("1","Book");
        collection.put("2","Game");
        collection.put("3","TV+PS4");
        collection.put("4","Walk");
        collection.put("5","Sleep");
        System.out.println(collection.get("2")); // получение элемента коллекции по значению
        Set set= collection.entrySet();
        for (Object o:set){
            System.out.println(o);

        }
    }
}
