import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Ű���� �Է°��� �޾ƿ��� ��
		String line =null; // ����
		try {
			line = br.readLine();//�Է°��� �޴� ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
	}

}
