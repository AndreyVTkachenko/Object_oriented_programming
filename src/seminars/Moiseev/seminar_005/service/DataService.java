package seminars.Moiseev.seminar_005.service;

import java.util.ArrayList;
import java.util.List;

import seminars.Moiseev.seminar_005.model.Student;
import seminars.Moiseev.seminar_005.model.Teacher;
import seminars.Moiseev.seminar_005.model.Type;
import seminars.Moiseev.seminar_005.model.User;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        boolean istStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !istStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && istStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == type.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if (type == type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    public User getUserById(Type type, int id) {
        boolean istStudent = Type.STUDENT == type;
        for (User user : userList) {
            if(user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                return user;
            }
            if(user instanceof Student && ((Student) user).getStudentId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllStudent() {
        List<User> studentList = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Student) {
                studentList.add(user);
            }
        }
        return studentList;
    }

    public List<User> getAllTeacher() {
        List<User> teacherList = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Teacher) {
                teacherList.add(user);
            }
        }
        return teacherList;
    }
}
