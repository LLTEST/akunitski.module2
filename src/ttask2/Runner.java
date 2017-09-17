package ttask2;

import java.util.*;

public class Runner {

	public static void main(String[] args) {


		int k = 30000;
		List<String> list = new LinkedList<String>();
		// TODO Auto-generated method stub
		Date startLinked = new Date();
		for (int i = 0; i < k; i++) {
			String e = "a";
			list.add(e);

		}
		Date finishLinked = new Date();
		System.out.print("Time of execution of add-LinkedList: ");
		System.out.println(finishLinked.getTime() - startLinked.getTime());

		Date startLinked5 = new Date();
		for (int i = 0; i < k; i++) {
			Object s = "a";
			list.get(i).equals(s);
		}
		Date finishLinked5 = new Date();
		System.out.print("Time of execution of search-LinkedList: ");
		System.out.println(finishLinked5.getTime() - startLinked5.getTime());

		Date startLinked3 = new Date();
		for (int i = 0; i < k; i++) {
			String e = "a";
			list.remove(e);
		}
		Date finishLinked3 = new Date();
		System.out.print("Time of execution of remove-LinkedList: ");
		System.out.println(finishLinked3.getTime() - startLinked3.getTime()+"\n");

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		Date startLinked2 = new Date();
		for (int i = 0; i < k; i++) {
			int l = 0;
			arrlist.add(l);
		}

		Date finishLinked2 = new Date();
		System.out.print("Time of execution of add-Arraylist: ");
		System.out.println(finishLinked2.getTime() - startLinked2.getTime());

		Date startLinked6 = new Date();
		for (int i = 0; i < k; i++) {
			Object arg0 = 0;
			arrlist.get(i).equals(arg0);
		}
		Date finishLinked6 = new Date();
		System.out.print("Time of execution of search-Arraylist: ");
		System.out.println(finishLinked6.getTime() - startLinked6.getTime());

		Date startLinked4 = new Date();
		for (int i = 0; i < k; i++) {
			int l = 0;
			arrlist.remove(l);
		}
		Date finishLinked4 = new Date();
		System.out.print("Time of execution of remove-Arraylist: ");
		System.out.println(finishLinked4.getTime() - startLinked4.getTime()+"\n");

		HashMap<Integer, String> ns = new HashMap<Integer, String>();
		Date startLinked7 = new Date();
		for (int i = 0; i < k; i++) {
			ns.put(i, "a");
		}
		Date finishLinked7 = new Date();
		System.out.print("Time of execution of add-HashMap: ");
		System.out.println(finishLinked7.getTime() - startLinked7.getTime());

		Date startLinked8 = new Date();
		for (int i = 0; i < k; i++) {
			Object arg0 = "a";
			ns.get(i).equals(arg0);
		}
		Date finishLinked8 = new Date();
		System.out.print("Time of execution of search-HashMap: ");
		System.out.println(finishLinked8.getTime() - startLinked8.getTime());

		Date startLinked9 = new Date();
		for (int i = 0; i < k; i++) {
			ns.remove(i);
		}
		Date finishLinked9 = new Date();
		System.out.print("Time of execution of remove-HashMap: ");
		System.out.println(finishLinked9.getTime() - startLinked9.getTime()+"\n");

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		Date startLinked10 = new Date();
		for (int i = 0; i < k; i++) {
			tmap.put(i, "a");
		}
		Date finishLinked10 = new Date();
		System.out.print("Time of execution of add-TreeMap: ");
		System.out.println(finishLinked10.getTime() - startLinked10.getTime());
		
		Date startLinked11 = new Date();
		for (int i = 0; i < k; i++) {
			Object arg0 = "a";
			tmap.get(i).equals(arg0);
		}
		Date finishLinked11 = new Date();
		System.out.print("Time of execution of search-TreeMap: ");
		System.out.println(finishLinked11.getTime() - startLinked11.getTime());
		
		Date startLinked12 = new Date();
		for (int i = 0; i < k; i++) {
			tmap.remove(i);
		}
		Date finishLinked12 = new Date();
		System.out.print("Time of execution of remove-TreeMap: ");
		System.out.println(finishLinked12.getTime() - startLinked12.getTime()+"\n");
		
	}
}
