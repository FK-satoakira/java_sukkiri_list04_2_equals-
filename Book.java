package list_04_practice;

import java.util.Date;

public class Book implements Cloneable, Comparable<Book> {
	private String title;
	private Date publishDate;
	private String comment;
	private int number = 0;
//	public boolean equals(Object o) {
//		if(o == null)return false;
//		if(o == this)return true;
//		if(!(o instanceof Book)) return false;
//		Book b = (Book) o;
//		if(!this.publishDate.equals(b.publishDate) || (!this.title.equals(b.title))) {
//			return false;
//		}
//		return true;
//	}

	public int hashCode() {
		final int prime = 31;
		int result = 37;
//		result = prime * result + comment.hashCode();
//		result = prime * result + publishDate.hashCode();
//		result = prime * result + title.hashCode();
		result = prime * result * number;


		return result;

	}
	public int compareTo(Book b) {/*ここでエラー。謎？*/
		return this.publishDate.compareTo(b.publishDate);
//		if(this.number < b.number) {
//        	return -1;
//        }
//        if(this.number > b.number) {
//        	return 1;
//        }
//        return 0;
	}
	public Book clone() {
		Book cloneBook = new Book();
		cloneBook.title = this.title;
		cloneBook.publishDate = new Date();
		cloneBook.comment = this.comment;
		return cloneBook;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", publishDate=" + publishDate + ", comment=" + comment + "]";
//	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", publishDate=" + publishDate + ", comment=" + comment + ", number=" + number
				+ "]";
	}

}
