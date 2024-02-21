import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 물건 종류
        int sum = 0;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        String result = x==sum?"Yes":"No";
        System.out.println(result);
    }
}