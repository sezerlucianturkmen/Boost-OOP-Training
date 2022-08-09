package com.Sezer.repository;

import java.util.List;

import com.Sezer.repository.entity.Ders;
import com.Sezer.utility.DataBase;

public class DersRepository {

	/**
	 * CRUD işlemlerinini yapıldığı yer.
	 */
	public Ders save(Ders ders) {
		DataBase.dersListesi.add(ders);
		return ders;
	}

	public Ders update(Ders ders) {

		for (Ders d : DataBase.dersListesi) {
			if (d.getId().equals(ders.getId())) {
				d.setAciklama(ders.getAciklama());
				d.setAd(ders.getAd());
			}
		}

		return ders;
	}

	public boolean delete(Ders ders) {
		return true;
	}

	// genel kodlamada tercih edilen yöntem budur.
	public boolean delete(String id) {
		Ders tempDers = null;

		for (Ders d : DataBase.dersListesi) {
			if (d.getId().equals(id)) {
				tempDers = d;
				break;
			}
		}

		DataBase.dersListesi.remove(tempDers);
		return true;
	}

	public boolean delete(int index) {
		return true;
	}

	public List<Ders> findAll() {
		return DataBase.dersListesi;
	}

	public Ders findById(String id) {
		return null;
	}

	public Ders findByAd(String ad) {
		return null;
	}
}
