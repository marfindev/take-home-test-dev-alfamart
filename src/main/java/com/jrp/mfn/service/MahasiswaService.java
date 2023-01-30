package com.jrp.mfn.service;

import java.util.List;

import com.jrp.mfn.model.Mahasiswa;

public interface MahasiswaService {
	
	List<Mahasiswa> getAllMahasiswa();
	void saveMahasiswa(Mahasiswa mahasiswa);
	Mahasiswa getMahasiswaById(long id);
	void deleteMahasiswaById(long id);
	
}
