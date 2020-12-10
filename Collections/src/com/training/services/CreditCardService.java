package com.training.services;

import java.util.*;

import com.training.ifaces.DataAccess;
import com.training.model.CreditCard;
import com.training.utils.CardNumberComparator;
public class CreditCardService implements DataAccess<CreditCard> {
	
	
	private List<CreditCard> cardList;
	
	public CreditCardService() {
		this.cardList = new ArrayList<>();
	}


	@Override
	public boolean add(CreditCard t) {
		// TODO Auto-generated method stub
		return this.cardList.add(t);
	}

	

	@Override
	public CreditCard findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreditCard> findAll() {
		// TODO Auto-generated method stub
		return this.cardList;
	}


	@Override
	public  List<CreditCard> sortList(String sortBy) {
		// TODO Auto-generated method stub
		switch(sortBy){
		case "cardHolderName":
			Collections.sort(this.cardList);
			break;
		case "cardNumber":
			Collections.sort(this.cardList, new CardNumberComparator());
			break;	
		default:
			break;
		
			
		
		
		}	
		return this.cardList;
		
	
	}
	
	
	
	}