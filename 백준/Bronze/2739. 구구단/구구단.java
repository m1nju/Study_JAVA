import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }

    }
}