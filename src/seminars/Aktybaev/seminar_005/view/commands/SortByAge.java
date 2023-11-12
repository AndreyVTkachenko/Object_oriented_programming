package seminars.Aktybaev.seminar_005.view.commands;

import seminars.Aktybaev.seminar_005.view.ConsoleUI;

public class SortByAge extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по возрасту";
    }

    public void execute(){
        consoleUI.sortByAge();
    }
}
