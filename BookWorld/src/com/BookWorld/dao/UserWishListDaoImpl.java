package com.BookWorld.dao;

import com.BookWorld.model.BookDetail;
import com.BookWorld.model.UserWishList;
import com.BookWorld.util.HibernateUtil;

public class UserWishListDaoImpl implements UserWishListDao {

	HibernateUtil hibernateUtil =  new HibernateUtil();
	
	@Override
	public String addToWishList(UserWishList userwishList) {

		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(userwishList);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "Success";

	}

	@Override
	public boolean checkWishList(int userId,int bookId) {
	
		boolean isBookExistInWishList = false;
		hibernateUtil.openCurrentSessionwithTransaction();
		UserWishList userFavouriteList = (UserWishList) hibernateUtil.getCurrentSession().createQuery("from UserWishList where userId='"+userId+"' and bookId='"+bookId+"'").uniqueResult();
		hibernateUtil.closeCurrentSessionwithTransaction();
		if(userFavouriteList!= null) {
			isBookExistInWishList = true;
		}
		return isBookExistInWishList;
	
	}

	@Override
	public BookDetail getBookDetail(int bookId) {
	
		hibernateUtil.openCurrentSessionwithTransaction();
		BookDetail bookDetail = (BookDetail) hibernateUtil.getCurrentSession().createQuery("from BookDetail where bookId='"+bookId+"'").uniqueResult();
		hibernateUtil.closeCurrentSessionwithTransaction();
		return bookDetail;
	}
	
}
