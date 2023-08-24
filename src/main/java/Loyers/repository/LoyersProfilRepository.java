package Loyers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import Loyers.model.LoyerProfil;

@CrossOrigin("*")
public interface LoyersProfilRepository extends JpaRepository<LoyerProfil, Long> {

	List<LoyerProfil> findByNom(String nom);
	public List<LoyerProfil> findByEmailContains (String email);

}
