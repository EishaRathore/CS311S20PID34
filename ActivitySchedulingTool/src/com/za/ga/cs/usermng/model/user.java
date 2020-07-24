package com.za.ga.cs.usermng.model;

public class user {
	private int id;
	 private String  role,first, last,email,password,cpassword,mblnumber;
	 
	 
	public user() {
		super();
	}
	public user(int id, String role, String first, String last, String email, String password, String cpassword,
			String mblnumber) {
		super();
		this.id = id;
		this.role = role;
		this.first = first;
		this.last = last;
		this.email = email;
		this.password = password;
		this.cpassword = cpassword;
		this.mblnumber = mblnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getMblnumber() {
		return mblnumber;
	}
	public void setMblnumber(String mblnumber) {
		this.mblnumber = mblnumber;
	}
	
}
