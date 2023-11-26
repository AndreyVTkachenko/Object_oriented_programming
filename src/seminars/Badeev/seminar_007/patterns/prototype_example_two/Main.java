package seminars.Badeev.seminar_007.patterns.prototype_example_two;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("CityA", "StreetA");
        Person person1 = new Person("Alice", 30, address);

        // Копируем объект person1
        Person person2 = person1.copy();

        // Изменяем поле в скопированном объекте
        person2.setName("Bob");
        person2.getAddress().setCity("CityB");

        // Выводим информацию об объектах
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}
