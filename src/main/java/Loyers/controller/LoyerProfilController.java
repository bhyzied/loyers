package Loyers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Loyers.model.LoyerProfil;
import Loyers.repository.LoyersProfilRepository;
import Loyers.service.LoyerProfilService;

@RestController
public class LoyerProfilController {
	@Autowired
	LoyerProfilService loyerProfilService;
	@Autowired
LoyersProfilRepository loyersProfilRepository;
	@GetMapping("/listLoyersProfil")
	public List<LoyerProfil> listLoyersProfil() {
		return loyerProfilService.findAll();
	}
	
	@GetMapping("/listLoyersProfil/{id}")
	public LoyerProfil oyersProfil(@PathVariable(name="id")long id) {
		return loyerProfilService.searchById(id);
	}
	
	@PutMapping("/updateLoyersProfil/{id}")
	public LoyerProfil update(@PathVariable(name="id")Long id, @RequestBody LoyerProfil loyerProfil) {
		loyerProfil.setId(id);
		return loyersProfilRepository.save(loyerProfil);
	}
	
	@PostMapping("/addLoyersProfil")
	public LoyerProfil save(@RequestBody LoyerProfil loyerProfil) {
		return loyerProfilService.AddLoyerProfil(loyerProfil);
	}
    @DeleteMapping("/deleteLoyerProfil/{id}")
    public void deleteLoyer(@PathVariable(name="id")Long id) {
    	 loyerProfilService.deleteLoyerProfil(id);
    }
}
