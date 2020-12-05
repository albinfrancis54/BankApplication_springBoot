package com.quinnox.bankapp.service;

import java.util.List;

import com.quinnox.bankapp.entites.Logins;

public interface AdminService {

	 public boolean addLogins(Logins login);

	 public List<Logins> getAllLogins();
	
}
