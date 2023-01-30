package com.jrp.mfn.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa")

public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "tgl_lahir")
	private Date tgllahir;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "jurusan")
	private int jurusan;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Date getTgllahir() {
		return tgllahir;
	}

	public void setTgllahir(Date tgllahir) {
		this.tgllahir = tgllahir;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getJurusan() {
		return jurusan;
	}

	public void setJurusan(int jurusan) {
		this.jurusan = jurusan;
	}

		
	

}
