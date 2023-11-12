package seminars.Aktybaev.seminar_005.view.commands;

import seminars.Aktybaev.seminar_005.view.ConsoleUI;

public class GetStudentsInfo extends Command {
    public GetStudentsInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список студентов";
    }

    public void execute(){
        consoleUI.getStudentsListInfo();
    }
}
