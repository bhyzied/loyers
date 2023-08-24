package Loyers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Loyers.model.LoyerProfil;
import Loyers.repository.LoyersProfilRepository;

@Service
public class LoyerProfilServiceImpl implements LoyerProfilService {

	@Autowired
	LoyersProfilRepository loyersProfileRepository;

	@Override
	public LoyerProfil AddLoyerProfil(LoyerProfil loyerProfil) {
		return loyersProfileRepository.save(loyerProfil);
	}

	@Override
	public List<LoyerProfil> findAll() {
		return loyersProfileRepository.findAll();
	}

	@Override
	public List<LoyerProfil> searchByName(String nom) {
		return loyersProfileRepository.findByNom(nom);
	}

	@Override
	public LoyerProfil searchById(long id) {
		return loyersProfileRepository.findById(id).get();
	}

	@Override
	public void deleteLoyerProfil(long id) {
		loyersProfileRepository.deleteById(id);
	}

	@Override
	public List<LoyerProfil> searchByEmailContains(String email) {
		return loyersProfileRepository.findByEmailContains(email);
	}
}
