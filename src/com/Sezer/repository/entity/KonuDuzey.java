package com.Sezer.repository.entity;

import java.util.UUID;

public class KonuDuzey {

	String id;
	Konu konu;
	OgrenimDuzeyi duzeyi;
	int cozulenSoruSayisi;
	int sorulanSoruSayisi;
	int yuzde;

	public KonuDuzey(Konu konu, OgrenimDuzeyi duzeyi, int cozulenSoruSayisi, int sorulanSoruSayisi) {
		super();

		id = UUID.randomUUID().toString();
		this.konu = konu;
		this.duzeyi = duzeyi;
		this.cozulenSoruSayisi = cozulenSoruSayisi;
		this.sorulanSoruSayisi = sorulanSoruSayisi;
		this.yuzde = (cozulenSoruSayisi * 100) / sorulanSoruSayisi;

	}

	public String getId() {
		return id;
	}

	public Konu getKonu() {
		return konu;
	}

	public OgrenimDuzeyi getDuzeyi() {
		return duzeyi;
	}

	public int getCozulenSoruSayisi() {
		return cozulenSoruSayisi;
	}

	public int getSorulanSoruSayisi() {
		return sorulanSoruSayisi;
	}

	public int getYuzde() {
		return yuzde;
	}

	@Override
	public String toString() {
		return "KonuDuzey [id=" + id + ", konu=" + konu + ", duzeyi=" + duzeyi + ", cozulenSoruSayisi="
				+ cozulenSoruSayisi + ", sorulanSoruSayisi=" + sorulanSoruSayisi + ", yuzde=" + yuzde + "]";
	}

}
