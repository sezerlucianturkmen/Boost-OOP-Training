package com.Sezer.controler;

import java.util.Scanner;

import com.Sezer.repository.DersRepository;
import com.Sezer.repository.entity.Ders;

public class DersController {

	DersRepository dersRepository = new DersRepository();

	private void dersEkleme() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("******DERS EKLEME SAYFASI******");
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Ders Adını Giriniz...: ");
		String ad = scanner.nextLine();
		System.out.println("Ders açıklamasını Giriniz..: ");
		String aciklama = scanner.nextLine();
		Ders ders = new Ders(ad, aciklama);
		dersRepository.save(ders);
		// DataBase.dersListesi.add(ders);
	}

	private void dersListesiniGoster() {
		System.out.println("********************************");
		System.out.println("******DERS LİSTESİ SAYFASI******");
		System.out.println("********************************");
		System.out.println();
		int no = 1;
		for (Ders ders : dersRepository.findAll()) {
			System.out.println("S.no: " + no + " - ");
			System.out.println(ders.toString());
			no++;
		}
	}

	private void dersSilme() {
		System.out.println("*********************************");
		System.out.println("******DERS SİLME SAYFASI******");
		System.out.println("*********************************");
		System.out.println();
		dersListesiniGoster();
		Scanner sc = new Scanner(System.in);
		System.out.println("Silinecek kayıt no..: ");
		int sno = sc.nextInt();
		Ders ders = dersRepository.findAll().get(sno - 1);
		dersRepository.delete(ders.getId());

	}

	private void dersGuncelleme() {
		System.out.println("*********************************");
		System.out.println("******DERS GÜNCELME SAYFASI******");
		System.out.println("*********************************");
		System.out.println();
		dersListesiniGoster();
		Scanner sc = new Scanner(System.in);
		System.out.println("Güncellenecek kayıt no..: ");
		int sno = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Yeni ad..: ");
		String ad = sc.nextLine();
		System.out.println("Yeni aciklama..: ");
		String aciklama = sc.nextLine();
		Ders ders = dersRepository.findAll().get(sno - 1);
		ders.setAciklama(aciklama);
		ders.setAd(ad);
		dersRepository.update(ders);

	}

	public void dersIslemleri() {
		int secim;
		do {
			System.out.println("********************************");
			System.out.println("*****DERS İŞLEMLERİ SAYFASI*****");
			System.out.println("********************************");
			System.out.println();
			System.out.println("1- Ders Ekleme");
			System.out.println("2- Ders Güncelleme");
			System.out.println("3- Ders Silme");
			System.out.println("4- Ders Listeleme");
			System.out.println("0- ÇIKIŞ");
			Scanner scanner = new Scanner(System.in);
			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				dersEkleme();
				break;
			case 2:
				dersGuncelleme();
				break;
			case 3:
				dersSilme();
				break;
			case 4:
				dersListesiniGoster();
				break;
			case 0:
				System.out.println("Ders işlemlerinde çıkış yapıldı.");
				;
				break;
			default:
				break;
			}
		} while (secim == 0);
	}

}
