package com.BookWorld.dao;

import com.BookWorld.model.BookDetail;
import com.BookWorld.model.UserWishList;

public interface UserWishListDao {

	String addToWishList(UserWishList userwishList);

	boolean checkWishList(int userId,int bookId);

	BookDetail getBookDetail(int bookId);

}
