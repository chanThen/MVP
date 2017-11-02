package com.BookWorld.service;

import com.BookWorld.model.BookDetail;
import com.BookWorld.model.UserWishList;

public interface UserWishListService {

	String addToWishList(UserWishList userwishList);

	boolean checkWishList(int userId,int bookId);

	BookDetail getBookDetail(int bookId);

}
