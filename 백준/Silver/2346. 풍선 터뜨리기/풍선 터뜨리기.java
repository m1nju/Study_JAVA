import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<int[]> deque = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int m = Integer.parseInt(st.nextToken());
            deque.add(new int[]{i, m});
        }

        int[] current = deque.removeFirst();
        sb.append(current[0]).append(" ");
        int move = current[1];

        while (!deque.isEmpty()) {
            // 🔹 이동 최적화: 풍선 개수로 나머지 연산
            int size = deque.size();
            if (move > 0) move = (move - 1) % size;
            else move = move % size;

            if (move > 0) {
                for (int j = 0; j < move; j++) {
                    deque.addLast(deque.removeFirst());
                }
            } else if (move < 0) {
                for (int j = 0; j < Math.abs(move); j++) {
                    deque.addFirst(deque.removeLast());
                }
            }

            current = deque.removeFirst();
            sb.append(current[0]).append(" ");
            move = current[1];
        }

        System.out.println(sb);
    }
}
