package dbManager;

import java.util.ArrayList;
import java.util.List;

public class PSValueList {
	List<String> type = new ArrayList();
	List<String> value = new ArrayList();

	public void setString(String str){
		type.add("String");
		value.add(str);
	}

	public void setInt(String str){
		type.add("Int");
		value.add(str);
	}

	public String getString(String str){
		String s = str.toString();
		return s;
	}

	public Integer getInt(String str){
		int i = Integer.parseInt(str);
		return i;
	}

}
