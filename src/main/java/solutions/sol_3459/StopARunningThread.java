package solutions.sol_3459;

public class StopARunningThread {
    public void stopThread(Thread thread) {
        thread.interrupt();
    }
}
