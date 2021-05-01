package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Ýnternet Þubesi"; 
		double dolarDun = 8.16;
		double dolarBugun = 8.18;
		//int vade = 20;
		//boolean dustuMu = false;
		
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü");
			//true olursa çalýþýr
		}else if(dolarBugun>dolarDun) {
			System.out.println("dolar yükseldi");
		}
		else {
			System.out.println("Dolar eþit");
		}
		
		//String kredi1 = "hýzlý kredi";
		//String kredi2 = "mutlu emekli";
		//String kredi3 = "konut kredisi";
		//String kredi4 = "çiftçi kredisi";
		//String kredi5 = "msb kredi";
		
		//set //stringin yanýndaki iþaret arraydir. dizi anlamýný katar.
		String[] krediler = {"hýzlý kredi","mutlu emekli","konut kredisi",
				"çiftçi kredisi","msb kredi","meb kredisi","kültür bakanlýðý kredisi"};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//sayaç güdümlü döngü
		for(int i = 0; i<krediler.length;i++) {
			System.out.println(krediler[0]); //7 kere hýzlý kredi yazdýrýr
			System.out.println(krediler[i]); //elemanlarý yazdýrýr
		}
		
		//stack
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		System.out.println(sayi2);
		
		//heap
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		
		String sehir1 = "ankara";
		String sehir2 = "istanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
		
		
		
		
	}

}
 
   
