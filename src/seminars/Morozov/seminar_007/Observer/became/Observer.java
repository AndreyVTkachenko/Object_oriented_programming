package seminars.Morozov.seminar_007.Observer.became;

// Наблюдатель, он будет получать уведомления
// В данном случае это человек, ищущий работу, получает уведомления от рекрутингового агентства
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
