package linpeng.netservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GridViewService {
	public static List<HashMap<String,String>> getData() {
		List<HashMap<String,String>> list=new ArrayList<HashMap<String,String>>();
		HashMap<String, String> hash=new HashMap<String, String>();
		hash.put("title", "Ҫ��");
		list.add(hash);
		hash = new HashMap<String, String>();
		hash.put("title", "����");
		list.add(hash);
		hash = new HashMap<String, String>();
		hash.put("title", "�й�");
		list.add(hash);
		hash = new HashMap<String, String>();
		hash.put("title", "����");
		list.add(hash);
		hash = new HashMap<String, String>();
		hash.put("title", "ý��");
		list.add(hash);
		hash = new HashMap<String, String>();
		hash.put("title", "�ۺ�");
		list.add(hash);
		return list;
	}
}
