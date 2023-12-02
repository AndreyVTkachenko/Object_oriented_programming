package homeworks.homework_006.became.view;

import homeworks.homework_006.became.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
