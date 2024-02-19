import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // hour
        int b = sc.nextInt(); // mm
        int c = sc.nextInt(); // 분단위 0~1000
        if((b+c)/60>0){
            a += (b+c)/60;
            if(a>=24){
                a = a%24;
            }
            b = (b+c)%60;
        }else{
            b += c;
        }
        System.out.println(a+" "+b);
    }
}