package Arrayler;

import java.util.ArrayList;

public class Alist {
	
	public static void main(String[]args){
		ArrayList<String> dizi = new ArrayList<String>();
		dizi.add("red");
		dizi.add("blue");
		dizi.add("purple");
		dizi.add(1,"pink");
		
		for (int i=0 ; i<dizi.size() ; i++){
		
		System.out.println(dizi.get(i));
		
		}
		if(dizi.contains("red")){
			System.out.println("Dizi Ýçinde red var.");

		}else

			System.out.println("Dizi Ýçinde red yok");
		System.out.println("Pinkin indexi : " + dizi.indexOf("pink"));

		dizi.clear();
		for (int i=0 ; i<dizi.size() ; i++){
			System.out.println(dizi.get(i));
		}
			
			
	}

}
