public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int clientAccount1 = 100;
        int refill = 1100;
        if (refill > 1000) {
            int bonus = refill / 100;
            int clientAccount = clientAccount1 + refill + bonus;
            System.out.println("Бонусные баллы: " + bonus);
            System.out.println("Сумма на счете: " + clientAccount);
        } else {
            int clientAccount = clientAccount1 + refill;
            System.out.println("Бонусные баллы: 0");
            System.out.println("Сумма на счете: " + clientAccount);
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}