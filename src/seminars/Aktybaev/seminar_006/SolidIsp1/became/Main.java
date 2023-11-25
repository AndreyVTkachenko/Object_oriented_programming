package seminars.Aktybaev.seminar_006.SolidIsp1.became;

public class Main {
    public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payCreditCard(10);
        internetService.payPhoneNumber(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);

        test1(internetService);
        test1(terminalService);

        test2(internetService);
    }

    public static void test1(PayableLite payableLite) {
    // какой-то функционал
    }

    public static void test2(Payable payable) {
    // расширение какого-то функционала
    }
}
