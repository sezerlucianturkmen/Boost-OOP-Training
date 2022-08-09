package com.Sezer;

import com.Sezer.controler.DersController;

public class Runner {

	public static void main(String[] args) {

		DersController dersController = new DersController();
		dersController.dersIslemleri();

		// DataBase.dersListesi.add(new Ders("JavaEE", "Java da Web Uygulamları
		// geliştirmek"));
		// DataBase.dersListesi.add(new Ders("JavaSE", "Java temlleri ve dili
		// kullanma"));
		//
		// DataBase.dersListesi.forEach(d -> d.toString());

	}

}
