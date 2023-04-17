public class Main {
    public static void main(String[] args) {

        int rubles;
        int sum = 100;
        int replenishment = 100;
        int refill = 300;

        if (refill > 1000) {
            rubles = sum + refill + refill / 100;
        } else {
            rubles = sum + refill;
        }

        System.out.println("Зачисленно на счет: " + rubles);
    }
}