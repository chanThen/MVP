package com.BookWorld.controller;

import java.io.UnsupportedEncodingException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.BookWorld.model.BookDetail;
import com.BookWorld.model.UserWishList;
import com.BookWorld.service.UserWishListService;
import com.BookWorld.service.UserWishListServiceImpl;

@Path("/wishList")
public class UserWishListController {
	
	UserWishListService userWishListService = new UserWishListServiceImpl();
	
	@Path("/addToWishList")
	@POST
	@Produces("application/json")
	public String addToWishList(@QueryParam("bookId") int bookId,
								@QueryParam("userId")int userId) {
		
		UserWishList userWishList = new UserWishList();
		
		boolean isBookExistInWishList = checkWishList(bookId,userId);
		
		if (isBookExistInWishList == false) {
		
			BookDetail bookDetail = new BookDetail();
			bookDetail = getBookDetail(bookId);
			userWishList.setBookDetail(bookDetail);
			userWishList.setUserId(userId);
			return userWishListService.addToWishList(userWishList);
		} else {
			return "failure";
		}
	}
	
	public boolean checkWishList( int bookId, int userId) {
		return userWishListService.checkWishList(userId,bookId);
	}

	private BookDetail getBookDetail(int bookId) {
		return userWishListService.getBookDetail(bookId);
	}
	
}




			
		
	
