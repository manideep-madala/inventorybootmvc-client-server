package com.dxctraining.inventorymgt.dto;

public class SupplierDto {
	
	private int id;
	private String name;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		SupplierDto that =(SupplierDto)o;
		return this.id == that.id;
	}
	@Override
	public int hashCode() {
		return id;
	}

}
