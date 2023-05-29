public class main {
    public static void main(String[] args) {
        int account = 100;
        int summ = 1200;
        int bonus = summ/100;
        int total;
        if (summ > 1000) {
            total = account + summ + bonus;
        } else {
            total = account + summ;
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + total);
        System.out.println("Бонусные рубли:" + bonus);
        }
    }


