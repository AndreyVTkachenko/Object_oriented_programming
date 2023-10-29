package homeworks.homework_005.controller;

import homeworks.homework_005.model.*;
import homeworks.homework_005.service.DataService;
import homeworks.homework_005.view.StudentView;
import homeworks.homework_005.view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    /**
     * Создание студента
     * @param firstName Имя
     * @param secondName Отчество
     * @param lastName Фамилия
     */
    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    /**
     * Получение списка всех студентов
     */
    public void getAllStudent() {
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    /**
     * Создание учителя
     * @param firstName Имя
     * @param secondName Отчество
     * @param lastName Фамилия
     */
    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    /**
     * Получение списка всех учителей
     */
    public void getAllTeacher() {
        List<User> userList = dataService.getAllTeacher();
        for (User user : userList) {
            teacherView.printOnConsole((Teacher) user);
        }
    }



    // ???????????????????????????????????????????????????????????????????????????????????????????????????????????????
    /**
     * Создание учебной группы
     * @param studentList Список студентов
     * @param teacher Учитель
     */
    public void createStudyGroup(List<Student> studentList, Teacher teacher) {
//        StudyGroup studyGroup2 = new StudyGroup();
//        StudyGroup studyGroup1 = new StudyGroup(List<Student> studentList, Teacher teacher);
        StudyGroup studyGroup = new StudyGroup(studentList, teacher);



        System.out.println("Учебная группа создана: " + studyGroup);
    }

    public void getAllStudyGroup() {

    }
}
