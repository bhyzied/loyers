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

import Loyers.model.LoyerUser;
import Loyers.repository.LoyersUserRepository;
import Loyers.service.LoyerUserService;

@RestController
public class LoyerUserController {
	@Autowired
	LoyerUserService loyerUserService;
	@Autowired
	LoyersUserRepository loyersUserRepository;

	@GetMapping("/listLoyersUser")
	public List<LoyerUser> listLoyersUser() {
		return loyerUserService.findAll();
	}

	@GetMapping("/listLoyersUser/{id}")
	public LoyerUser oyersUser(@PathVariable(name = "id") long id) {
		//this is return line foroyersUser
		return loyerUserService.searchById(id);
	}

	@PutMapping("/updateLoyersUser/{id}")
	public LoyerUser update(@PathVariable(name = "id") Long id, @RequestBody LoyerUser loyerUser) {
		loyerUser.setId(id);
		//this is return line update
		return loyersUserRepository.save(loyerUser);
	}

	@PostMapping("/addLoyersUser")
	public LoyerUser save(@RequestBody LoyerUser loyerUser) {
		//this is return line save
		return loyerUserService.AddLoyerUser(loyerUser);
	}

	@DeleteMapping("/deleteLoyerUser/{id}")
	public void deleteLoyerUser(@PathVariable(name = "id") Long id) {
		loyerUserService.deleteLoyerUser(id);
	}
}
