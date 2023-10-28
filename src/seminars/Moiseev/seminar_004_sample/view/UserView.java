package seminars.Moiseev.seminar_004_sample.view;

import seminars.Moiseev.seminar_004_sample.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
