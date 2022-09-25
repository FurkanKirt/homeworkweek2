package hw2inharitanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new TarimKrediMaager());
	}

}
