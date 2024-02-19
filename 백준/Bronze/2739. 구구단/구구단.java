import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //9번 반복 출력 i = 1~9까지 증가

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
        
    }
}