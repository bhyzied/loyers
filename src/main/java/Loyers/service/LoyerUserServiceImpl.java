package Loyers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Loyers.model.LoyerUser;
import Loyers.repository.LoyersUserRepository;

@Service
public class LoyerUserServiceImpl implements LoyerUserService {

	@Autowired
	LoyersUserRepository loyersUserRepository;

	@Override
	public LoyerUser AddLoyerUser(LoyerUser loyerUser) {
		return loyersUserRepository.save(loyerUser);
	}

	@Override
	public List<LoyerUser> findAll() {
		return loyersUserRepository.findAll();
	}

	@Override
	public LoyerUser searchById(long id) {
		return loyersUserRepository.findById(id).get();
	}

	@Override
	public void deleteLoyerUser(long id) {
		loyersUserRepository.deleteById(id);
	}
}
