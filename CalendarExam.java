import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		//calendar�� �߻� Ŭ���� = new�� �ν��Ͻ��� ������ �� ����.
		//�߻�Ŭ������ �ڱ��ڽ��� ���� ���� ����.
		//�׷��� �������� ������ GregorianCalendar�̶� �ڽ� Ŭ������ cal�� ����ش�.
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,100);
        
        System.out.print(cal.get(Calendar.YEAR)+"��"+cal.get(Calendar.MONTH)+"��"+cal.get(Calendar.DATE)+"��");
	}

}
