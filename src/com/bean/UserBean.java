package com.bean;

public class UserBean {
  //private String sqeNo;
  private String seqNo;
  private String name;
  private String sex;
  //private String brith;
  private String birth;
  public UserBean() {
	// TODO Auto-generated constructor stub
}
public UserBean(String seqNo, String name, String sex, String birth) {
	 
	this.seqNo = seqNo;
	this.name = name;
	this.sex = sex;
	this.birth = birth;
}
public String getSeqNo() {
	return seqNo;
}
public void setSeqNo(String seqNo) {
	this.seqNo = seqNo;
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
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
  
}
