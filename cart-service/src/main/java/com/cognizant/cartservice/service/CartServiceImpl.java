package com.cognizant.cartservice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.cartservice.dao.CartDaoImpl;
import com.cognizant.cartservice.exception.CartNotFoundException;
import com.cognizant.cartservice.exception.SweetItemNotFoundException;
import com.cognizant.cartservice.model.SweetItem;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDaoImpl cartDaoImpl;

	@Override
	public void addCartItem(int userId, int sweetItemId) throws SweetItemNotFoundException {

		cartDaoImpl.addCartItem(userId, sweetItemId);

	}

	@Override
	public ArrayList<SweetItem> getAllCartItems(int userId) throws CartNotFoundException{

		return cartDaoImpl.getAllCartItems(userId);
	}

	@Override
	public void deleteCartItem(int userId, int sweetItemId) throws SweetItemNotFoundException{

		cartDaoImpl.deleteCartItem(userId, sweetItemId);
	}

}