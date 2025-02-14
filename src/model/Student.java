package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="std_tbl1")

public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String pass;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public Student(int id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
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
	public String getpass() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	

}
