import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // hour
        int m = sc.nextInt(); // mm
//        (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
        //45분 일찍 알람 설정하

        if(m<45){
            m += 15;
            if(h == 0){
                h=23;
            }else{
                h--;
            }
        }else {
            m -= 45;
        }
        System.out.println(h+" "+m);

    }
}