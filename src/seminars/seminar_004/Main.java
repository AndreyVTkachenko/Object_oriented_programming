package seminars.seminar_004;

import seminars.seminar_004.controller.StudentController;

public class Main {
    static StudentController studentController = new StudentController();

    public static void main(String[] args) {
        studentController.create("Иван", "Иванович", "Иванов");
        studentController.create("Пётр", "Петрович", "Петров");
        studentController.create("Сидор", "Сидорович", "Сидоров");
        studentController.create("Иван", "Петрович", "Иванов");
        studentController.create("Пётр", "Иванович", "Иванов");
        studentController.create("Иван", "Иванович", "Сидоров");
        studentController.create("Иван", "Петрович", "Сидоров");
        studentController.create("Сидор", "Иванович", "Сидоров");
        studentController.create("Иван", "Сидорович", "Иванов");
        studentController.create("Иван", "Сидорович", "Петров");
        studentController.create("Сидор", "Петрович", "Иванов");
        studentController.create("Пётр", "Сидорович", "Сидоров");
        studentController.printAllStudent();

    }
}