package solutions.sol_3467;

public class CreateADaemonThread {
    public Thread createDaemonThread() {
        Thread thread = new Thread( () -> {
            // Do something
        });
        thread.setDaemon(true);
        return thread;
    }
}
