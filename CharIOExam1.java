import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//키보드 입력값을 받아오는 것
		String line =null; // 스콥
		try {
			line = br.readLine();//입력값을 받는 변수
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
	}

}
