package domain;

import java.util.Date;

public class Picture {
	public String pictureName;
	public String pictureAuthor;
	public double price;
	public Date inputDate;
		
	public Picture(String pictureName, String pictureAuthor, double price, Date inputDate) throws Exception {
		if(pictureName.trim().equals("")) throw new Exception();
		if(price < 0) throw new Exception();
		if(inputDate == null) throw new Exception();
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;
		this.price = price;
		this.inputDate = inputDate;
	}
	
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public String getPictureAuthor() {
		return pictureAuthor;
	}
	public void setPictureAuthor(String pictureAuthor) {
		this.pictureAuthor = pictureAuthor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

			
}
