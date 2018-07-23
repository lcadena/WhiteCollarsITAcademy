package applicationDTO;

import java.util.Date;

import domain.Picture;

public class PictureDTO {
	public String pictureName;
	public String pictureAuthor;
	public double price;
	public Date inputDate;
	
	public PictureDTO(Picture p) {
		this.pictureName = p.getPictureName();
		this.pictureAuthor = p.getPictureAuthor();
		this.price = p.getPrice();
		this.inputDate = p.getInputDate();
	}
	
	
	
	
}
