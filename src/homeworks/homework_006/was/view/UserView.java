package homeworks.homework_006.was.view;

import homeworks.homework_006.was.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
