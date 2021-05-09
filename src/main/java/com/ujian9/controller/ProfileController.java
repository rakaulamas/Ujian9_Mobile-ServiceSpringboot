package com.ujian9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujian9.entity.Profile;
import com.ujian9.repository.ProfileRepository;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	ProfileRepository profileRepo;
	
	@GetMapping("/")
	public List<Profile> getAll() {
		return(List<Profile>) profileRepo.findAll();
	}
	
	@PostMapping("/add")
	public String addData(@RequestBody Profile profile) {
		this.profileRepo.save(profile);
		return "Berhasil Input";
	}
	
	@GetMapping("/{nama}")
	public List<Profile> getAllByNama(@PathVariable String nama) {
		return (List<Profile>) this.profileRepo.findByNama(nama);
	}
	
	@GetMapping("/email/{email}")
	public List<Profile> getAllByEmail(@PathVariable String email) {
		return (List<Profile>) this.profileRepo.findByEmail(email);
	 }

	@GetMapping("/phone/{phone}")
	public List<Profile> getAllByPhone(@PathVariable String phone) {
		return (List<Profile>) this.profileRepo.findByPhone(phone);
	}
	
	@GetMapping("/address/{address}")
	public List<Profile> getAllByAddress(@PathVariable String address) {
		return (List<Profile>) this.profileRepo.findByAddress(address);
	}
	
	@DeleteMapping("/delete/{id}")
	public String getDelete(@PathVariable String id){
		this.profileRepo.deleteById(Long.parseLong(id));
		return "Terhapus";
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@PathVariable long id, @RequestBody Profile profile) {
		profile.setId(id);
		this.profileRepo.save(profile);
		return "Berhasil Di Update";
	}
	
}
