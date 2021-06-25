package com.lyx.bookmanager.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private long bookId;
    private String name;
    private String author;
    private String publish;
    private String isbn;
    private String introduction;
    private String language;
    private BigDecimal price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pubdate;
    private int classId; //分类号
    private int pressmark; //书架号
    private int state;
	public Book() {
		super();
	}
	public Book(long bookId, String name, String author, String publish, String isbn, String introduction,
			String language, BigDecimal price, Date pubdate, int classId, int pressmark, int state) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.publish = publish;
		this.isbn = isbn;
		this.introduction = introduction;
		this.language = language;
		this.price = price;
		this.pubdate = pubdate;
		this.classId = classId;
		this.pressmark = pressmark;
		this.state = state;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getPressmark() {
		return pressmark;
	}
	public void setPressmark(int pressmark) {
		this.pressmark = pressmark;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
    
}
