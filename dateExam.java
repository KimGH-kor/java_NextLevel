import java.text.SimpleDateFormat;
import java.util.Date;

public class dateExam {

	public static void main(String[] args) {
		Date date = new Date();//���� �ð��� ��¥�� date�� ������ �ȴ�.
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' a hh:mm:ss  zzz");//�޸� �빮��, ������ a�� ��������ǥ��, zzz�� ǥ�ؽø� ��Ÿ�� �ѱ��� KST
		System.out.println(ft.format(date));
		
		System.out.println(date.getTime()); //���� �ð�
		
		long today = System.currentTimeMillis(); //longŸ������ ���� �ð��� ������
		System.out.println(today);
		
		System.out.println(today - date.getTime());//ó�� �ӵ��� ���� �� �ִ�.
	}

}
