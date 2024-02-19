import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dices = new int[3];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(dices);

        int reward = 0;
        //같은눈3개 10000 + (눈)*1000
        //같은눈 2개 1,000 + 눈 * 100
        // 다른눈 가장 큰눈 * 100
        if (dices[0] == dices[1] && dices[1] == dices[2]) {
            reward = 10000 + (dices[0] * 1000);
        } else if (dices[0] == dices[1] || dices[1] == dices[2] || dices[0] == dices[2]){
            reward = 1000 + (dices[1] * 100);
        }else{
            reward = dices[2] * 100;
        }
        System.out.println(reward);

    }
}