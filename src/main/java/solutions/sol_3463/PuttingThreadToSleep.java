package solutions.sol_3463;

public class PuttingThreadToSleep {
    public void sleepThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
