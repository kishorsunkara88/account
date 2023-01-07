package com.example.account.entity;

public class Account {
	String accno;
	String fname;
	String lname;
	public Account(String accno, String fname, String lname, String appno) {
		super();
		this.accno = accno;
		this.fname = fname;
		this.lname = lname;
		this.appno = appno;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAppno() {
		return appno;
	}
	public void setAppno(String appno) {
		this.appno = appno;
	}
	String appno;
}
