import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] a = new int[N];

        for (int i = 0; i < N; i++){
            a[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int avg = 0;
        int med = 0;
        int mod = 0;
        int range = 0;

        int sum = 0;
        for (int i = 0; i < N; i++){
            sum += a[i];
        }

        avg = (int)Math.round((double)sum / N);

        Arrays.sort(a);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        int max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        int[] temp = new int[N];
        int idx = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                temp[idx++] = key;
            }
        }

        Arrays.sort(temp, 0, idx);

        if (idx > 1) {
            mod = temp[1];
        } else {
            mod = temp[0];
        }


        med = a[N / 2];

        range = a[N-1] - a[0];




        System.out.println(avg);
        System.out.println(med);
        System.out.println(mod);
        System.out.println(range);

    }
}
