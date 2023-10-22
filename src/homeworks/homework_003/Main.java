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
        Curator curator03 = new Curator("Роман", "Романович", "Романов", 9003);


//        List<Student, Curator> group02 = new ArrayList<>();
//        List<> group03 = new ArrayList<>(Student, Curator);
        List<Student> group01 = new ArrayList<>();
        List<Student> group02 = new ArrayList<>();
        List<Student> group03 = new ArrayList<>();
        List<Curator> curatorList = new ArrayList<>();
        curatorList.add(curator01);
        curatorList.add(curator02);
        curatorList.add(curator03);

        group01.add(student01);
        group01.add(student04);
        group01.add(student07);
        group01.add(student10);
//        group01.add(curator01);

        StudentGroup studentGroup01 = new StudentGroup(group01, curatorList);
        group02.add(student02);
        group02.add(student05);
        group02.add(student08);
        group02.add(student11);
//        group02.add(curator02);
        StudentGroup studentGroup02 = new StudentGroup(group02, curatorList);

        group03.add(student03);
        group03.add(student06);
        group03.add(student09);
        group03.add(student12);
//        group03.add(curator03);
        StudentGroup studentGroup03 = new StudentGroup(group03, curatorList);

    }
}