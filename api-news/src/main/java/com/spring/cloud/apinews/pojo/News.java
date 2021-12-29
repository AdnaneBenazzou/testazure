package com.spring.cloud.apinews.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {
	private int id;
	private String title;
	private String detail;
	private int authorId;
	private int categoryId;

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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public News(int id, String title, String detail, int authorId, int categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.detail = detail;
		this.authorId = authorId;
		this.categoryId = categoryId;
	}
	
	

}
