package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListOfMap {

	public static void main(String[] args) {
		//meyveler sebzeler vitaminler listesini katagori olusturalim
		
		
				HashMap<String,List<String>> karisik=new HashMap<>();
				
				List<String>meyveler=new ArrayList<>();
				meyveler.add("elma");
				meyveler.add("armut");
				meyveler.add("cilek");
				karisik.put("meyveler", meyveler);
				System.out.println(karisik);
				
				List<String>sebzeler=new ArrayList<>(Arrays.asList("patlican","kabak","marul","ispanak"));
				
				karisik.put("sebzeler", sebzeler);
				System.out.println(karisik);
				List<String>vitaminler=new ArrayList<>(Arrays.asList("A","C","D","E"));
				karisik.put("vitaminler", vitaminler);
				System.out.println(karisik);
				
				System.out.println(karisik.get("sebzeler").get(1));
				
				
				
	}

}
