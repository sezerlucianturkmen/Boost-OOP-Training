package com.Sezer.repository.entity;

import java.util.UUID;

public class Ders {

	String id;
	String ad;
	String aciklama;

	public Ders(String ad, String aciklama) {
		super();
		id = UUID.randomUUID().toString();
		this.ad = ad;
		this.aciklama = aciklama;
	}

	public String getId() {
		return id;
	}

	public String getAd() {
		return ad;
	}

	public String getAciklama() {
		return aciklama;
	}

	@Override
	public String toString() {
		return "Ders [id=" + id + ", ad=" + ad + ", aciklama=" + aciklama + "]";
	}

}
