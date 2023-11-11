package seminars.Morozov.seminar_005;

import seminars.Morozov.seminar_005.controllers.UserController;
import seminars.Morozov.seminar_005.model.FileOperation;
import seminars.Morozov.seminar_005.model.FileOperationImpl;
import seminars.Morozov.seminar_005.model.Repository;
import seminars.Morozov.seminar_005.model.RepositoryFile;
import seminars.Morozov.seminar_005.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl(
                "C:\\Users\\gepat\\Documents\\Обучение в GeekBrains\\Введение в ООП" +
                        "\\Object_oriented_programming\\src\\seminars\\Morozov\\seminar_005\\users.txt");/* Абсолютный
                        путь вставил сам для того чтобы файл users.txt создавался в папке с семинаром */
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
