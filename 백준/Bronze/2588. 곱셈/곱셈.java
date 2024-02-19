import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;

        int i=0;
        while(b != 0){
            sum += a*(b%10) * (int)Math.pow(10,i);
            System.out.println(a*(b%10));
            b=b/10;
            i++;
        }
        System.out.println(sum);

    }
}