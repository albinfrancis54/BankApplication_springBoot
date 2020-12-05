package com.quinnox.bankapp.dao;

import java.util.List;

import com.quinnox.bankapp.entites.Logins;

public interface AdminDao {

	 public boolean addLogins(Logins login);

	 public List<Logins> getAllLogins();
	
}
