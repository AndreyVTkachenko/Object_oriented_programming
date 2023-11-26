package seminars.Badeev.seminar_007.patterns.prototype_example_two;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Конструктор копирования для неглубокого клонирования
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        // Производим клонирование Address с помощью конструктора копирования
        this.address = new Address(other.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person copy() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person: " + name + ", age: " + age + ", address: " + address;
    }
}
