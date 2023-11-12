package seminars.Aktybaev.seminar_005.view.commands;

import seminars.Aktybaev.seminar_005.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Закончить работу";
    }

    public void execute(){
        consoleUI.finish();
    }
}
