package com.quinnox.bankapp.service;

import java.util.List;

import com.quinnox.bankapp.entites.AddNews;

public interface NewsService {

	public boolean addNews(AddNews add);
	 
	 public List<AddNews> getAllNews(); 
}
