package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   // to make entity 

@Table(name = "notes")    // to make table named notes
public class Note {
	@Id       // to give primary key to id
	private int id;
	private String title;
	@Column(length = 1500)
	private String content;
	private Date addedDate;     //for date

	
	//getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	//constructor 
	
	public Note(String title, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(100000);     //will make unique id for every entry
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
