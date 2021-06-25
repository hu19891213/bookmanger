package com.lyx.bookmanager.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Reader {
    private int readerId;
    private String name;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private String address;
    private String telcode;
	public Reader() {
		super();
	}
	public Reader(int readerId, String name, String sex, Date birth, String address, String telcode) {
		super();
		this.readerId = readerId;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.address = address;
		this.telcode = telcode;
	}
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelcode() {
		return telcode;
	}
	public void setTelcode(String telcode) {
		this.telcode = telcode;
	}
    
}
