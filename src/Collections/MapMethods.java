package Collections;

import java.util.HashMap;

public class MapMethods {

	public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(101, "Ali Han");// eleman eklemek için kullanılır. 
		hm1.put(102, "veli Can");
		hm1.put(103, "Ayse Tan");
		hm1.put(101, "Kemal Yıldız"); // aynı key kullanıldığında eski kaydın üzerine yazar.
		System.out.println(hm1);
		hm1.put(104, "veli Can");//tekrarli key e izin vermez ancak tekrarli value ya izin verir
		System.out.println(hm1);
		
		hm1.put(null,"Merve aslan");
		System.out.println(hm1);
		hm1.put(null,"hakan inal");
		System.out.println(hm1);
		hm1.put(105,null);
		System.out.println(hm1);
		hm1.put(106, null);
		System.out.println(hm1);
		
		
		System.out.println(hm1.get(103));
		
		System.out.println(hm1.values());
		
		System.out.println(hm1.keySet());
		
		hm1.putIfAbsent(104, "kubilay tuncel");//belirtilen key e ait key ve value oldugu icin eklemedi
		
		System.out.println(hm1);
		
		hm1.putIfAbsent(107, "hakan tetik");
		System.out.println(hm1);
		hm1.putIfAbsent(105, "faruk efehan");
		
		HashMap<Integer,String> hm2=new HashMap<>();
		hm2.put(107,"elma");
		hm2.put(106,"Armut");
		hm2.put(200,"mandalina");
		hm1.putAll(hm2);
		System.out.println(hm1);
		
		System.out.println("1.mapin eleman sayisi :"+hm1.size());//8
		System.out.println("2.mapin eleman sayisi :"+hm2.size());//2
		
		hm2.remove(200);
		System.out.println(hm2);
		
	}

}
