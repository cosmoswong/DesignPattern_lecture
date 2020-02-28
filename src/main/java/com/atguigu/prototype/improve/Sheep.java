package com.atguigu.prototype.improve;




public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	private String address = "钂欏彜缇�";
	public Sheep friend; //鏄璞�, 鍏嬮殕鏄細濡備綍澶勭悊
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}
	//鍏嬮殕璇ュ疄渚嬶紝浣跨敤榛樿鐨刢lone鏂规硶鏉ュ畬鎴�
	@Override
	protected Object clone()  {
		
		Sheep sheep = null;
		try {
			sheep = (Sheep)super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		return sheep;
	}
	
	
}
