package com.bookmanager.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Record {
    private long sernum;
    private long bookId;
    private int readerId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lendDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date backDate;
	public Record() {
		super();
	}
	public Record(long sernum, long bookId, int readerId, Date lendDate, Date backDate) {
		super();
		this.sernum = sernum;
		this.bookId = bookId;
		this.readerId = readerId;
		this.lendDate = lendDate;
		this.backDate = backDate;
	}
	public long getSernum() {
		return sernum;
	}
	public void setSernum(long sernum) {
		this.sernum = sernum;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}
	public Date getBackDate() {
		return backDate;
	}
	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}
    
}
