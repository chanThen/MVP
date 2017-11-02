package com.BookWorld.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_Whishlist")
public class BookReview {

	private int bookReviewId;
	
	private int bookId;
	
	private int userId;
	
	private String bookComment;
	
	public int getBookReviewId() {
		return bookReviewId;
	}

	public void setBookReviewId(int bookReviewId) {
		this.bookReviewId = bookReviewId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getBookComment() {
		return bookComment;
	}

	public void setBookComment(String bookComment) {
		this.bookComment = bookComment;
	}

	public int getBookRating() {
		return bookRating;
	}

	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}

	private int bookRating;
}
