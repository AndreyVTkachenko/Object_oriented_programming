package seminars.Morozov.seminar_006.SOLID6Isp1.was;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}
