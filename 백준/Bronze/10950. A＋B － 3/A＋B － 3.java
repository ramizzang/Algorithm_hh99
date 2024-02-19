import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] numbers = new int[t][2];
        //이차원 배열에 a,b 저장
        for (int i = 0; i < numbers.length; i++) {
            for(int j=0; j<numbers[i].length; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < numbers.length; i++) {
            for(int j=0; j<numbers[i].length; j++){

            }
            System.out.println(numbers[i][0]+numbers[i][1]);
        }

    }
}