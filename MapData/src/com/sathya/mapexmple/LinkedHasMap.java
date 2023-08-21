package com.sathya.mapexmple;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHasMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, BookEx> guide = new LinkedHashMap<Integer, BookEx>();
		guide.put(1, new BookEx(123, "CoreJava", "Mr.RAtanSir"));
		guide.put(2, new BookEx(456, "AdvJava ", "Mr.RatanHero"));
		guide.put(3, new BookEx(678, "Java    ", "Mr.RatanNice"));
		guide.put(4, new BookEx(901, "Spring  ", "Mr.Ratansir"));

		Set<Entry<Integer, BookEx>> books = guide.entrySet();
		for (Entry<Integer, BookEx> book : books) {
			Integer i = book.getKey();
			BookEx s = book.getValue();
			//System.out.println("key is.." + i + " ---> " + "value is:" + " bid is--> " + s.bookid + "bname is--> "
					//+ s.bname + " bauthor is--> " + s.bauthor);
			System.out.println("Key is.." + i + " ---> " + "Value is.." + s.bookid + "  " + s.bname + "  " + s.bauthor);
		}
	}

}
