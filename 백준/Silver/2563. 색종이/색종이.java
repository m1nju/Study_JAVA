import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[][] = new int [100][100];

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            int row = sc.nextInt();
            int col = sc.nextInt();

            for (int w = row; w < row + 10; w++){
                for (int h = col; h < col + 10; h++){
                    arr[w][h] = 1;
                }

            }
        }

        int area = 0;
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                if (arr[i][j] == 1){
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}