package com.myjavaPack;
public class Post {
	private int id;
	private String content;
	private String answers;

	public Post(int id, String content, String answers) {
		this.id=id;
		this.content=content;
		this.answers=answers;
	}
	public int getId() {
		return this.id;
	}
	public void setId (int id) {
		this.id=id;
	}
	public String getContent() {
		return this.content;
	}
	public void getContent(String content) {
		this.content=content;
	}
	public String getAnswers() {
		return this.answers;
	}
	public void setAnswers(String answers) {
		this.answers=answers;
	}
}
