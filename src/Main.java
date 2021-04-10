public class Main {
    public static void main(String[] args) {
        long startScoreClient = 100;
        long refill = 1100;
        int bonus = 0;
        if (refill >= 1000) {
            bonus = (int) (refill / 100);
        }
        startScoreClient = startScoreClient + refill + bonus;
        System.out.println("bonus: " + bonus);
        System.out.println("totalScore: " + startScoreClient);
    }
}

