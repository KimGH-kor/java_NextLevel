
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean fiag1 = set1.add("kang");//스트링 값만 받을 수 있다.set은 중복을 허용안해서 boolean타입으로 받아야한다.
		boolean fiag2 = set1.add("kin");
		boolean fiag3 = set1.add("kang");
		
		System.out.println(set1.size());
		
		System.out.println(fiag1);//true
		System.out.println(fiag2);//true
		System.out.println(fiag3);//false = 중복이라서
		
		//값을 꺼내는 방법 set은 Iterator을 써서 꺼낼 수 있다.
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //꺼낼 것이 있다면 true값 안에 있는 값을 리턴
			String str = iter.next();//next() = 처음 값을 꺼내고 다음껄 참조
			System.out.println(str);
		}
	}

}
