/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;



	public void setStudentId(int id) {
		this.studentId = id;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public void setCompanyName(String company) {
		this.companyName = company;
	}

	public void setClassName(String cName) {
		this.className = cName;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}



	public int getStudentId() {
		return this.studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public String getClassName() {
		return this.className;
	}

	public String getMail() {
		return this.mail;
	}

	public String getPassword() {
		return this.password;
	}

}
