package com.in.model;

public class Order {

	private Integer id;
	private String item;
	public Order(Integer id, String item) {
		super();
		this.id = id;
		this.item = item;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", item=" + item + "]";
	}
	
}
