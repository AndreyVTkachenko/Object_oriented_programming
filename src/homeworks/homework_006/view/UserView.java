package homeworks.homework_006.view;

import homeworks.homework_006.data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
