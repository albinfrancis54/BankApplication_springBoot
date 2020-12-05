package com.quinnox.bankapp.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.quinnox.bankapp.entites.AddNews;
import com.quinnox.bankapp.entites.Beneficiary;
import com.quinnox.bankapp.entites.Customers;
import com.quinnox.bankapp.entites.Greviance;
import com.quinnox.bankapp.entites.Logins;
import com.quinnox.bankapp.entites.Transactions;

import lombok.Data;

@Component
@Data
public class ResponseData {
//			private String msg;
//			private Object data;
		
			private int statusCode;
			private String message;
			private String description;
			private List<AddNews> news;
			private List<Beneficiary>beneficiary;
			private List<Greviance>greviance;
			private List<Logins>login;
			private List<Transactions>transaction;
			private List<Customers>customer;
	
}
