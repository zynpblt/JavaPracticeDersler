package maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ornekler {

	public static void main(String[] args) {
		//kullanicidan kimlik numarasi ad soyad adres bilgileri alin
		//bir mapte depolayin
		//kimlik nosunu girince tum bilgilerini getirsin
		String secim="";
		HashMap<Integer,HashMap<String,String>>kisiListesi=new HashMap<>();
		do {
		
		
		HashMap<String,String>kisiBilgileri=new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen kimlik no giriniz");
		int kimlikNo=scan.nextInt();
		scan.nextLine();
		
		System.out.println("lutfen isim ve soyisim giriniz");
		String isim=scan.nextLine();
		
		System.out.println("lutfen adres giriniz");
		String adres=scan.nextLine();
		
		System.out.println("lutfen telefon giriniz");
		String tel=scan.nextLine();
		
		kisiBilgileri.put("ad", isim);
		kisiBilgileri.put("adres", adres);
		kisiBilgileri.put("telefon", tel);
		
		kisiListesi.put(kimlikNo, kisiBilgileri);
		System.out.println(kisiBilgileri);
		System.out.println("------------------");
		System.out.println(kisiListesi);
		
		
		System.out.println("devam etmek istiyormusunuz/E/H");
		 secim=scan.nextLine();
	}
		while(secim.equalsIgnoreCase("E"));
		
		
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
