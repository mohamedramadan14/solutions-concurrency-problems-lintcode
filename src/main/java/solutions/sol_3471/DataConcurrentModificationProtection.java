package solutions.sol_3471;

import java.util.concurrent.locks.Lock;

public class DataConcurrentModificationProtection {
    /*
    * There are two possible solutions:
    *   1. Use synchronized block
    *   2. Use unstructured Locks
    * */

    // solution 1
    /*
    public static void func(Lock m){
        synchronized (m){
            ++Main.a;
        }
    }
    */

    // solution 2
    public static void func(Lock m){
        m.lock();
        ++Main.a;
        m.unlock();
    }


}
