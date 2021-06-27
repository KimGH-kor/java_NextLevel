
public class WrapperExam {

	public static void main(String[] args) {
		int i = 5;//기본형 타입; 객체가 아님 = 참조형이 아님
		Integer i2 = new Integer(5);//객체타입 만드는 법;
		
		//오토박싱 = 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
		Integer i3 = 5;//자동으로 형변환 된 것 = 오토박싱 자바5에서는 안됐지만 그 후부터 가능
		            //5부분이 new Integer(5);로 자동으로 형변환 되는 것
		
		int i4 = i3.intValue();
		//오토언박싱 = 오토박싱과 반대로 객체 타입의 게이터를 기본형 타입 데이터로 자동 형변환
		int i5 = i3;//자바 5 이후부터는 이게 가능
	}

}
