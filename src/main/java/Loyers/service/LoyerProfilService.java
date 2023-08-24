package Loyers.service;

import java.util.List;

import Loyers.model.LoyerProfil;

public interface LoyerProfilService {
	
	LoyerProfil AddLoyerProfil(LoyerProfil loyerProfil);
	List<LoyerProfil> findAll();
	List<LoyerProfil> searchByName(String nom);
	List<LoyerProfil> searchByEmailContains(String email);
	LoyerProfil searchById(long id);
	void deleteLoyerProfil(long id);

}
