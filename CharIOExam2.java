import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharIOExam2 {

	public static void main(String[] args) {
		//이 파일의 적힌 글을 다 옮기는 식
		BufferedReader br = null;
		PrintWriter pw = null;
				try {
					br = new BufferedReader(new FileReader("C:/Users/Tenzi/Desktop/Java/javanext/java_NextLevel/CharIOExam2.java"));
					pw = new PrintWriter(new FileWriter("test.txt"));//현재는 filewriter없이도 적을 수 있다.
					String line = null;
					while((line = br.readLine()) != null) {
						pw.println(line);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					pw.close();
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				

	}

}
