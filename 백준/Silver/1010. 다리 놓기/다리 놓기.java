import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // dp[n][m] = mCn
        long[][] dp = new long[31][31];

        // 초기값
        for (int m = 0; m <= 30; m++) {
            dp[0][m] = 1;   // 0개 고르는 경우
            dp[m][m] = 1;   // 전부 고르는 경우
        }

        // DP 채우기
        for (int m = 1; m <= 30; m++) {
            for (int n = 1; n < m; n++) {
                dp[n][m] = dp[n - 1][m - 1] + dp[n][m - 1];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[N][M]).append('\n');
        }

        System.out.print(sb);
    }
}
