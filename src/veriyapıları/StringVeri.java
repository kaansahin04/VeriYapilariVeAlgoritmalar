package veriyapıları;

public class StringVeri {

	public static void main(String[] args) {
		String kelime="bilgisayar";
		System.out.println(kelime);
		System.out.println();
		
		String yeniSatır="Ben Kaan.\nBilgisayar Mühendisliği okuyorum.";
		System.out.println(yeniSatır);
		System.out.println();
		
		String yazı="Veri Yapıları";
		char index0=yazı.charAt(0);		//index alma
		char index5=yazı.charAt(5);
		String index5_13=yazı.substring(5, 13);		//index aralığı alma
		System.out.println(index0);
		System.out.println(index5);
		System.out.println(index5_13);
		System.out.println();
		
		String düzenleKelime=kelime.substring(0, 5) + "S" + kelime.substring(6, 10);
		String kelime2="mühendisliği";
		String kelime3=düzenleKelime.concat(kelime2);	//String birleştirme
		System.out.println(kelime3);
		System.out.println();
		
		int uzunluk=yeniSatır.length();		//uzunluk alma
		System.out.println(uzunluk);
		System.out.println();

		String kelime3Büyük=kelime3.toUpperCase();	//harfleri büyütme
		String kelime3Küçük=kelime3.toLowerCase();	//harfleri küçültme
		System.out.println(kelime3Büyük);
		System.out.println(kelime3Küçük);
		System.out.println();
		
		String boşluk="  üniversite ";
		String boşlukSil=boşluk.trim();				//baştaki ve sondaki boşlukları siler
		String boşlukSil2=boşluk.stripLeading();	//sadece baştaki boşlukları siler
		String boşlukSil3=boşluk.stripTrailing();	//sadece sondaki boşlukları siler
		System.out.println(boşlukSil);
		System.out.println(boşlukSil2);
		System.out.println(boşlukSil3);
		System.out.println();
		
		String tekrar="futbol";
		String tekrar_3=tekrar.repeat(3);	//String tekrarlama
		System.out.println(tekrar_3);
		System.out.println();
		
		String içerecek="kodlama";
		boolean içeriyor=içerecek.contains("k");	//içeren ifade sorgular
		boolean içeriyor2=içerecek.contains("K");
		System.out.println(içeriyor);
		System.out.println(içeriyor2);
		System.out.println();
		
		String başlabit="yazılım";
		boolean başlıyor=başlabit.startsWith("yaz");	//başladığı ifadeyi sorgular
		boolean bitiyor=başlabit.endsWith("zıl");		//bittiği ifadeyi sorgular
		System.out.println(başlıyor);
		System.out.println(bitiyor);
		System.out.println();
		
		boolean aynıİfade=kelime.regionMatches(0, düzenleKelime, 0, 5);		//2 String'in belirli karakterleri aynı mı
		System.out.println(aynıİfade);
		System.out.println();
		
		String boş=" ";
		String boş2="";
		boolean boşmu=boş.isBlank();	//uzunluk 0 mı veya boşluk karakteri mi içeriyor
		boolean boşmu2=boş.isEmpty();	//uzunluk 0 mı
		boolean boş2mu=boş2.isBlank();
		boolean boş2mu2=boş2.isEmpty();
		System.out.println(boşmu);
		System.out.println(boşmu2);
		System.out.println(boş2mu);
		System.out.println(boş2mu2);
	}
	
}
