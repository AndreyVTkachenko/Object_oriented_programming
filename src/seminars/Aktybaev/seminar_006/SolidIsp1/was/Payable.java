package seminars.Aktybaev.seminar_006.SolidIsp1.was;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}
