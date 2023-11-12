package seminars.Aktybaev.seminar_005.view.commands;

import seminars.Aktybaev.seminar_005.view.ConsoleUI;

public class AddStudent extends Command{
    public AddStudent(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить студента";
    }

    public void execute(){
        consoleUI.addStudent();
    }
}
