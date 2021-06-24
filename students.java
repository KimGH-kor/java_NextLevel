
public class students {
	String name;
	String number;
	int birthYear;
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((number == null) ? 0 : number.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		students other = (students) obj;
//		if (number == null) {
//			if (other.number != null)
//				return false;
//		} else if (!number.equals(other.number))
//			return false;
//		return true;
//	} 이 코드는 메뉴 source탭에서 자동으로 생성 해준다. 이것을 사용하면 equals과 hashCode값을 같게 만들어준다.
	@Override
	public String toString() {
		return "students [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		students s1 = new students();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 2000;
		
		students s2 = new students();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 2000;
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}//다르다고 나온다.
		
		System.out.println(s1.hashCode());//
		System.out.println(s2.hashCode());//s1과 s2는 다른 값이 나온다.
		
		System.out.println(s1);//결과값이 students@7a81197d로 나온다. 안의 속성을 나타내고 싶은것이라면
		                       //source탭에서 tostring를 추가시켜주어야한다.
	}


	
	
}
