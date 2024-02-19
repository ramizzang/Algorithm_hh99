import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String result = "";
        
        if(90<=score){
            result = "A";
        } else if (80<= score) {
            result = "B";
        } else if (70<= score) {
            result = "C";
        } else if (60<= score) {
            result = "D";
        }else {
            result = "F";
        }
        System.out.println(result);

    }
}