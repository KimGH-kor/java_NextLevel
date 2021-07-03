import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
		fis = new FileInputStream("C:/Users/Tenzi/Desktop/Java/javanext/java_NextLevel/ByteExam1.java");//받아올 파일
		fos = new FileOutputStream("Byte.txt");//출력 할 곳
		
		//전에껀 1바이트씩 읽었다면 이렇게 하면 한번에 512바이트를 읽는다.
		int readCount = -1;
		byte[] buffer = new byte[512];
		while((readCount = fis.read(buffer)) != -1) {
			fos.write(buffer,0 , readCount);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
				System.out.println(endTime - startTime);
	}

}
