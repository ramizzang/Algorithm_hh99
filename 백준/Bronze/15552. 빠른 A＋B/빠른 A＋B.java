import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 총 개수 입력받기
        String s;//= br.readLine();
        StringTokenizer st;// = new StringTokenizer(s);
        int sum=0;

        for(int i=0; i<t; i++){
            s = br.readLine();
            st = new StringTokenizer(s);
            int a = Integer.parseInt((st.nextToken()));
            int b = Integer.parseInt((st.nextToken()));
            sum = a+b;
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}