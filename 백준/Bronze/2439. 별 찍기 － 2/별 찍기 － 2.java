import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        String stars = "";

        for(int i=0; i<N; i++){
            for (int j = N-2; j >=i ; j--) {
                stars = " ";
                bw.write(stars);
            }
            for (int j = 0; j <=i ; j++) {
                stars = "*";
                bw.write(stars);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}