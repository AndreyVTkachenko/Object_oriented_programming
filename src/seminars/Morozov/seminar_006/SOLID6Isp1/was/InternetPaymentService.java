package seminars.Morozov.seminar_006.SOLID6Isp1.was;

// По интернету мы можем платить через webmoney, по кредитке и по номеру телефону
public class InternetPaymentService implements Payable{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
