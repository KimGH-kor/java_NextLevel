import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
		fis = new FileInputStream("C:/Users/Tenzi/Desktop/Java/javanext/java_NextLevel/ByteExam1.java");//�޾ƿ� ����
		fos = new FileOutputStream("Byte.txt");//��� �� ��
		
		//������ 1����Ʈ�� �о��ٸ� �̷��� �ϸ� �ѹ��� 512����Ʈ�� �д´�.
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
