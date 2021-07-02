import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timepoint = LocalDateTime.now();//���� ��¥, �ð��� �����ش�.
		System.out.println(timepoint);//2021-07-01T19:07:29.186156400
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);//���� ���ϴ� ��¥ �����
		System.out.println(ld1);//2012-12-12
		
		LocalTime lt1 = LocalTime.of(17, 18);//���� ���ϴ� �ð� �����
		System.out.println(lt1);//17:18
		LocalTime lt2 = LocalTime.parse("10:15:30");//���� ��� �����
		System.out.println(lt2);//10:15:30
		
		LocalDate thedate = timepoint.toLocalDate();//������ ��¥ ��������
		System.out.println(thedate);//2021-07-01
		System.out.println(timepoint.getMonth());//JULY ���  getMonthValue() = 1
//		System.out.println(timepoint.get);get���� ��õâ���� ���������� ������ ������ �� �ִ�.
		
	    Month month = timepoint.getMonth();
	    int day = timepoint.getDayOfMonth();
	    int hour = timepoint.getHour();
	    int minute = timepoint.getMinute();
	    int second = timepoint.getSecond();
	    System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);
	}

}
