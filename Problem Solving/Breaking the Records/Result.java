import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        List<Integer> list = new ArrayList<>();
        int min = scores.get(0);
        int max = min;
        int counMin = 0, counMax = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                max = scores.get(i);
                counMax++;
            }
            if (scores.get(i) < min) {
                min = scores.get(i);
                counMin++;
            }
        }
        list.add(counMax);
        list.add(counMin);
        return list;
    }

}
