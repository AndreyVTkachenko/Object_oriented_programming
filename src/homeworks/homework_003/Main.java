package homeworks.homework_003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Иван", "Иванович", "Иванов", 1001);
        Student student02 = new Student("Пётр", "Петрович", "Петров", 1002);
        Student student03 = new Student("Сидор", "Сидорович", "Сидоров", 1003);
        Student student04 = new Student("Иван", "Петрович", "Иванов", 1004);
        Student student05 = new Student("Пётр", "Иванович", "Иванов", 1005);
        Student student06 = new Student("Иван", "Иванович", "Сидоров", 1006);
        Student student07 = new Student("Иван", "Петрович", "Сидоров", 1007);
        Student student08 = new Student("Сидор", "Иванович", "Сидоров", 1008);
        Student student09 = new Student("Иван", "Сидорович", "Иванов", 1009);
        Student student10 = new Student("Иван", "Сидорович", "Петров", 1010);
        Student student11 = new Student("Сидор", "Петрович", "Иванов", 1011);
        Student student12 = new Student("Пётр", "Сидорович", "Сидоров", 1012);

        Curator curator01 = new Curator("Сергей", "Сергеевич", "Сергеев", 9001);
        Curator curator02 = new Curator("Антон", "Антонович", "Антонов", 9002);

        List<Student> group01 = new ArrayList<Student, Curator>();
        List<Student, Curator> group02 = new ArrayList<>();


        group01.add(student01);
        group01.add(student03);
        group01.add(student05);
        group01.add(student07);
        group01.add(student09);
        group01.add(student11);
        group01.add(curator01);

        group02.add(student02);
        group02.add(student04);
        group02.add(student06);
        group02.add(student08);
        group02.add(student10);
        group02.add(student12);
        group02.add(curator02);

    }
}
