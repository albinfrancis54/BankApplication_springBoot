package com.quinnox.bankapp.dao;

import java.util.List;

import com.quinnox.bankapp.entites.AddNews;

public interface NewsDao {

	public boolean addNews(AddNews add);
	
	public List<AddNews> getAllNews();
}
