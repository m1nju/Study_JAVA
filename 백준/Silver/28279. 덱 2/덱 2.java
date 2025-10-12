import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        LinkedList<Integer> deque = new LinkedList<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());

            if(a == 1){
                int n = Integer.parseInt(stringTokenizer.nextToken());
                deque.addFirst(n);

            } else if (a == 2) {
                int n = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(n);

            } else if (a == 3) {
                if (deque.isEmpty()) stringBuilder.append(-1).append("\n");
                else {
                    int n = deque.pollFirst();
                    stringBuilder.append(n).append("\n");
                }
                
            } else if (a == 4) {
                if (deque.isEmpty()) stringBuilder.append(-1).append("\n");
                else {
                    int n = deque.pollLast();
                    stringBuilder.append(n).append("\n");
                }
                
            } else if (a == 5) {
                int n = deque.size();
                stringBuilder.append(n).append("\n");
                
            } else if (a == 6) {
                if (deque.isEmpty()) stringBuilder.append(1).append("\n");
                else stringBuilder.append(0).append("\n");
                
            } else if (a == 7) {
                if (deque.isEmpty()) stringBuilder.append(-1).append("\n");
                else {
                    int n = deque.peekFirst();
                    stringBuilder.append(n).append("\n");
                }

            } else {
                if (deque.isEmpty()) stringBuilder.append(-1).append("\n");
                else {
                    int n = deque.peekLast();
                    stringBuilder.append(n).append("\n");
                }

            }

        }

        System.out.println(stringBuilder);
    }
}