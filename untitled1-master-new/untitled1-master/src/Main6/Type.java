package Main6;

public enum Type implements Discription { // нельзя наследовать и не может наследоваться, может реализовывать интерфейсы, могут быть обстрактные методы
    BIT_32("bit-32"){
        /*@Override // реализованный интерфейс
        public String getDiscription() {
            return "Discription BIT_32";
        }*/
    },
    BIT_64("bit-64"){// при создании private String, в конструктор передается параметр, который нужно иниуиализировать в Битах, потому, что будет ошибка

        /*@Override
        public String getDiscription() {
            return "Discription BIT_64";
        }*/
    };

    @Override // вызов метода из интерфейса, который возвразает имя из конструткора и описание
    public String getDiscription() {
        return name + " Discription";
    };

    public String getName() {
        return name;
    }

    private String name;

    Type(String name) {
        this.name = name;
    }

}
