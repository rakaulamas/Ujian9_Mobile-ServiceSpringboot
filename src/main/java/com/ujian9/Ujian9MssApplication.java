package com.ujian9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ujian9.entity.Profile;
import com.ujian9.repository.ProfileRepository;

@SpringBootApplication
public class Ujian9MssApplication implements CommandLineRunner{

	@Autowired
	ProfileRepository profilRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Ujian9MssApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	
		Profile profile = new Profile();
		profile.setNama("Raka");
		profile.setUsername("rakaulamas");
		profile.setPhone(555);
		profile.setAddress("Cijantung");
		profile.setEmail("raka@email.com");
		
		this.profilRepo.save(profile);
	*/
	}

}
