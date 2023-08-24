package Loyers.service;

import java.util.List;

import Loyers.model.LoyerProfil;
import Loyers.model.LoyerUser;

public interface LoyerUserService {
	
	LoyerUser AddLoyerUser(LoyerUser loyerUser);
	List<LoyerUser> findAll();
	LoyerUser searchById(long id);
	void deleteLoyerUser(long id);

}
