import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int min = a[0];

        for (int j = 1; j < n; j++){
            if (max < a[j]){
                max = a[j];
            }

            else if (min > a[j]){
                min = a[j];
            }
        }


        System.out.printf("%d %d", min, max);

    }
}