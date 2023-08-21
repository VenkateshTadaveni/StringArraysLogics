package com.sathya.mapexmple;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class BankAcc {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> Obj = new LinkedHashMap<String, Integer>();
		Obj.put("12.34.56.67", 8);
		Obj.put("67.23.56.86", 10);
		Obj.put("125.099.256.45", 100);
		Obj.put("010.34.56.104", 43);
		Obj.put("052.09.098.77", 34);

		System.out.println(Obj);
		
		System.out.println("********Key*********");
		
		Set<String> obj1 = Obj.keySet();
		System.out.println(obj1);
		System.out.println("******Values*********");
		Collection<Integer> value = Obj.values();
		System.out.println(value);
		System.out.println("************Entry Both Key & value***********");
		Set<Entry<String, Integer>> entryBoth = Obj.entrySet();
		System.out.println(entryBoth);
		System.out.println("**********Using for each***********");
		for (Entry<String, Integer> entry : entryBoth) {
			String s = entry.getKey();
			Integer i = entry.getValue();

			System.out.println("Ip is..." + s +" ---> "+"Account is..." + i);

		}

	}

}
