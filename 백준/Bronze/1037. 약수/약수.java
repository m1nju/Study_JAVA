import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine()); //     N의 개수

        int[] array = new int[T];

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {  // N의 개수만큼 입력받음
            int N = Integer.parseInt(st.nextToken());
            array[i] = N;
        }


        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        Long A = (long) ((long) max *min);
        System.out.println(A);
    }
}
