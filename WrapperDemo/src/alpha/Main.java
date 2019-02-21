package alpha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

interface i1 {
	
}


interface i2{
	
}



interface i3 extends i1,i2{
	
}

public class Main {

	private static ArrayList<String> arr = new ArrayList();

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/***
		int i = 10;
		
		//Boxing
		Integer iB = new Integer(i);
		Integer t = new Integer("10");
		
		int t1 = Integer.parseInt("10");
		
		System.out.println(t.intValue());
		
		float f1 = Float.parseFloat("100.99");
		
		
		
		//Auto-boxing
		Integer iAb = i;
		
		//Un-boxing;
		Integer iUb = iB.intValue();
		System.out.println("Unboxed value: " + iUb);
		
		
		//Auto-unboxing
		int iAub = iAb; 
		System.out.println("Auto Unboxed value: " + iAub);
		
		// Value of function performs boxing.
		
		Integer temp1 = Integer.valueOf("10");
		
		//
		***/
	
		
		arr.add("ONE");
		arr.add("THREE");
		arr.add(1, "TEN");
		arr.add(1, "ELEVEN");
		arr.add(1, "TWELVE");
		arr.add(1, "1");
		arr.add(1, "2");
		arr.add(1, "3");
		arr.add(1, "4");
		arr.add(1, "5");
		String str = arr.remove(arr.indexOf("THREE"));
		System.out.println();
		
		//str = arr.remove("TEN");
		
		System.out.println("str=" + str);
		System.out.println("");
		System.out.println();
		System.out.println("Hello");
		//
		
		for(int p=0;p<arr.size();p++) {
			System.out.println((p+1) + ". " + arr.get(p));
		}
		
		arr.set(3, "TREE");
		
		for(int p=0;p<arr.size();p++) {
			System.out.println((p+1) + ". " + arr.get(p));
		}
		
		
		ArrayList<String> newList = addListToLIst(arr);
		
		System.out.println(newList);
		System.out.println(arr);
		
		
		ListIterator<String> listIt = newList.listIterator(12);
		System.out.println();
		
		System.out.println("*********Forward*********");
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		System.out.println("Next Index=" + listIt.nextIndex());
		
		System.out.println();
		System.out.println("*********Backward*********");
		
		System.out.println(("Previous index=" + listIt.nextIndex()));
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());
		}
		
		System.out.println("Using iterator");
		
		Iterator<String> newIt = newList.iterator();
		
		
		while(newIt.hasNext()) {
			System.out.println(newIt.next());
		}
		
	
		ArrayList newArrayList = new ArrayList();
		
		
		newArrayList.add("123");
		newArrayList.add(123);
		newArrayList.add(123.45);
		
		
		for(int q=0;q<newArrayList.size();q++) {
			System.out.println(newArrayList.get(q));
		}
		
		for(Object ob : newArrayList) {
			String str1 = (String)ob;
			System.out.println(str1);
		}
		
	}
	
	
	public static ArrayList<String> addListToLIst(ArrayList<String> arr) {
		ArrayList<String> newList = new ArrayList<>();
		
		newList.add("NO");
		newList.add("CAN");
		newList.add("BEAT");
		newList.add("ME");
		
		
		newList.addAll(arr);
		
		return newList;
		
	}

}
