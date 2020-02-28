package com.atguigu.spring.bean;

/**
 * 娉ㄩ噴
 * @author Administrator
 *
 */
public class Monster {

	private Integer id = 10 ;
	private String nickname = "鐗涢瓟鐜�";
	private String skill = "鑺晧鎵�";
	public Monster() {
		
		System.out.println("monster 鍒涘缓..");
	}
	public Monster(Integer id, String nickname, String skill) {
		//System.out.println("Integer id, String nickname, String skill琚皟鐢�");
		this.id = id;
		this.nickname = nickname;
		this.skill = skill;
	}
	
	public Monster( String nickname, String skill,Integer id) {
		
		this.id = id;
		this.nickname = nickname;
		this.skill = skill;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Monster [id=" + id + ", nickname=" + nickname + ", skill="
				+ skill + "]";
	}
	
	
}
