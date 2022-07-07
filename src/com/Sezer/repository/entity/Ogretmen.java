package com.Sezer.repository.entity;

public class Ogretmen extends Kisi {

	Ders ders;
	int uzmanlikSuresi;

	public Ogretmen(String ad, String soyad, String adres, String telefon, int yas, Cinsiyet cinsiyet, Ders ders,
			int uzmanlikSuresi) {
		super(ad, soyad, adres, telefon, yas, cinsiyet);
		this.ders = ders;
		this.uzmanlikSuresi = uzmanlikSuresi;
	}

	public Ders getDers() {
		return ders;
	}

	public int getUzmanlikSuresi() {
		return uzmanlikSuresi;
	}

	@Override
	public String toString() {
		return "Ogretmen [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", telefon=" + telefon
				+ ", yas=" + yas + ", cinsiyet=" + cinsiyet + ", ders=" + ders + ", uzmanlikSuresi=" + uzmanlikSuresi
				+ "]";
	}

}
