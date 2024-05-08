package solutions.sol_3487;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class CustomAsynchronousResults {
    public Future<Long> power(long val){
        return CompletableFuture.supplyAsync(() ->{
            long result = val * val;
            if(result > 2147483647){
                throw new ArithmeticException("The square of the val exceeds the limit of the integer");
            }
            return result;
        });
    }
}
