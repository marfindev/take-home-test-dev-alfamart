package com.jrp.mfn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.jrp.mfn.model.Mahasiswa;
import com.jrp.mfn.service.MahasiswaService;



@Controller
public class MahasiswaController {
	
	@Autowired
	private MahasiswaService mahasiswaService;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listMahasiswa", mahasiswaService.getAllMahasiswa());
		return "index";
	}
	
	@GetMapping("/newMahasiswa")
	public String newMahasiswa(Model model) {
		Mahasiswa mahasiswa = new Mahasiswa();
		model.addAttribute("mahasiswa", mahasiswa);
		return "new_mahasiswa";
	}
	
	@PostMapping("/saveMahasiswa")
	public String saveMahasiswa(@ModelAttribute("mahasiswa") Mahasiswa mahasiswa) {
		mahasiswaService.saveMahasiswa(mahasiswa);
		return "redirect:/";
	}
	
	@GetMapping("/editMahasiswa/{id}")
	public String editMahasiswa(@PathVariable (value = "id") long id, Model model) {
		Mahasiswa mahasiswa = mahasiswaService.getMahasiswaById(id);
		model.addAttribute("mahasiswa", mahasiswa);
		return "edit_mahasiswa";		
	}
	
	@GetMapping("/deleteMahasiswa/{id}")
	public String deleteMahasiswa(@PathVariable (value = "id") long id) {
		this.mahasiswaService.deleteMahasiswaById(id);
		return "redirect:/";
	}
}
