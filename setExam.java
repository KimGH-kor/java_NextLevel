
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean fiag1 = set1.add("kang");//��Ʈ�� ���� ���� �� �ִ�.set�� �ߺ��� �����ؼ� booleanŸ������ �޾ƾ��Ѵ�.
		boolean fiag2 = set1.add("kin");
		boolean fiag3 = set1.add("kang");
		
		System.out.println(set1.size());
		
		System.out.println(fiag1);//true
		System.out.println(fiag2);//true
		System.out.println(fiag3);//false = �ߺ��̶�
		
		//���� ������ ��� set�� Iterator�� �Ἥ ���� �� �ִ�.
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //���� ���� �ִٸ� true�� �ȿ� �ִ� ���� ����
			String str = iter.next();//next() = ó�� ���� ������ ������ ����
			System.out.println(str);
		}
	}

}
