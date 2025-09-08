import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder = new StringBuilder(); // 출력 시간을 줄이기 위해

        int N = Integer.parseInt(bufferedReader.readLine()); // 명령어의 최대개수 N

        LinkedList<Integer> queue = new LinkedList<>();

        /*
        push X: 정수 X를 큐에 넣는 연산이다.
         pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         size: 큐에 들어있는 정수의 개수를 출력한다.
         empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
         front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         */

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String s = stringTokenizer.nextToken();

            if (s.equals("push")){
                int x = Integer.parseInt(stringTokenizer.nextToken());
                queue.add(x);

            }

            else if (s.equals("pop")){
                if(queue.isEmpty()) stringBuilder.append(-1).append("\n");
                else {
                    int x = queue.poll();
                    stringBuilder.append(x).append("\n");
                }

            }

            else if (s.equals("size")){
                int x = queue.size();
                stringBuilder.append(x).append("\n");
            }

            else if (s.equals("empty")){
                if (queue.isEmpty()) stringBuilder.append(1).append("\n");
                else stringBuilder.append(0).append("\n");
            }

            else if (s.equals("front")){
                if(queue.isEmpty()) stringBuilder.append(-1).append("\n");

                else{
                    int x = queue.peekFirst();
                    stringBuilder.append(x).append("\n");
                }
            }

            else {
                if(queue.isEmpty()) stringBuilder.append(-1).append("\n");
                else {
                    int x = queue.peekLast();
                    stringBuilder.append(x).append("\n");
                }
            }

        }

        System.out.println(stringBuilder);



    }
}