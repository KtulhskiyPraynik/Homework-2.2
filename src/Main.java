public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int addAmount = 2000;
        int bonus;
        if (addAmount >= 1000) {
            bonus = addAmount / 100;
            int totalAmount = initialAmount + addAmount + bonus;
            System.out.println("Клиент пополнил счет на " + addAmount + " - бонус равен " + bonus + " рублям, итоговая сумма на счету клиента - " + totalAmount + " рублей");
        } else {
            int totalAmount = initialAmount + addAmount;
            System.out.println("Клиент пополнил счет на " + addAmount + " - бонусов нет, итоговая сумма на счету клиента - " + totalAmount + " рублей");
        }
    }
}
