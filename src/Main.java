public class Main {
    public static void main(String[] args) {

        int startBalance = 200;
        int depositAmount = 2000;
        int bonus = depositAmount / 100;
        int totalClientBalance = startBalance + depositAmount + bonus;
        int totalClientBalanceWithoutBonuses = startBalance + depositAmount;

        if (depositAmount >= 1000) {
            System.out.println("Вам начисленно " + bonus + " бонусов");
            System.out.println("Ваш текущий баланс: " + totalClientBalance);
        } else {
            System.out.println("Вам начисленно 0 бонусов. Бонусы начисляются при пополнении баланса на 1000 и более рублей");
            System.out.println("Ваш текущий баланс: " + totalClientBalanceWithoutBonuses);
        }
    }
}
