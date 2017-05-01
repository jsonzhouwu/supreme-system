package com.lin.domain;


public class User {
	private String id;  
    private String name;  
    private String code;  
    private String sex;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  id+":"+name+":"+sex+":"+code;
	}
    
    
	
    
	
}
