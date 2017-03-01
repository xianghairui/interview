package com.uso.xianghariui.entity;

import java.io.Serializable;

/**
 * 
 * <p>ClassName:TlUser</p>
 * <p>Description: 用户类</p>
 * <p></p>
 * @author hairui
 * @date 2017年2月27日 下午4:29:27
 */
public class TlUser implements Serializable {
	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 地址
	 */
	private String adress;

	private static final long serialVersionUID = 1L;

	public TlUser() {
		super();
	}

	public TlUser(Long id, String username, String gender, Integer age, String adress) {
		super();
		this.id = id;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.adress = adress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "TlUser [id=" + id + ", username=" + username + ", gender=" + gender + ", age=" + age + ", adress="
				+ adress + "]";
	}

}