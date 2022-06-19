package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        iTelephone timsPhone;
        timsPhone = new DeskPhone(1233456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456);
        timsPhone.powerOn();
        timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
