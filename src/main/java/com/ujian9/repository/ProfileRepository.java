package com.ujian9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ujian9.entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
	
	@Query(value = "select * from profile where nama like %?1%",nativeQuery=true)
	List<Profile> findByNama(String nama);
	
	@Query(value = "select * from profile where email like %?1%",nativeQuery=true)
	List<Profile> findByEmail(String email);
	
	@Query(value = "select * from profile where phone like %?1%",nativeQuery=true)
	List<Profile> findByPhone(String phone);
	
	@Query(value = "select * from profile where address like %?1%",nativeQuery=true)
	List<Profile> findByAddress(String address);
	
	
}
