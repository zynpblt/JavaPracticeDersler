package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapOrnek {

	public static void main(String[] args) {
		HashMap<Integer,String> ogrenciBilgileri= new HashMap<>();
		ogrenciBilgileri.put(937,"Ali Can-7/B");
		ogrenciBilgileri.put(531,"Ayse Cetin-8/A");
		ogrenciBilgileri.put(856,"Ahmet Demir-5/B");
		ogrenciBilgileri.put(214,"Melek Durmaz-6/A");
		ogrenciBilgileri.put(832,"Zeynep Bolat-11F");
		//yeni bir ogrenci girisi yapilsin.var olan numara ile kayit yapilmaya calisildiginda
		//o numarali kaydin oldugunu ve o numaraya ait kisinin bilgisini getirsin
		//eger belirtilen numara kayitli degilse kaydiniz eklenmistir desin
		
		//System.out.println(ogrenciBilgileri);
		
		//System.out.println(ogrenciBilgileri.putIfAbsent(531,"seda Yilmaz"));
		Scanner scan=new Scanner(System.in);
		
		System.out.println("numara giriniz");
		
		int numara=scan.nextInt();
		scan.nextLine();
		
		/*System.out.println("ogrenci bilgisi giriniz");
		
		String bilgi=scan.next();
		System.out.println();
		if (ogrenciBilgileri.putIfAbsent(numara,bilgi)==null) {
			System.out.println("kaydiniz eklenmistir :"+ogrenciBilgileri.get(numara));
		}else {
			System.out.println("Boyle bir kayit mevcuttur Kayit :"+ogrenciBilgileri.putIfAbsent(numara,bilgi) +"kisisine aittir");
		}
		
		//Bir numara girildiginde o kisiye ait sinif bilgilerini bize gostersin
		//eger kayit yoksa boyle bir kayit yok mesaji versin*/
		
		System.out.println(ogrenciBilgileri.get(numara).indexOf("-"));
		
		System.out.println(ogrenciBilgileri.get(numara).substring(ogrenciBilgileri.get(numara).indexOf("-")+1));
		
		//maplarda bir key e kasrsilik birden fazla value olabilir mi?
		/*2000      -->kitap1
		            -->kitap2
		            -->kitap3
		2001        -->---------
		            -->-------*/
		
		
		
	scan.close();	
		
	}

}
