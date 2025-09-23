import java.util.*;
import java.io.*;

class Result {

    /*
     * Complete the 'countResponseTimeRegressions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
    // Write your code here
        if (responseTimes.size() < 1) return 0;
        long sum = responseTimes.get(0);
        int coun = 0;
        for (int i = 1; i < responseTimes.size(); i++) {
            if (sum < (long) responseTimes.get(i) * i) coun++;
            sum += responseTimes.get(i);
        }
        return coun;
    }

}