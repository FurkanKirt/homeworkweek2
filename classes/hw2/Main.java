package hw2;

public class Main {

	public static void main(String[] args) {

		// referans tip
		CustoomerManager custoomerManager = new CustoomerManager();
		CustoomerManager custoomerManager2=new CustoomerManager();
		custoomerManager=custoomerManager2;
		custoomerManager.Add();
		custoomerManager.Remove();
		custoomerManager.Update();
		
		//heapte çalışmıyor-interaktif değil
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//heapte çalışıyor-interaktif--diziler referans tiptir
		int[] sayilar1=new int[]{1,2,3};
		int[] sayilar2=new int[]{4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
	}

}
