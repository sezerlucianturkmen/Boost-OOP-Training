package com.Sezer.repository.entity;

import java.util.List;

public class Ogrenci extends Kisi {

	OgrenciDurumu durumu;
	IsSureci isSureci;
	List<KonuDuzey> konuDuzeyListesi;

	public Ogrenci(String ad, String soyad, String adres, String telefon, int yas, Cinsiyet cinsiyet,
			OgrenciDurumu durumu, IsSureci isSureci, List<KonuDuzey> konuDuzeyListesi) {
		super(ad, soyad, adres, telefon, yas, cinsiyet);
		this.durumu = durumu;
		this.isSureci = isSureci;
		this.konuDuzeyListesi = konuDuzeyListesi;
	}

	public OgrenciDurumu getDurumu() {
		return durumu;
	}

	public IsSureci getIsSureci() {
		return isSureci;
	}

	public List<KonuDuzey> getKonuDuzeyListesi() {
		return konuDuzeyListesi;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", telefon=" + telefon
				+ ", yas=" + yas + ", cinsiyet=" + cinsiyet + ", durumu=" + durumu + ", isSureci=" + isSureci
				+ ", konuDuzeyListesi="
				+ (konuDuzeyListesi != null ? konuDuzeyListesi.subList(0, Math.min(konuDuzeyListesi.size(), maxLen))
						: null)
				+ "]";
	}

}