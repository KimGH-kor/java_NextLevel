import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
	public static void main(String[] args) {
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream("byte.txt"));//아웃풋스트림을 매개변수로 받아 들인다.
																						  // 이렇게 적으면 여러타입을 txt에 넣을 수 있다.
		){
			out.writeInt(100);
			out.writeBoolean(true);
			out.writeDouble(50.5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
