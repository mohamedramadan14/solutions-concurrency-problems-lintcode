package solutions.sol_3479;

import java.util.concurrent.ExecutorService;

public class ShutdownTheThreadPool {
    public void shutdownThreadPool(ExecutorService threadPool) {
        threadPool.shutdownNow();
    }
}
