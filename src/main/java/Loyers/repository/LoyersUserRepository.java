package Loyers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import Loyers.model.LoyerUser;

@CrossOrigin("*")
public interface LoyersUserRepository extends JpaRepository<LoyerUser, Long> {

/*	List<LoyerProfil> findByNom(String nom);
	public List<LoyerProfil> findByEmailContains (String email);*/

}
