package org.springframework.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.dao.UserDao;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class UserService {

	@Autowired
	UserDao userDao;


	@Transactional
	public void updateUser(){
		userDao.updateAccount(2);
		userDao.saveErrorUser();
	}

	public void saveUser(){
		userDao.saveUser(UUID.randomUUID().toString().substring(0,15), ThreadLocalRandom.current().nextInt(99));
	}
}
