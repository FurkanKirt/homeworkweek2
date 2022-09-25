package hw2methods2;

public class Main {

	public static void main(String[] args) {
		int sayi=topla(5,7);
		System.out.println(sayi);
		int topla=topla2(5+4+3+4);
		System.out.println(topla);
	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	//int in peþindeki 3 adet nokta variable arguments
	public static int topla2(int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam=toplam+i;
		}
		return toplam;
	}
}
