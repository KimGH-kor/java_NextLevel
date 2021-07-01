import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapexam {

	public static void main(String[] args) {
		//key와 value가 같이 저장 되어야한다.
		Map<String, String> map = new HashMap<String, String>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		//같은 키갑을 넣었을 경우 값이 바뀐다.
		map.put("001", "kang");
		
		System.out.println(map.size());//3
		System.out.println(map.get("001"));//kang
		
		Set<String> keys = map.keySet();//key만 꺼내서 set자료구조에 넣어준다.
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" +value);
		}
		
	}

}
