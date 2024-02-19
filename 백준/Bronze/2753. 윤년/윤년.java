import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //윤년이면 1, 아니면 0을 출력
        // 연도가 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일때

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeap = false;
        if((year%4==0 && year%100 !=0 )|| year % 400 ==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
 
    }
}