package solutions.sol_3457;

import java.util.List;

public class CreateAThreadToSpliceWords {
    public void printParams(List<String> params) {
        Thread thread = new Thread(()->{
            System.out.println(String.join(",", params));
        });
        thread.start();
    }
}
