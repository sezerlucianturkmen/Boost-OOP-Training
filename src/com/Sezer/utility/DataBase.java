package com.Sezer.utility;

import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout.Group;

import com.Sezer.repository.entity.Ders;
import com.Sezer.repository.entity.Konu;
import com.Sezer.repository.entity.KonuDuzey;
import com.Sezer.repository.entity.Ogrenci;
import com.Sezer.repository.entity.Ogretmen;

public class DataBase {

	public static List<Ders> dersListesi = new ArrayList<Ders>();
	public static List<Group> grupListesi = new ArrayList<Group>();
	public static List<Konu> konuListesi = new ArrayList<Konu>();
	public static List<KonuDuzey> konuDuzeyListesi = new ArrayList<KonuDuzey>();
	public static List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
	public static List<Ogretmen> ogretmenListesi = new ArrayList<Ogretmen>();
}
