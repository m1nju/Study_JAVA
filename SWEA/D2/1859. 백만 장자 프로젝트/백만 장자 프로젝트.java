import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int a = sc.nextInt();
            int arr[] = new int[a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }



            int max = 0;
            int maxloc = 0;
            Long profit = 0L;
            int currloc = 0;

            while (currloc < a) {

                for (int i = currloc; i < a; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        maxloc = i;
                    }
                }

                if (maxloc != currloc) { // 최대값이 a[0]이 아니라면

                    int sum = 0;
                    int count = 0;

                    for (int i = currloc; i < maxloc; i++) {

                        sum = sum + arr[i];
                        count++;

                    }

                    profit = profit + (arr[maxloc]*count) - sum;

                }
                currloc = maxloc + 1;
                max = 0;


            }

            System.out.printf("#%d ", test_case);
            System.out.println(profit);



        }
    }
}
