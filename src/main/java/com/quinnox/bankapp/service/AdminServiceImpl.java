package com.quinnox.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.bankapp.dao.AdminDao;
import com.quinnox.bankapp.entites.Logins;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao dao;
	@Override
	public boolean addLogins(Logins login) {
		return dao.addLogins(login);
	}
	
	@Override
	public List<Logins> getAllLogins() {
		return dao.getAllLogins();
	}

}
