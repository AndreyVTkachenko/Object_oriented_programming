package homeworks.homework_004.view;

import homeworks.homework_004.data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
