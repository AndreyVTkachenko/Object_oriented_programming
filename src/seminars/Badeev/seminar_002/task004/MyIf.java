package seminars.Badeev.seminar_002.task004;

public interface MyIf {
    int getUserId();

    default int getAdminId() {
        return 1;
    }
}
