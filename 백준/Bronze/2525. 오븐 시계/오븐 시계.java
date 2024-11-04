import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int sum = b + c;
        int newMin, newHour;
        if (sum >= 60){ // 현재 시각의 분 + 요리 필요 시간이 60분을 넘어갈 때
            newMin = sum % 60;
            newHour = a + (sum / 60);

            if (newHour >= 24){ // 24시를 넘어갈 때
                newHour = newHour - 24;
            }
        }

        else { // 시각의 변동이 없을 때 (예. 현재 시각 1시 0분 + 조리시간 10분)
            newMin = sum;
            newHour = a;
        }

        System.out.printf("%d %d", newHour, newMin);

    }
}