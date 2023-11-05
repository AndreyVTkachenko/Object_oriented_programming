package seminars.Badeev.seminar_002.task005;

public interface MyIf {
    int getUserId();

    default int getAdminId() {
        return 1;
    }

    static int getUniqueId() {
        return 0;
    }
}
