package solutions.sol_3483;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CreateAnAsynchronousTask {
    FutureTask<String> asyncTask(Callable<String> fn) {
        // --- write your code here ---
        return new FutureTask<>(fn);
    }
}
