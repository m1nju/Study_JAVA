import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[][] = new int[9][9];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int row = 1, col = 1;

        for (int i = 0; i<9;i++){
            for (int j = 0; j < 9; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " "+ col);

    }
}