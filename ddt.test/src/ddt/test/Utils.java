package ddt.test;

import java.util.List;

public class Utils {

	@SuppressWarnings("rawtypes")
	public static boolean compareLists(List l1, List l2){
		
		if(l1 == null || l2 == null) 
			return false;
		if(l1.equals(l2))
			return true;
		
		if(l1.size() != l2.size())
			return false;
		
		for (Object o1 : l1) {
			Object o2 = l2.get(l1.indexOf(o1));
			if (o1 == null) {
				return false;
			} else if (!o1.equals(o2))
				return false;
		}

		return true;
	}

}
