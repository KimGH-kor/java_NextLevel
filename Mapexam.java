import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapexam {

	public static void main(String[] args) {
		//key�� value�� ���� ���� �Ǿ���Ѵ�.
		Map<String, String> map = new HashMap<String, String>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		//���� Ű���� �־��� ��� ���� �ٲ��.
		map.put("001", "kang");
		
		System.out.println(map.size());//3
		System.out.println(map.get("001"));//kang
		
		Set<String> keys = map.keySet();//key�� ������ set�ڷᱸ���� �־��ش�.
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" +value);
		}
		
	}

}
