
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
//	} �� �ڵ�� �޴� source�ǿ��� �ڵ����� ���� ���ش�. �̰��� ����ϸ� equals�� hashCode���� ���� ������ش�.
	@Override
	public String toString() {
		return "students [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		students s1 = new students();
		s1.name = "ȫ�浿";
		s1.number = "1234";
		s1.birthYear = 2000;
		
		students s2 = new students();
		s2.name = "ȫ�浿";
		s2.number = "1234";
		s2.birthYear = 2000;
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}//�ٸ��ٰ� ���´�.
		
		System.out.println(s1.hashCode());//
		System.out.println(s2.hashCode());//s1�� s2�� �ٸ� ���� ���´�.
		
		System.out.println(s1);//������� students@7a81197d�� ���´�. ���� �Ӽ��� ��Ÿ���� �������̶��
		                       //source�ǿ��� tostring�� �߰������־���Ѵ�.
	}


	
	
}
