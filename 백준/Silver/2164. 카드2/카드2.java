import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        LinkedList<Integer> queue = new LinkedList<Integer>();


        for (int i = 1; i <= N; i++){
            queue.add(i);
        } // 큐에 숫자 삽입

        for (int i = 0; i < (N-1); i++){
            queue.poll();
            int n = queue.poll();
            queue.add(n);
        }

        System.out.println(queue.peek());


    }
}