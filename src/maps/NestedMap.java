package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NestedMap {

	public static void main(String[] args) {
		/*
		 * Kimlik No    ad:nilufer
		 * 			    soyad:demir
		 * 				adres:ankara
		 * 				bolum:dev
		 *  Kimlik No    ad:Lila
		 * 			    soyad:can
		 * 				adres:istanbul
		 * 				bolum:Qa
		 */

		HashMap<Integer,HashMap<String,String>> kisiListesi=new HashMap<>();
		
		HashMap<String,String> kisi1=new HashMap<>();
		kisi1.put("ad","Nilufer");
		kisi1.put("soyad","demir");
		kisi1.put("bolum","dev");
		kisi1.put("adres","ankara");
		

		HashMap<String,String> kisi2=new HashMap<>();
		kisi2.put("ad","ayse");
		kisi2.put("soyad","can");
		kisi2.put("bolum","istanbul");
		kisi2.put("adres","qa");
		
		kisiListesi.put(1548, kisi1);
		kisiListesi.put(9865, kisi2);
		
		System.out.println(kisiListesi);
		
		//maplaerden data getirme
		
		System.out.println(kisiListesi.get(1548));//mapte get methodu ile value e karsilik gelen map i getirdi
		
		System.out.println(kisiListesi.get(1548).get("ad"));
		
		System.out.println(kisiListesi);
		
		//iterator ile butun elemanlari yazdirma
		for (Entry<Integer,HashMap<String,String>> entry : kisiListesi.entrySet()); {
			System.out.println();
		}
		
		
		
		
		
	}

}
