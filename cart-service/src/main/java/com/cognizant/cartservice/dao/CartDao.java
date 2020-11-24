package com.cognizant.cartservice.dao;

import java.util.ArrayList;

import com.cognizant.cartservice.exception.CartNotFoundException;
import com.cognizant.cartservice.exception.SweetItemNotFoundException;
import com.cognizant.cartservice.model.SweetItem;

public interface CartDao {

	// to add item in given user cart
	void addCartItem(int userId, int sweetItemId)throws SweetItemNotFoundException;

	// fetch all items in given user cart
	ArrayList<SweetItem> getAllCartItems(int userId)throws CartNotFoundException;

	// delete item from given user and cart
	void deleteCartItem(int userId, int sweetItemId) throws SweetItemNotFoundException;
}